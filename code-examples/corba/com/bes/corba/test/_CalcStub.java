package com.bes.corba.test;


/**
* com/bes/corba/test/_CalcStub.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从Hello.idl
* 2018年10月26日 星期五 上午03时30分11秒 CST
*/

public class _CalcStub extends org.omg.CORBA.portable.ObjectImpl implements com.bes.corba.test.Calc
{

  public void add (int a, int b, org.omg.CORBA.IntHolder c)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("add", true);
                $out.write_long (a);
                $out.write_long (b);
                $in = _invoke ($out);
                c.value = $in.read_long ();
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                add (a, b, c        );
            } finally {
                _releaseReply ($in);
            }
  } // add

  public void sub (int a, int b, org.omg.CORBA.IntHolder c)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("sub", true);
                $out.write_long (a);
                $out.write_long (b);
                $in = _invoke ($out);
                c.value = $in.read_long ();
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                sub (a, b, c        );
            } finally {
                _releaseReply ($in);
            }
  } // sub

  public void multi (int a, int b, org.omg.CORBA.IntHolder c)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("multi", true);
                $out.write_long (a);
                $out.write_long (b);
                $in = _invoke ($out);
                c.value = $in.read_long ();
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                multi (a, b, c        );
            } finally {
                _releaseReply ($in);
            }
  } // multi

  public void div (int a, int b, org.omg.CORBA.IntHolder c)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("div", true);
                $out.write_long (a);
                $out.write_long (b);
                $in = _invoke ($out);
                c.value = $in.read_long ();
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                div (a, b, c        );
            } finally {
                _releaseReply ($in);
            }
  } // div

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:com/bes/corba/test/Calc:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _CalcStub

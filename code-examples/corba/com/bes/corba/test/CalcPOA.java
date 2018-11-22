package com.bes.corba.test;


/**
* com/bes/corba/test/CalcPOA.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从Hello.idl
* 2018年10月26日 星期五 上午03时30分11秒 CST
*/

public abstract class CalcPOA extends org.omg.PortableServer.Servant
 implements com.bes.corba.test.CalcOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("add", new java.lang.Integer (0));
    _methods.put ("sub", new java.lang.Integer (1));
    _methods.put ("multi", new java.lang.Integer (2));
    _methods.put ("div", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // com/bes/corba/test/Calc/add
       {
         int a = in.read_long ();
         int b = in.read_long ();
         org.omg.CORBA.IntHolder c = new org.omg.CORBA.IntHolder ();
         this.add (a, b, c);
         out = $rh.createReply();
         out.write_long (c.value);
         break;
       }

       case 1:  // com/bes/corba/test/Calc/sub
       {
         int a = in.read_long ();
         int b = in.read_long ();
         org.omg.CORBA.IntHolder c = new org.omg.CORBA.IntHolder ();
         this.sub (a, b, c);
         out = $rh.createReply();
         out.write_long (c.value);
         break;
       }

       case 2:  // com/bes/corba/test/Calc/multi
       {
         int a = in.read_long ();
         int b = in.read_long ();
         org.omg.CORBA.IntHolder c = new org.omg.CORBA.IntHolder ();
         this.multi (a, b, c);
         out = $rh.createReply();
         out.write_long (c.value);
         break;
       }

       case 3:  // com/bes/corba/test/Calc/div
       {
         int a = in.read_long ();
         int b = in.read_long ();
         org.omg.CORBA.IntHolder c = new org.omg.CORBA.IntHolder ();
         this.div (a, b, c);
         out = $rh.createReply();
         out.write_long (c.value);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:com/bes/corba/test/Calc:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Calc _this() 
  {
    return CalcHelper.narrow(
    super._this_object());
  }

  public Calc _this(org.omg.CORBA.ORB orb) 
  {
    return CalcHelper.narrow(
    super._this_object(orb));
  }


} // class CalcPOA

package com.bes.corba.test;


/**
* com/bes/corba/test/CalcHelper.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从Hello.idl
* 2018年10月26日 星期五 上午03时30分11秒 CST
*/

abstract public class CalcHelper
{
  private static String  _id = "IDL:com/bes/corba/test/Calc:1.0";

  public static void insert (org.omg.CORBA.Any a, com.bes.corba.test.Calc that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static com.bes.corba.test.Calc extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (com.bes.corba.test.CalcHelper.id (), "Calc");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static com.bes.corba.test.Calc read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_CalcStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, com.bes.corba.test.Calc value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static com.bes.corba.test.Calc narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof com.bes.corba.test.Calc)
      return (com.bes.corba.test.Calc)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      com.bes.corba.test._CalcStub stub = new com.bes.corba.test._CalcStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static com.bes.corba.test.Calc unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof com.bes.corba.test.Calc)
      return (com.bes.corba.test.Calc)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      com.bes.corba.test._CalcStub stub = new com.bes.corba.test._CalcStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}

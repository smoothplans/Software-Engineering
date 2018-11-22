package com.bes.corba.test;

/**
* com/bes/corba/test/CalcHolder.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从Hello.idl
* 2018年10月26日 星期五 上午03时30分11秒 CST
*/

public final class CalcHolder implements org.omg.CORBA.portable.Streamable
{
  public com.bes.corba.test.Calc value = null;

  public CalcHolder ()
  {
  }

  public CalcHolder (com.bes.corba.test.Calc initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.bes.corba.test.CalcHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.bes.corba.test.CalcHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.bes.corba.test.CalcHelper.type ();
  }

}

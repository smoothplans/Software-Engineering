package com.bes.corba.test;


/**
* com/bes/corba/test/CalcOperations.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从Hello.idl
* 2018年10月26日 星期五 上午03时30分11秒 CST
*/

public interface CalcOperations 
{
  void add (int a, int b, org.omg.CORBA.IntHolder c);
  void sub (int a, int b, org.omg.CORBA.IntHolder c);
  void multi (int a, int b, org.omg.CORBA.IntHolder c);
  void div (int a, int b, org.omg.CORBA.IntHolder c);
} // interface CalcOperations

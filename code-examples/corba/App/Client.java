package com.bes.corba.test;

import org.omg.CORBA.IntHolder;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

import com.bes.corba.test.Calc;
import com.bes.corba.test.CalcHelper;

public class Client {
    public static void main(String[] args) throws Exception{
        /*
         * ORB 初始化。
         */
        ORB orb=ORB.init(args,null);
        
        /*
         * 获取命名服务。
         */
        org.omg.CORBA.Object objRef=orb.resolve_initial_references("NameService");
        NamingContextExt ncRef=NamingContextExtHelper.narrow(objRef);
        
        /*
         * 从命名服务中查找相应的对象引用，并进行类型转型。
         */
        
        String name="Calc";
        Calc calc=CalcHelper.narrow(ncRef.resolve_str(name));
        
        /*
         * 调用对象的方法。
         */
        IntHolder result=new IntHolder();
        
        calc.add(1,2,result);
        System.out.printf("1+2=%d\n",result.value);
    }
}
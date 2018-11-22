package com.bes.corba.test;

import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

import com.bes.corba.test.Calc;
import com.bes.corba.test.CalcHelper;
import com.bes.corba.impl.CalculatorImpl;

public class Server {
    public static void main(String[] args) throws Exception{
        /*
         * ORB 初始化。
         */
        ORB orb=ORB.init(args,null);
        
        /*
         * 获取根POA并初始化。
         */
        POA rootPoa=POAHelper.narrow(orb.resolve_initial_references("RootPOA") );
        rootPoa.the_POAManager().activate();
        
        /*
         * 构建一个CalculatorImpl。
         */
        CalculatorImpl calculatorImpl=new CalculatorImpl();
        
        /*
         * 将Servant注册到RootPOA中，建立Servant到Object Reference的相互映射，
         * 注意这里具体行为跟RootPOA的POA Policy有关。
         */
        org.omg.CORBA.Object ref=rootPoa.servant_to_reference(calculatorImpl);
        Calc iref=CalcHelper.narrow(ref);
        
        /*
         * 获取命名服务。
         */
        org.omg.CORBA.Object objRef=orb.resolve_initial_references("NameService");
        NamingContextExt ncRef= NamingContextExtHelper.narrow(objRef);
        
        /*
         * 将对象引用以相应的名字发布到命名服务中。
         */
        String name="Calc";
        NameComponent path[] = ncRef.to_name(name);
        ncRef.rebind(path,iref);
        
        System.out.println("Calculator server ready...");
        
        /*
         * 阻塞直到ORB关闭。
         */
        orb.run();
    }
}
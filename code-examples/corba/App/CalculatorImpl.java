package com.bes.corba.impl;

import org.omg.CORBA.IntHolder;

import com.bes.corba.test.CalcPOA;

public class CalculatorImpl extends CalcPOA{

    @Override
    public void add(int a, int b, IntHolder c) {
        c.value=a+b;
    }

    @Override
    public void sub(int a, int b, IntHolder c) {
        c.value=a-b;
    }

    @Override
    public void multi(int a, int b, IntHolder c) {
        c.value=a*b;
    }

    @Override
    public void div(int a, int b, IntHolder c) {
        c.value=a/b;
    }
}
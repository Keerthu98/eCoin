package com.example.vicky.e_coin;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AtmTransTest {

    @Test
    public void pinCheck() {
        String result;
        if (AtmTrans.pinCheck(0000))
            result="Invalid pin";
        else
            result="Valid pin";
        assertThat(result,is("Valid pin"));
    }
    @Test
    public void Test1() {
        String result;
        if (AtmTrans.pinCheck(1211))
            result="Invalid pin";
        else
            result="Valid pin";
        assertThat(result,is("Valid pin"));
    }

    @Test
    public void Test2() {
        String result;
        if (AtmTrans.pinCheck(10000))
            result="Invalid pin";
        else
            result="Valid pin";
        assertThat(result,is("Invalid pin"));
    }
}
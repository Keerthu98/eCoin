package com.example.vicky.e_coin;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class UpiIdTransTest {

    private static final String FAKE_STRING = "Valid";
    private static final String FAIL_STRING = "Invalid";


    @Test
    public void upiCheck1() {
        String result;
        if(UpiIdTrans.upiCheck("word@word"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }

    @Test
    public void upiCheck2() {
        String result;
        if(UpiIdTrans.upiCheck("123@word"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }
    @Test
    public void upiCheck3() {
        String result;
        if(UpiIdTrans.upiCheck("123@123"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }
    @Test
    public void upiCheck4() {
        String result;
        if(UpiIdTrans.upiCheck("123@"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void upiCheck5() {
        String result;
        if(UpiIdTrans.upiCheck("@"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void upiCheck6() {
        String result;
        if(UpiIdTrans.upiCheck("word@123"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }
    @Test
    public void upiCheck7() {
        String result;
        if(UpiIdTrans.upiCheck(""))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void upiCheck8() {
        String result;
        if(UpiIdTrans.upiCheck("word@word@word"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void upiCheck9() {
        String result;
        if(UpiIdTrans.upiCheck("@word"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
}
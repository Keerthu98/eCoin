package com.example.vicky.e_coin;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MoneytransTest {

    private static final String FAKE_STRING = "Valid";
    private static final String FAIL_STRING = "Invalid";
    @Test
    public void phoneCheck1() {
        String result;
        if(Moneytrans.phoneCheck("1234567890"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void phoneCheck2() {
        String result;
        if(Moneytrans.phoneCheck("2245634989"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }
    @Test
    public void phoneCheck3() {
        String result;
        if(Moneytrans.phoneCheck("9024563489"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void phoneCheck4() {
        String result;
        if(Moneytrans.phoneCheck("224563t989"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void phoneCheck5() {
        String result;
        if(Moneytrans.phoneCheck("224563345989"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void phoneCheck6() {
        String result;
        if(Moneytrans.phoneCheck("9224563489"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }
    @Test
    public void phoneCheck7() {
        String result;
        if(Moneytrans.phoneCheck("2245"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void upiCheck1() {
        String result;
        if(Moneytrans.upiCheck("word@word"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }

    @Test
    public void upiCheck2() {
        String result;
        if(Moneytrans.upiCheck("123@word"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }
    @Test
    public void upiCheck3() {
        String result;
        if(Moneytrans.upiCheck("123@123"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }
    @Test
    public void upiCheck4() {
        String result;
        if(Moneytrans.upiCheck("123@"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void upiCheck5() {
        String result;
        if(Moneytrans.upiCheck("@"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void upiCheck6() {
        String result;
        if(Moneytrans.upiCheck("word@123"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }
    @Test
    public void upiCheck7() {
        String result;
        if(Moneytrans.upiCheck(""))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void upiCheck8() {
        String result;
        if(Moneytrans.upiCheck("word@word@word"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void upiCheck9() {
        String result;
        if(Moneytrans.upiCheck("@word"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
}
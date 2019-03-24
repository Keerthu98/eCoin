package com.example.vicky.e_coin;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PhoneTransTest {

    private static final String FAKE_STRING = "Valid";
    private static final String FAIL_STRING = "Invalid";

    @Test
    public void phoneCheck1() {
        String result;
        if(Phonetrans.phoneCheck("1234567890"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void phoneCheck2() {
        String result;
        if(Phonetrans.phoneCheck("2245634989"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }
    @Test
    public void phoneCheck3() {
        String result;
        if(Phonetrans.phoneCheck("9024563489"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void phoneCheck4() {
        String result;
        if(Phonetrans.phoneCheck("224563t989"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void phoneCheck5() {
        String result;
        if(Phonetrans.phoneCheck("224563345989"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void phoneCheck6() {
        String result;
        if(Phonetrans.phoneCheck("9224563489"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }
    @Test
    public void phoneCheck7() {
        String result;
        if(Phonetrans.phoneCheck("2245"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
}
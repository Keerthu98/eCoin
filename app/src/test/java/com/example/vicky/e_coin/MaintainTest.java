package com.example.vicky.e_coin;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MaintainTest {

    private static final String FAKE_STRING = "Valid";
    private static final String FAIL_STRING = "Invalid";

    @Test
    public void mail_check() {
        String result;
        if (Maintain.mailCheck("name@email.com"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));
    }
    @Test
    public void Test2(){
        String result;
        if(Maintain.mailCheck("name@email.in.in"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));
    }

    @Test
    public void Test3(){
        String result;
        if(Maintain.mailCheck("name@email"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));
    }

    @Test
    public void Test4(){
        String result;
        if(Maintain.mailCheck("name@email..com"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));
    }

    @Test
    public void test5(){
        String result;
        if(Maintain.mailCheck("@email.com"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));
    }

    @Test
    public void test6(){
        String result;
        if(Maintain.mailCheck(""))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));
    }



    @Test
    public void phone_check1() {
        String result;
        if(Maintain.phoneCheck("1234567890"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void phone_check2() {
        String result;
        if(Maintain.phoneCheck("2245634989"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }
    @Test
    public void phone_check3() {
        String result;
        if(Maintain.phoneCheck("9024563489"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void phone_check4() {
        String result;
        if(Maintain.phoneCheck("224563t989"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void phone_check5() {
        String result;
        if(Maintain.phoneCheck("224563345989"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void phone_check6() {
        String result;
        if(Maintain.phoneCheck("9224563489"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }
    @Test
    public void phone_check7() {
        String result;
        if(Maintain.phoneCheck("2245"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }


    @Test
    public void upi_check1() {
        String result;
        if(Maintain.upiCheck("word@word"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }

    @Test
    public void upi_check2() {
        String result;
        if(Maintain.upiCheck("123@word"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }
    @Test
    public void upi_check3() {
        String result;
        if(Maintain.upiCheck("123@123"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }
    @Test
    public void upi_check4() {
        String result;
        if(Maintain.upiCheck("123@"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void upi_check5() {
        String result;
        if(Maintain.upiCheck("@"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void upi_check6() {
        String result;
        if(Maintain.upiCheck("word@123"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }
    @Test
    public void upi_check7() {
        String result;
        if(Maintain.upiCheck(""))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void upi_check8() {
        String result;
        if(Maintain.upiCheck("word@word@word"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void upi_check9() {
        String result;
        if(Maintain.upiCheck("@word"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
}
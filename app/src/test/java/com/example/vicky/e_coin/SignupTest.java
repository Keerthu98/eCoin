package com.example.vicky.e_coin;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SignupTest {

    private static final String FAKE_STRING = "Valid mail";
    private static final String FAIL_STRING = "Invalid";
    @Test
    public void Test1() {
        String result="";
        if (Signup.emailvalidate("name@email.com","Keerthana"))
            result="Valid mail";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));
    }

    @Test
    public void Test2(){
        String result;
        if(Signup.emailvalidate("name@email.in.in","Keerthana"))
            result="Valid mail";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));
    }

    @Test
    public void Test3(){
        String result;
        if(Signup.emailvalidate("name@email","Keerthana"))
            result="Valid mail";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));
    }

    @Test
    public void Test4(){
        String result;
        if(Signup.emailvalidate("name@email..com","Keerthana"))
            result="Valid mail";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));
    }

    @Test
    public void test5(){
        String result;
        if(Signup.emailvalidate("@email.com","Keerthana"))
            result="Valid mail";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));
    }

    @Test
    public void test6(){
        String result;
        if(Signup.emailvalidate("","Keerthana"))
            result="Valid mail";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));
    }

//    @Test
//    public void test7(){
//        String result;
//        if(Signup.emailvalidate(null,"Keerthana"))
//            result="Valid mail";
//        else
//            result="Invalid";
//        assertThat(result,is(FAIL_STRING));
//    }

    @Test
    public void test_1(){
        String result;
        if(Signup.emailvalidate("name@email.com","Keer"))
            result="Valid mail";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));
    }

    @Test
    public void test_2(){
        String result;
        if(Signup.emailvalidate("name@email.com",""))
            result="Valid mail";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));
    }

    @Test
    public void test_3(){
        String result;
        if(Signup.emailvalidate("name@email.com.com",""))
            result="Valid mail";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));
    }

    @Test
    public void test_4(){
        String result;
        if(Signup.emailvalidate("",""))
            result="Valid mail";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));
    }

//    @Test
//    public void test_5(){
//        String result;
//        if(Signup.emailvalidate(null,null))
//            result="Valid mail";
//        else
//            result="Invalid";
//        assertThat(result,is(FAIL_STRING));
//    }
}
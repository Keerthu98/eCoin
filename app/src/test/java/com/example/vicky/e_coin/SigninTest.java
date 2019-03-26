package com.example.vicky.e_coin;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SigninTest {

    private static final String FAKE_STRING = "Login was successful";


    @Test
    public void Test1() {

        String result = "";
        // ...when the string is returned from the object under test...
        if (Signin.temporary("vicky@admin.com", "admin"))
            result = "Login was successful";

        // ...then the result should be the expected one.
        assertThat(result, is(FAKE_STRING));
    }
    @Test
    public void Test2() {

        String result = "";
        // ...when the string is returned from the object under test...
        if (Signin.temporary("vicky@admin.com", "abcd"))
            result = "";
        else result="Login was successful";

        // ...then the result should be the expected one.
        assertThat(result, is(FAKE_STRING));
    }
    @Test
    public void Test3() {

        String result = "";
        // ...when the string is returned from the object under test...
        if (Signin.temporary("vicky", "abcd"))
            result = "";
        else result="Login was successful";

        // ...then the result should be the expected one.
        assertThat(result, is(FAKE_STRING));
    }
    @Test
    public void Test4() {

        String result = "";
        // ...when the string is returned from the object under test...
        if (Signin.temporary("vicky", "admin"))
            result = "";
        else result="Login was successful";

        // ...then the result should be the expected one.
        assertThat(result, is(FAKE_STRING));
    }

}

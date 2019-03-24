package com.example.vicky.e_coin;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PostpaidTest {

    private static final String FAKE_STRING = "Valid";
    private static final String FAIL_STRING = "Invalid";

    @Test
    public void entryOk() {
        String result;
        if(Postpaid.entryOk("1234567890","Carrier","12345"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));
    }

    @Test
    public void entryOk2() {
        String result;
        if(Postpaid.entryOk("2245634989","Carrier","12345"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }
    @Test
    public void entryOk3() {
        String result;
        if(Postpaid.entryOk("9024563489","Carrier","12345"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void etry_ok4() {
        String result;
        if(Postpaid.entryOk("224563t989","Carrier","12345"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void entryOk5() {
        String result;
        if(Postpaid.entryOk("224563345989","Carrier","12345"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void entryOk6() {
        String result;
        if(Postpaid.entryOk("9224563489","Carrier","12345"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }
    @Test
    public void entryOk7() {
        String result;
        if(Postpaid.entryOk("2245","Carrier","12345"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void entryOk8() {
        String result;
        if(Postpaid.entryOk("1234567890","","12345"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));
    }

    @Test
    public void entryOk9() {
        String result;
        if(Postpaid.entryOk("2245634989","","12345"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void entryOk10() {
        String result;
        if(Postpaid.entryOk("9024563489","","12345"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void entryOk11() {
        String result;
        if(Postpaid.entryOk("224563t989","","12345"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void entryOk12() {
        String result;
        if(Postpaid.entryOk("224563345989","","12345"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void entryOk13() {
        String result;
        if(Postpaid.entryOk("9224563489","","12345"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void entryOk14() {
        String result;
        if(Postpaid.entryOk("2245","","12345"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void entryOk15() {
        String result;
        if(Postpaid.entryOk("1234567890","Carrier",""))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));
    }

    @Test
    public void entryOk16() {
        String result;
        if(Postpaid.entryOk("2245634989","Carrier",""))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void entryOk17() {
        String result;
        if(Postpaid.entryOk("9024563489","Carrier",""))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void entryOk18() {
        String result;
        if(Postpaid.entryOk("224563t989","Carrier",""))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void entryOk19() {
        String result;
        if(Postpaid.entryOk("224563345989","Carrier",""))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void entryOk20() {
        String result;
        if(Postpaid.entryOk("9224563489","Carrier",""))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void entryOk21() {
        String result;
        if(Postpaid.entryOk("2245","Carrier",""))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
}
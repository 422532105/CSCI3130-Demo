package com.example.acme.csci3130_demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorUnitTest {

    @Test
    public void validation() {
        assertEquals(Validator.validation("password"),1);
        assertEquals(Validator.validation("1234567"),3);
        assertEquals(Validator.validation("HelloWorld"),2);
        assertEquals(Validator.validation("H@allll11"),4);
    }
}
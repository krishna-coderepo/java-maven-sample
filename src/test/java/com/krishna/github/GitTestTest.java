package com.krishna.github;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class GitTestTest {

    @BeforeAll
    public static void setupAll() {
        System.out.println("Should Print Before All Tests");
    }

    @BeforeEach
    public void setup() {
        System.out.println("Instantiating testing");
    }

    @Test
    @DisplayName("additiona of numbers")
    public void addTwoInt() {
        assertEquals(15,GitTest.addTwoInt(5,10) );
    }

    @Test
    @DisplayName("Multiplication of numbers")
    public void multiply() {
        assertEquals(50,GitTest.multiply(5,10) );
    }
}
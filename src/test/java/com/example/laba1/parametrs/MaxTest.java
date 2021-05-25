package com.example.laba1.parametrs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    void getNewValue() {
        Max max = new Max(3,10,-2);
        int actual = max.getValue();
        int expected = 10;
        assertEquals(expected, actual);
    }
}
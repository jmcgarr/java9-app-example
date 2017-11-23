package com.mikemcgarr;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MainTest {

    @Test
    public void wiringTest() {
        String greeting = Main.greeting();

        assertThat( greeting, is( equalTo("Hello my friend!") ) );
    }
}
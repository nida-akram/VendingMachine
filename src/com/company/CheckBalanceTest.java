package com.company;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CheckBalanceTest {

    @Test
    public void multipleDrinks() {
        CheckBalance checkBalance = new CheckBalance();

        assertThat(true, is(checkBalance.multipleDrinks(1)));
        assertThat(false, is(checkBalance.multipleDrinks(2)));
    }

}
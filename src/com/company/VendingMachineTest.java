package com.company;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class VendingMachineTest {
    @Test

    public void checkStorage() {

        VendingMachine vendingMachine = new VendingMachine();
        assertThat(12.5, is(vendingMachine.checkStorage(12.5)));
    }

}
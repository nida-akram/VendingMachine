package com.company;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StorageTest {
    @Test
    public void output_test(){
        Storage storage = new Storage();

        assertThat( 18.00, is(storage.availableCash(20.50, 2.50)));
    }
}

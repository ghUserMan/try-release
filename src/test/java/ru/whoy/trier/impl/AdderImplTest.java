package ru.whoy.trier.impl;

import org.junit.Test;
import ru.whoy.trier.Adder;

import static org.assertj.core.api.Assertions.*;

public class AdderImplTest {

    @Test
    public void add() {

        Adder adder = new AdderImpl();

        assertThat(adder.add(1, 1)).isEqualTo(2);

    }
}
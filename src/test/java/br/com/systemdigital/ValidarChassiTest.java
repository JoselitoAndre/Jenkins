package br.com.systemdigital;

import static org.junit.Assert.*;
import org.junit.Test;

public class ValidarChassiTest {
    ValidarChassi util = new ValidarChassi();

    @Test
    public void validarAnoANoChassi() {
        assertEquals(2010, util.validar("9BP17164GA000001", 10));
    }

    @Test
    public void validarAno9NoChassi() {
        assertEquals(2009, util.validar("9BP17164G9000002", 10));
    }

    @Test
    public void validarAnoBNoChassi() {
        assertEquals(2011, util.validar("9BP17164GB000003", 10));
    }

    @Test
    public void validarAnoAMinusculoNoChassi() {
        assertEquals(2010, util.validar("9bp17164ga000001", 10));
    }

    @Test(expected=IllegalArgumentException.class)
    public void validarAnoIncorreto() {
        assertEquals(2020, util.validar("9bp17164gz000004", 10));
    }
}
package br.ufg.cs.cleydsonjr;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculoPITest {
    private CalculoPI calculoPI;

    @Before
    public void setUp() {
        calculoPI = new CalculoPI();
    }

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void somaNaturaisDeveFalharComNumeroInvalido() throws Exception {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Número limite inválido informado: -15");

        calculoPI.calculePI(-15);
    }

    @Test
    public void somaNaturaisDeveRestornarOValorEsperado() throws Exception {
        double soma = calculoPI.calculePI(20);

        Assert.assertEquals("Soma errada retornada", 3.09162380666784d, soma, 0);
    }

}
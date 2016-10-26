package br.ufg.cs.cleydsonjr;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SomatorioElementarTest {
    private SomatorioElementar somatorioElementar;

    @Before
    public void setUp() {
        somatorioElementar = new SomatorioElementar();
    }

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void somaNaturaisDeveFalharComNumeroInvalido() throws Exception {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Número inválido informado: -15");

        somatorioElementar.somaNaturais(-15);
    }

    @Test
    public void somaNaturaisDeveRestornarOValorEsperado() throws Exception {
        double soma = somatorioElementar.somaNaturais(20);

        Assert.assertEquals("Soma errada retornada", 1.027941815252917d, soma, 0);
    }

}
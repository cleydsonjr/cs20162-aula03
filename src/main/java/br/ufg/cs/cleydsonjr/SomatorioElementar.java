/*
 * Copyright (c) 2016. Cleydson José de Figueiredo Júnior
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.cs.cleydsonjr;

/**
 * Implementação do algorítmo de Somatório Elementar.
 */
public class SomatorioElementar {

    /**
     * Método auxiliar para calcular a soma dos primeiros naturais.
     *
     * @param n O limite de números. Obrigatoriamente maior que 1
     * @return O valor da soma.
     */
    final double somaNaturais(final int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Número inválido informado: " + n);
        }

        double s = 0;
        for (int i = 1; i <= n; i++) {
            double d = 1 + Math.pow(i, 2);
            s = s + 1 / d;
        }

        return s;
    }
}

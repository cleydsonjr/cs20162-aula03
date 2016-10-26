/*
 * Copyright (c) 2016. Cleydson José de Figueiredo Júnior
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.cs.cleydsonjr;

/**
 * Implementação do algorítmo de Para calculo do valor de PI.
 */
public class CalculoPI {
    /**
     * Representação do número Quatro.
     */
    private static final int QUATRO = 4;

    /**
     * Método auxiliar para calcular o valor de PI.
     *
     * @param n Quantidade de termos para o somatório. Obrigatoriamente maior que 1.
     * @return o valor de PI
     */
    final double calculePI(final int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Número limite inválido informado: " + n);
        }

        double s = -1;
        double d = -1;
        double p = 0;

        for (int i = 1; i <= n; i++) {
            d = d + 2;
            s = s * -1;
            p = p + (QUATRO * s / d);
        }

        return p;
    }
}

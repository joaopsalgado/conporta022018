package br.ufg.inf.fabrica.conporta022018.util.csv;

import br.ufg.inf.fabrica.conporta022018.util.Extrator;

public class ExtratorCSV implements Extrator {

    private String texto;

    @Override
    public String[] getResultado(String regra) {

        String[] resultadoExtracao;
        resultadoExtracao = texto.split(regra);

        return resultadoExtracao;
    }

    @Override
    public void setTexto(String texto) {

        this.texto = texto;
    }

}

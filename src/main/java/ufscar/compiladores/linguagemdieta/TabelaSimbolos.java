package ufscar.compiladores.linguagemdieta;

import java.util.HashMap;

public class TabelaSimbolos {

    private HashMap<String, EntradaTabelaSimbolos> tabelaDeSimbolos;

    public TabelaSimbolos() {
        tabelaDeSimbolos = new HashMap<>();
    }

    public void inserir(String nome) {
        EntradaTabelaSimbolos etds = new EntradaTabelaSimbolos();
        etds.nome = nome;
        tabelaDeSimbolos.put(nome, etds);
    }

    public EntradaTabelaSimbolos verificar(String nome) {
        return tabelaDeSimbolos.get(nome);
    }
}
package br.com.cadUser;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private ArrayList<String> listaNomes;

    public Pessoa() {
        this.listaNomes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getListaNomes() {
        return listaNomes;
    }

    public void adicionarNome(String nome) {
        this.listaNomes.add(nome);
    }
}
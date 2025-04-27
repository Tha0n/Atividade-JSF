package br.com.cadUser;

import java.io.Serializable;
import java.util.ArrayList;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named
@ViewScoped
public class CadastroBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nome;
    private ArrayList<String> nomes = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getNomes() {
        return nomes;
    }

    public void salvar() {
        if (nome != null && !nome.isEmpty()) {
            nomes.add(nome);
            nome = ""; // Limpa o campo após envio
        }
    }
}
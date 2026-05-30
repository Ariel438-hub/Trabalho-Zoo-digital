package br.edu.atitus.Ariel_Almeida.zoo_digital.animais;

import br.edu.atitus.Ariel_Almeida.zoo_digital.comportamentos.Nado;
import br.edu.atitus.Ariel_Almeida.zoo_digital.especies.Peixe;

public class PeixePalhaco extends Peixe implements Nado {

    public PeixePalhaco(String nome, int idade, String tipoAgua) {
        super(nome, idade, tipoAgua);
    }

    @Override
    public void comer() {
        IO.println(getNome() + " está comendo algas e pequenos organismos.");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " produz pequenos estalos.");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando entre as anêmonas.");
    }
}
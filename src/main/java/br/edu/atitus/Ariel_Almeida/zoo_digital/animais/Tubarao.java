package br.edu.atitus.Ariel_Almeida.zoo_digital.animais;

import br.edu.atitus.Ariel_Almeida.zoo_digital.comportamentos.Nado;
import br.edu.atitus.Ariel_Almeida.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.Ariel_Almeida.zoo_digital.especies.Peixe;

public class Tubarao extends Peixe implements Nado, Predacao {

    public Tubarao(String nome, int idade, String tipoAgua) {
        super(nome, idade, tipoAgua);
    }

    @Override
    public void comer() {
        IO.println(getNome() + " está devorando sua presa.");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " não emite sons audíveis para humanos.");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando rapidamente.");
    }

    @Override
    public void cacar() {
        IO.println(getNome() + " está caçando no oceano.");
    }
}
package br.edu.atitus.Ariel_Almeida.zoo_digital.animais;

import br.edu.atitus.Ariel_Almeida.zoo_digital.comportamentos.Nado;
import br.edu.atitus.Ariel_Almeida.zoo_digital.especies.Reptil;

public class Tartaruga extends Reptil implements Nado {

    public Tartaruga(String nome, Integer idade, Boolean temEscamas) {
        super(nome, idade, temEscamas);
    }

    @Override
    public void comer() {
        IO.println(getNome() + " está comendo vegetação.");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " faz sons suaves.");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando calmamente.");
    }
}
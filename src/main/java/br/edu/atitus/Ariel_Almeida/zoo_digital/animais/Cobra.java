package br.edu.atitus.Ariel_Almeida.zoo_digital.animais;

import br.edu.atitus.Ariel_Almeida.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.Ariel_Almeida.zoo_digital.especies.Reptil;

public class Cobra extends Reptil implements Predacao {

    public Cobra(String nome, Integer idade, Boolean temEscamas) {
        super(nome, idade, temEscamas);
    }

    @Override
    public void comer() {
        IO.println(getNome() + " está engolindo sua presa.");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " faz: Ssssssss!");
    }

    @Override
    public void cacar() {
        IO.println(getNome() + " está caçando silenciosamente.");
    }
}
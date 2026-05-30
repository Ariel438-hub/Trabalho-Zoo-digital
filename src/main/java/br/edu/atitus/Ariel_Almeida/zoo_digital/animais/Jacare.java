package br.edu.atitus.Ariel_Almeida.zoo_digital.animais;

import br.edu.atitus.Ariel_Almeida.zoo_digital.comportamentos.Nado;
import br.edu.atitus.Ariel_Almeida.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.Ariel_Almeida.zoo_digital.especies.Reptil;

public class Jacare extends Reptil implements Nado, Predacao {

    public Jacare(String nome, Integer idade, Boolean temEscamas) {
        super(nome, idade, temEscamas);
    }

    @Override
    public void comer() {
        IO.println(getNome() + " está devorando sua presa.");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " faz: Grrooo!");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando.");
    }

    @Override
    public void cacar() {
        IO.println(getNome() + " está caçando próximo à margem do rio.");
    }
}
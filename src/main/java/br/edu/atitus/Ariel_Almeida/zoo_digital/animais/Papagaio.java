package br.edu.atitus.Ariel_Almeida.zoo_digital.animais;

import br.edu.atitus.Ariel_Almeida.zoo_digital.comportamentos.Voo;
import br.edu.atitus.Ariel_Almeida.zoo_digital.especies.Ave;

public class Papagaio extends Ave implements Voo {

    public Papagaio(String nome, Integer idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void comer() {
        IO.println(getNome() + " está comendo frutas e sementes.");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " faz: Curupaco!");
    }

    @Override
    public void voar() {
        IO.println(getNome() + " está voando entre as árvores.");
    }
}

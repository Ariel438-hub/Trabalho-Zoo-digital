package br.edu.atitus.Ariel_Almeida.zoo_digital.animais;

import br.edu.atitus.Ariel_Almeida.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.Ariel_Almeida.zoo_digital.especies.Mamifero;

public class Elefante extends Mamifero implements Corrida {

    public Elefante(String nome, Integer idade, Boolean temPelos) {
        super(nome, idade, temPelos);
    }

    @Override
    public void comer() {
        IO.println(getNome() + " está comendo folhas e frutas.");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " faz: Pruuuuu!");
    }

    @Override
    public void correr() {
        IO.println(getNome() + " está correndo.");
    }
}
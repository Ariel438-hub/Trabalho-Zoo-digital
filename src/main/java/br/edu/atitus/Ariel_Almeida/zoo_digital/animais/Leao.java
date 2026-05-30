package br.edu.atitus.Ariel_Almeida.zoo_digital.animais;

import br.edu.atitus.Ariel_Almeida.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.Ariel_Almeida.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.Ariel_Almeida.zoo_digital.especies.Mamifero;

public class Leao extends Mamifero implements Corrida, Predacao {

    public Leao(String nome, Integer idade, Boolean temPelos) {
        super(nome, idade, temPelos);
    }

    @Override
    public void comer() {
        IO.println(getNome() + " está comendo carne.");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " faz: Rooooar!");
    }

    @Override
    public void correr() {
        IO.println(getNome() + " está correndo.");
    }

    @Override
    public void cacar() {
        IO.println(getNome() + " está caçando sua presa.");
    }
}
package br.edu.atitus.Ariel_Almeida.zoo_digital.animais;

import br.edu.atitus.Ariel_Almeida.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.Ariel_Almeida.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.Ariel_Almeida.zoo_digital.especies.Reptil;

public class Lagarto extends Reptil implements Corrida, Predacao {

    public Lagarto(String nome, Integer idade, Boolean temEscamas) {
        super(nome, idade, temEscamas);
    }

    @Override
    public void comer() {
        IO.println(getNome() + " está comendo insetos.");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " faz pequenos estalos.");
    }

    @Override
    public void correr() {
        IO.println(getNome() + " está correndo rapidamente.");
    }

    @Override
    public void cacar() {
        IO.println(getNome() + " está caçando insetos.");
    }
}
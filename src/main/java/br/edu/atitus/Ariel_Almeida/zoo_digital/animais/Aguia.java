package br.edu.atitus.Ariel_Almeida.zoo_digital.animais;

import br.edu.atitus.Ariel_Almeida.zoo_digital.comportamentos.Voo;
import br.edu.atitus.Ariel_Almeida.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.Ariel_Almeida.zoo_digital.especies.Ave;

public class Aguia extends Ave implements Voo, Predacao {

    public Aguia(String nome, Integer idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void comer() {
        IO.println(getNome() + " está comendo sua presa.");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " faz: Kreeee!");
    }

    @Override
    public void voar() {
        IO.println(getNome() + " está voando em grandes altitudes.");
    }

    @Override
    public void cacar() {
        IO.println(getNome() + " está caçando do alto dos céus.");
    }
}
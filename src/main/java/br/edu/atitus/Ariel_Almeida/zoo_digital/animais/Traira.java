package br.edu.atitus.Ariel_Almeida.zoo_digital.animais;


import br.edu.atitus.Ariel_Almeida.zoo_digital.comportamentos.Nado;
import br.edu.atitus.Ariel_Almeida.zoo_digital.especies.Peixe;

public class Traira extends Peixe implements Nado {

    public Traira(String nome, int idade, String doce) {
        super(nome, idade, "Doce");
    }

    @Override
    public void comer() {
        this.comer("lambaris");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está borbulhando");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando no rio");
    }
    
}
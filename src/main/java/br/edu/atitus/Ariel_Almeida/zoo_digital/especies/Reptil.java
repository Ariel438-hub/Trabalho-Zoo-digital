package br.edu.atitus.Ariel_Almeida.zoo_digital.especies;

public abstract class Reptil extends Animal {

    private Boolean temEscamas;

    public Reptil(String nome, Integer idade, Boolean temEscamas) {
        super(nome, "Réptil", idade);
        this.temEscamas = temEscamas;
    }

    public Boolean getTemEscamas() {
        return temEscamas;
    }

    public void setTemEscamas(Boolean temEscamas) {
        this.temEscamas = temEscamas;
    }

    public void trocarPele() {
        IO.println(this.getNome() + " está trocando de pele.");
    }

    public abstract void comer();

    public abstract void emitirSom();
}
package br.edu.atitus.Ariel_Almeida.zoo_digital.especies;



public abstract class Peixe extends Animal {
    private String tipoAgua; //Água doce ou salgada

    public Peixe(String nome, int idade, String tipoAgua) {
        super(nome, "Peixe", idade);
        this.tipoAgua = tipoAgua;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }


    public abstract void comer();

    public abstract void emitirSom();
}
package br.edu.atitus.Ariel_Almeida.zoo_digital.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.atitus.Ariel_Almeida.zoo_digital.animais.*;
import br.edu.atitus.Ariel_Almeida.zoo_digital.comportamentos.*;
import br.edu.atitus.Ariel_Almeida.zoo_digital.animais.*;
import br.edu.atitus.Ariel_Almeida.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.Ariel_Almeida.zoo_digital.comportamentos.Nado;
import br.edu.atitus.Ariel_Almeida.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.Ariel_Almeida.zoo_digital.comportamentos.Voo;
import br.edu.atitus.Ariel_Almeida.zoo_digital.especies.Animal;

public class ZooDigitalApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Animal> animais = new ArrayList<>();

        int opcao;

        do {

            IO.println("\n========== ZOO DIGITAL ==========");
            IO.println("1 - Cadastrar Animal");
            IO.println("2 - Listar Todos os Animais");
            IO.println("3 - Listar Animais Corredores");
            IO.println("4 - Listar Animais Nadadores");
            IO.println("5 - Listar Animais Voadores");
            IO.println("6 - Listar Animais Predadores");
            IO.println("7 - Exibir Total de Animais");
            IO.println("0 - Sair");

            IO.print("Digite uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            try {

                switch (opcao) {

                    case 1 -> cadastrarAnimal(animais, sc);

                    case 2 -> listarTodos(animais);

                    case 3 -> listarCorredores(animais);

                    case 4 -> listarNadadores(animais);

                    case 5 -> listarVoadores(animais);

                    case 6 -> listarPredadores(animais);

                    case 7 -> exibirTotalAnimais();

                    case 0 -> IO.println("Até breve!");

                    default -> IO.println("Opção inválida.");
                }

            } catch (Exception e) {

                IO.println("ERRO: " + e.getMessage());

            }

        } while (opcao != 0);

        sc.close();
    }

    private static void cadastrarAnimal(List<Animal> animais, Scanner sc) {

        IO.println("\n===== CADASTRAR ANIMAL =====");

        IO.println("1 - Aguia");
        IO.println("2 - Cachorro");
        IO.println("3 - Cobra");
        IO.println("4 - Elefante");
        IO.println("5 - Gato");
        IO.println("6 - Golfinho");
        IO.println("7 - Jacare");
        IO.println("8 - Lagarto");
        IO.println("9 - Leao");
        IO.println("10 - Lobo");
        IO.println("11 - Papagaio");
        IO.println("12 - Pato");
        IO.println("13 - PeixeMorcego");
        IO.println("14 - PeixePalhaco");
        IO.println("15 - Pinguim");
        IO.println("16 - Tartaruga");
        IO.println("17 - Traira");
        IO.println("18 - Tubarao");

        IO.print("Escolha o animal: ");
        int tipo = sc.nextInt();
        sc.nextLine();

        IO.print("Nome: ");
        String nome = sc.nextLine();

        IO.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        Animal animal = null;

        switch (tipo) {

            case 1 -> animal = new Aguia(nome, idade, "Marrom");

            case 2 -> animal = new Cachorro(nome, idade, true);

            case 3 -> animal = new Cobra(nome, idade, true);

            case 4 -> animal = new Elefante(nome, idade, true);

            case 5 -> animal = new Gato(nome, idade, true);

            case 6 -> animal = new Golfinho(nome, idade);

            case 7 -> animal = new Jacare(nome, idade, true);

            case 8 -> animal = new Lagarto(nome, idade, true);

            case 9 -> animal = new Leao(nome, idade, true);

            case 10 -> animal = new Lobo(nome, idade, true);

            case 11 -> animal = new Papagaio(nome, idade, "Verde");

            case 12 -> animal = new Pato(nome, idade, "Branco");

            case 13 -> animal = new PeixeMorcego(nome, idade);

            case 14 -> animal = new PeixePalhaco(nome, idade, "Salgada");

            case 15 -> animal = new Pinguim(nome, idade, "Preto e Branco");

            case 16 -> animal = new Tartaruga(nome, idade, true);

            case 17 -> animal = new Traira(nome, idade, "Doce");

            case 18 -> animal = new Tubarao(nome, idade, "Salgada");

            default -> {
                IO.println("Animal inválido.");
                return;
            }
        }

        animais.add(animal); // Upcasting

        IO.println("Animal cadastrado com sucesso!");
    }

    private static void listarTodos(List<Animal> animais) {

        if (animais.isEmpty()) {
            IO.println("Nenhum animal cadastrado.");
            return;
        }

        for (Animal animal : animais) {

            IO.println("--------------------------------");
            IO.println("Nome: " + animal.getNome());
            IO.println("Idade: " + animal.getIdade());
            IO.println("Espécie: " + animal.getEspecie());

            animal.emitirSom();
            animal.comer();
        }
    }

    private static void listarCorredores(List<Animal> animais) {

        IO.println("\n===== ANIMAIS CORREDORES =====");

        for (Animal animal : animais) {

            if (animal instanceof Corrida) {

                IO.println(animal.toString());

                Corrida corredor = (Corrida) animal;
                corredor.correr();
            }
        }
    }

    private static void listarNadadores(List<Animal> animais) {

        IO.println("\n===== ANIMAIS NADADORES =====");

        for (Animal animal : animais) {

            if (animal instanceof Nado) {

                IO.println(animal.toString());

                Nado nadador = (Nado) animal;
                nadador.nadar();
            }
        }
    }

    private static void listarVoadores(List<Animal> animais) {

        IO.println("\n===== ANIMAIS VOADORES =====");

        for (Animal animal : animais) {

            if (animal instanceof Voo) {

                IO.println(animal.toString());

                Voo voador = (Voo) animal;
                voador.voar();
            }
        }
    }

    private static void listarPredadores(List<Animal> animais) {

        IO.println("\n===== ANIMAIS PREDADORES =====");

        for (Animal animal : animais) {

            if (animal instanceof Predacao) {

                IO.println(animal.toString());

                Predacao predador = (Predacao) animal;
                predador.cacar();
            }
        }
    }

    private static void exibirTotalAnimais() {

        IO.println("\n===== TOTAL DE ANIMAIS =====");
        IO.println("Quantidade de animais cadastrados: " + Animal.getContador());
    }
}
//Alunas: Gabriela Sena da Silva e Luisa Pedrolli  2ºTI
import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoTeste {
    public static Scanner input;

    public static void menu(){
        System.out.println("Menu:");
        System.out.println("1. Inserir um CD");
        System.out.println("2. Inserir um DVD");
        System.out.println("3. Inserir um livro");
        System.out.println("4. Listar todos os produtos");
    }

    public static void inserirCD(ArrayList<CD> cd){

        System.out.println("Digite o nome do CD: ");
        String nome = input.nextLine();

        System.out.println("Digite a capacidade do CD: ");
        int capacidade = input.nextInt();

        System.out.println("Digite o numero de faixas do CD: ");
        int numeroFaixas = input.nextInt();

        cd.add(new CD(capacidade, nome, numeroFaixas));

    }

    public static void inserirDVD(ArrayList<DVD> dvd){

        System.out.println("Digite o nome do DVD: ");
        String nome = input.nextLine();

        System.out.println("Digite a capacidade do DVD: ");
        int capacidade = input.nextInt();

        System.out.println("Digite a duracao em minutos do DVD: ");
        int duracao = input.nextInt();

        dvd.add(new DVD(capacidade, duracao, nome));
    }

    public static void inserirLivro(ArrayList<Livro> livro){

        System.out.println("Digite o nome do livro: ");
        String nome = input.nextLine();

        System.out.println("Digite o autor: ");
        String autor = input.nextLine();

        System.out.println("Digite a quantidade de paginas: ");
        int numeroPaginas = input.nextInt();

        livro.add(new Livro(nome, autor, numeroPaginas));
    }

    public static void listarCD(ArrayList<CD> cd){
        final StringBuilder builder = new StringBuilder();

        for (int i = 0; i < cd.size(); i++) {
            builder.append(i + 1);
            builder.append(". ");
            builder.append(cd.get(i).toString());
            builder.append('\n');
        }

        System.out.println(builder.toString());
    }

    public static void listarDVD(ArrayList<DVD> dvd){
        final StringBuilder builder = new StringBuilder();

        for (int i = 0; i < dvd.size(); i++) {
            builder.append(i + 1);
            builder.append(". ");
            builder.append(dvd.get(i).toString());
            builder.append('\n');
        }

        System.out.println(builder.toString());
    }

    public static void listarLivro(ArrayList<Livro> livro){
        final StringBuilder builder = new StringBuilder();

        for (int i = 0; i < livro.size(); i++) {
            builder.append(i + 1);
            builder.append(". ");
            builder.append(livro.get(i).toString());
            builder.append('\n');
        }

        System.out.println(builder.toString());
    }

    public static void main(String[] args){

        input = new Scanner(System.in);
        ArrayList<CD> cd = new ArrayList<CD>();
        ArrayList<DVD> dvd = new ArrayList<DVD>();
        ArrayList<Livro> livro = new ArrayList<Livro>();

        int menu = 1;
        while((menu>=1)&(menu<4)){
            System.out.println("-------------------------------------------------");
            menu();
            menu = input.nextInt();
            input.nextLine();
            System.out.println("-------------------------------------------------");
            switch(menu){
                case 1:
                inserirCD(cd);
                    break;
                
                case 2:
                inserirDVD(dvd);
                    break;

                case 3:
                inserirLivro(livro);
                    break;

                case 4:
                System.out.println("CD:\n");
                listarCD(cd);
                System.out.println("-------------------------------------------------");
                System.out.println("DVD:\n");
                listarDVD(dvd);
                System.out.println("-------------------------------------------------");
                System.out.println("LIVRO:\n");
                listarLivro(livro);
                System.out.println("-------------------------------------------------");
                    break;
            }
        }
    }
}
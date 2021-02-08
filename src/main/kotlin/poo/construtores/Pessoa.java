package poo.construtores;

public class Pessoa {

    private String nome;
    private int anoNascimento;

    // constructor
    public Pessoa(String nome, int anoNascimento){
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public static void main(String[] args) {
        poo.construtores.Pessoa p = new poo.construtores.Pessoa("Jose", 1999);
        System.out.println(p.nome);
    }

}

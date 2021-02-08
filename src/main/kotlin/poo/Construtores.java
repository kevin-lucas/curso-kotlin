package poo;

public class Construtores {

    private String nome;
    private int anoNascimento;

    // constructor
    public Construtores(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public static void main(String[] args) {
        Construtores p = new Construtores("Jose", 1999);
        System.out.println(p.nome);
    }

}

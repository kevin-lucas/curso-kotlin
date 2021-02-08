package poo;

public class GetAndSetter {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        Maquina3 m = new Maquina3("xpto");
        m.getMarca(); // definida implicitamente pelo kt
        m.setMarca("teste");
    }
}




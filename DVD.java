//Alunas: Gabriela Sena da Silva e Luisa Pedrolli  2ºTI
public class DVD extends Midia {

    private int duracao;
    private String nome;

    public DVD(int capacidade, int duracao, String nome) {
        super(capacidade);
        this.duracao = duracao;
        this.nome = nome;
    }

 
    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "DVD [Nome= " + retornarNome() + 
        "| Duracao= " + getDuracao() + 
        "| Capacidade= " + getCapacidade() +
        "| Preco= " + retornarPreco() + "]";
    }

    public String retornarNome(){
        return getNome();
    }

    public double retornarPreco(){
        return getDuracao()*0.3;
    }

}

//Alunas: Gabriela Sena da Silva e Luisa Pedrolli  2ºTI
public abstract class Midia implements Produto {

    private int capacidade;

    public Midia(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Midia [capacidade=" + capacidade + "]";
    }

}

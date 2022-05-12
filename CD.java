//Alunas: Gabriela Sena da Silva e Luisa Pedrolli  2ºTI
public class CD extends Midia {
    private String nome; 
    private int numeroFaixas;

    public CD(int capacidade, String nome, int numeroFaixas) {
        super(capacidade);
        this.nome = nome;
        this.numeroFaixas = numeroFaixas;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getNumeroFaixas() {
        return numeroFaixas;
    }

    public void setNumeroFaixas(int numeroFaixas) {
        this.numeroFaixas = numeroFaixas;
    }

    @Override
    public String toString() {
        return "CD [Nome=" + retornarNome()+ 
        ", | Numero de Faixas=" + getNumeroFaixas() + 
        "| Capacidade= " + getCapacidade() +
        ", | Preco=" +  retornarPreco() + "]";

    }

    public String retornarNome(){
        return getNome();
    }

    public double retornarPreco(){
        return getNumeroFaixas()*1.5;
    }
 
}

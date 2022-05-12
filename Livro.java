//Alunas: Gabriela Sena da Silva e Luisa Pedrolli  2ºTI
public class Livro implements Produto {
    private String nome;
    private String autor;
    private int numeroPaginas;

    public String retornarNome(){
        return nome;
    }

    public double retornarPreco(){
        return getNumeroPaginas()*0.12;
    }

    @Override
    public String toString() {
        return "Livro [Nome=" + retornarNome() + 
        " | Autor=" + autor + 
        " | Numero de Paginas=" + numeroPaginas + 
        " | Preco=" + retornarPreco() + "]";
    }

    public Livro(String nome, String autor, int numeroPaginas) {
        this.nome = nome;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}

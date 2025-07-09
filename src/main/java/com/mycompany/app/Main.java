import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Jessica Felix", "Brasileira");
        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia");

        Usuario usuario = new Usuario("Lucas Rafael", 25, null);
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);

        // Agora o livro foi emprestado e está indisponível
        livro.validarDisponibilidade(); // <-- agora sim vai imprimir

        System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
        System.out.println("Autor: " + emprestimo.getLivro().getAutor().getNome());
        System.out.println("Genero: " + emprestimo.getLivro().getGenero());
        System.out.println("Usuario: " + emprestimo.getUsuario().getNome());
        System.out.println("Idade: " + emprestimo.getUsuario().getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolucao: " + emprestimo.getDataDevolucao());
    }
}


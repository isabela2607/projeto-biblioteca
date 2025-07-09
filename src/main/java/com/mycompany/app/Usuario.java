public class Usuario extends Pessoa {
    private int idade;
    private Emprestimo[] emprestimos;

    public Usuario(String nome, int idade, Emprestimo[] emprestimos) {
        super(nome);
        this.idade = idade;
        this.emprestimos = emprestimos;
    }

    public int getIdade() {
        return idade;
    }

    public Emprestimo[] getHistoricoEmprestimos() {
        return emprestimos;
    }
}


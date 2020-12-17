import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private ArrayList<PagamentoNota> listaNotas;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}

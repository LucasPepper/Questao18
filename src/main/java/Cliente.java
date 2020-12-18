import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private ArrayList<PagamentoNota> listaNotas = new ArrayList<>();

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setListaNotas(PagamentoNota nota) {
        listaNotas.add(nota);
    }

    public ArrayList<PagamentoNota> getListaNotas() {
        return listaNotas;
    }
    
    
}

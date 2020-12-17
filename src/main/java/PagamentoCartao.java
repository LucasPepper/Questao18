import java.util.Date;

public class PagamentoCartao extends Pagamento{

    private int quantidadeParcelas;

    public PagamentoCartao(double valor, Date data) {
        super(valor, data);
    }

    public double calcularValorParcela(){
        return 0;
    }

}

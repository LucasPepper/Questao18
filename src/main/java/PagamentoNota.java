import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PagamentoNota extends Pagamento{

    private static final long MILISSEGUNDOS_MES = 2629800000L;

    private String status;
    private Cliente cliente;

    public PagamentoNota(double valor, Calendar data, Cliente cliente) {
        super(valor, data);
        this.cliente = cliente;
    }

    public boolean verificaValidadeNotaMenorQueUmMes(PagamentoNota nota){
        Calendar dataAtual = Calendar.getInstance();
        
        long dataNota = nota.getData().getTimeInMillis();
        long dataAtualMili = dataAtual.getTimeInMillis();

        long diferencaSegundos = dataAtualMili - dataNota;

        // Se diferencaSegundos <= Mes: Válido
        return diferencaSegundos <= MILISSEGUNDOS_MES;
    }
    
}

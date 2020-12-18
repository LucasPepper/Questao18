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

    public boolean verificaValidadeNotaMenorQueUmMes(){
        this.data.get(Calendar.YEAR);
        this.data.get(Calendar.MONTH);
        this.data.get(Calendar.DAY_OF_MONTH);

        long dataNota = this.data.getTimeInMillis();
        Calendar dataAgora = new GregorianCalendar();
        long dataAgoraMilli = dataAgora.getTimeInMillis();

        long diferencaSegundos = dataAgora.getTimeInMillis() - dataNota;

        long milisegundosEmUmMes = (long) 2629800000.00;

        // Se diferencaSegundos <= Mes: Válido
        return diferencaSegundos <= MILISSEGUNDOS_MES;
    }
    
}

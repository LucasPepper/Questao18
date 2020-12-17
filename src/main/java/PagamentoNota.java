import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PagamentoNota extends Pagamento{

    private String status;
    private Cliente cliente;

    public PagamentoNota(double valor, Calendar data, Cliente cliente) {
        super(valor, data);
        this.cliente = cliente;
    }

    public boolean verificaVencimentoNotasCliente(){
        this.data.get(Calendar.YEAR);
        this.data.get(Calendar.MONTH);
        this.data.get(Calendar.DAY_OF_MONTH);



        return false;
    }
    
}

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Pagamento {
    protected double valor;
    protected Calendar data;

    public Pagamento(double valor, Calendar data) {
        this.valor = valor;
        this.data = data;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }
    
}

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    private static ArrayList<Cliente> listaSPC = new ArrayList<>();
    private static ArrayList<Cliente> listaClientesRegistrados = new ArrayList<>();

    public static void main(String[] args) {

        adicionarClientesNoCadastroSistema();
        adicionarClientesSPC();
        adicionarNotasClientes();

        verificaClienteSPC()

    }

    private static void adicionarClientesNoCadastroSistema() {
        Cliente cliente1 = new Cliente("Alex", "111.111.111-11");
        Cliente cliente2 = new Cliente("Max", "222.222.222-22");

    }

    public boolean verificaClienteSPC(Cliente cliente) {
        for (Cliente cliente1 : listaSPC){
            if (listaSPC.contains(cliente1)){
                return true;
            }
        }
        return false;
    }


    private static void adicionarNotasClientes() {

        GregorianCalendar data1 = new GregorianCalendar(2020, 12, 1);
        GregorianCalendar data2 = new GregorianCalendar(2020, 10, 1);

        // ALEX
        PagamentoNota nota1 = new PagamentoNota(10, data1, listaSPC.get(0));
        PagamentoNota nota2 = new PagamentoNota(20, data2, listaSPC.get(0));

    }

    private static void adicionarClientesSPC() {
        Cliente cliente1 = new Cliente("Alex", "111.111.111-11");
        Cliente cliente2 = new Cliente("Max", "222.222.222-22");
        listaSPC.add(cliente1);
        listaSPC.add(cliente2);
    }


}

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    private static final ArrayList<Cliente> listaSPC = new ArrayList<Cliente>();
    private static ArrayList<Cliente> listaClientesRegistrados = new ArrayList<Cliente>();

    public static void main(String[] args) {

        adicionarClientesNoCadastroSistema();
        adicionarClientesSPC();
        adicionarNotasClientes(listaClientesRegistrados.get(0), 500.00);
        novaVenda();

    }

    private static void adicionarClientesNoCadastroSistema() {
        Cliente cliente1 = new Cliente("Alex", "111.111.111-11");
        Cliente cliente2 = new Cliente("Max", "222.222.222-22");
        Cliente cliente3 = new Cliente("Denilson", "333.333.333-33");
        
        listaClientesRegistrados.add(cliente1);
        listaClientesRegistrados.add(cliente2);
        listaClientesRegistrados.add(cliente3);
    }

    public static boolean verificaClienteSPC(String cpf) {
        for (Cliente cliente : listaSPC){
            if (cliente.getCpf().equals(cpf)){
                return true;
            }
        }
        return false;
    }


    private static void adicionarNotasClientes(Cliente cliente, double valor) {

        GregorianCalendar data1 = new GregorianCalendar(2020, 12, 1);

        // ALEX
        PagamentoNota nota1 = new PagamentoNota(valor, data1, cliente);
        cliente.setListaNotas(nota1);
    
    }

    private static void adicionarClientesSPC() {
        // Cliente cliente1 = new Cliente("Alex", "111.111.111-11");
        Cliente cliente2 = new Cliente("Max", "222.222.222-22");
        // listaSPC.add(cliente1);
        listaSPC.add(cliente2);
    }
    
    private static boolean verificaClienteCadastradoSistema(String cpf){
        for (Cliente cliente : listaClientesRegistrados){
            if (cliente.getCpf().equals(cpf)){
                return true;
            }
        }
        return false;
    }

    private static void novaVenda(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor da venda:");
        double valorVenda = scanner.nextDouble();
        System.out.println("Digite a forma de pagamento:");
        System.out.println("1 - Nota");
        System.out.println("2 - Dinheiro/Cartao");
        int opcaoFormaPagamento = scanner.nextInt();
        
        boolean clienteCadastrado;
        boolean clienteEstaNoSPC;
        boolean notaSituacaoValida;
                
        if(opcaoFormaPagamento == 1){
            clienteCadastrado = verificaClienteCadastradoSistema(listaClientesRegistrados.get(0).getCpf());
            if(clienteCadastrado){
                clienteEstaNoSPC = verificaClienteSPC(listaClientesRegistrados.get(0).getCpf());
                if(clienteEstaNoSPC){
                    System.out.println("Nao e possivel criar uma nova nota! (SPC)");
                }else{
                    notaSituacaoValida = listaClientesRegistrados.get(0).getListaNotas().get(0)
                            .verificaValidadeNotaMenorQueUmMes(listaClientesRegistrados.get(0).getListaNotas().get(0));
                    if(notaSituacaoValida){
                        System.out.println("Nota criada com Sucesso!");
                        adicionarNotasClientes(listaClientesRegistrados.get(0), valorVenda);
                    }
                }
            }       
        }else{
            System.out.println("Pagamento realizado com Sucesso!");
        }
    }
}

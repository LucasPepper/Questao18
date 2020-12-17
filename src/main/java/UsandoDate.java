import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;

public class UsandoDate {

    /*************************************************************
     * CAMADA DE APLICAÇÃO
     *************************************************************/

// O tipo normal de data que é utilizado nos pacotes Aplicação e Apresentação


// Ao criar um novo objeto do tipo Date ele já vem com a data e a hora de agora
    dataAniversario = new Date()

/*************************************************************
 * CAMADA DE PERSISTÊNCIA
 *************************************************************/

// Na Presistência, por causa do JDBC, é utilizado um tipo diferente
import java.sql.Date;

// Nos repositórios precisaremos converter o tipo util.Date no sql.Date quando for passar parâmetros nos Statements
// use a linha abaixo:
consulta.setDate(1, new java.sql.Date(pessoa.getDataNascimento().getTime()));

// O inverso (de sql.Date para util.Date) não precisa de conversão explícita

/*************************************************************
 * CAMADA DE APRESENTAÇÃO
 *************************************************************/

// Na camada de apresentação vamos criar campos de texto para editar a data (txtData)
// Para converter de String para Date, precisamos dos classes Calendar, DateFormat e associadas


    // Crie os objetos abaixo na classe da tela onde for necessária a conversão de textos em datas
    Calendar calendario = GregorianCalendar.getInstance();
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

// As linhas abaixo convertem o texto vindo do componente txtData para um objeto do tipo Date
try {
        pessoa.setDataNascimento( df.parse( txtData.getText() ) );
    } catch (
    ParseException ex) {
        Logger.getLogger(PessoaEditar.class.getName()).log(Level.SEVERE, null, ex);
    }

// A linha abaixo convertem o objeto Date para uma string
txtData.setText( df.format(pessoa.getDataNascimento()) );
}

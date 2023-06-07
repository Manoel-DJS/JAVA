import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class App {
    public static void main(String[] args) throws Exception {
        try{
        // conecta no banco
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/appfuncionarios","root","123456");
        Statement clausula = con.createStatement();
        // executa a clausula SQL
        ResultSet result = clausula.executeQuery("SELECT * FROM clientes");
        // acessando a resposta do banco
        while (result.next()) {
            System.out.println(result.getString("Nome"));
        }
        // fechando a conexao
        con.close();
    } catch (Exception e){
        // TODO: handle excepiton
        System.out.println("DEu bom não");
    }
    }
}
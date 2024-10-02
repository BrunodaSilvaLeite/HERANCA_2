//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Instanciando os objetos Gerente, Vendedor e Cliente

        Gerente g1 = new Gerente("João Silva", "15451611616",  LocalDate.of(2024, 9, 10),  LocalDate.of(2024, 9, 10), 2500.00, "Tecnologia");
        Vendedor v1 = new Vendedor("João Silva", "15451611616",  LocalDate.of(2024, 9, 10),  LocalDate.of(2024, 9, 10), 2500.00, 2.5);
        Cliente c1 = new Cliente("João Silva", "15451611616",  LocalDate.of(2024, 9, 10), "cliente@gmail.com", "25", "15988146408");

        // Utilizando o método sobrescrito cadastrar() para exibir os dados específicos de Gerente
        g1.cadastrar();
        System.out.println();
        v1.cadastrar();
        System.out.println();
        c1.cadastrar();
    }
}
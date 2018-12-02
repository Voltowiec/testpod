import java.util.Locale;

public class StringFormatter {

    public static void main(String[] args) {

        int accountBalance = 15_005;
        System.out.printf("saldo : %,d zł %n", accountBalance);

        double pi = Math.PI;
        System.out.println(pi);
        System.out.printf(new Locale("us"),"%.4f%n", pi);


    }
}

import javax.xml.crypto.Data;
import java.sql.SQLOutput;
import java.util.StringTokenizer;

public class Lab3 {

    //1

    public static void main(String[] args) {

        System.out.println("data: 29.04.2016");

        StringTokenizer st1, st2, st3;

        String quote1 = "29 04 2016";
        st1 = new StringTokenizer(quote1);

        System.out.println("Dzień: " + st1.nextToken());
        System.out.println("Miesiąc: " + st1.nextToken());
        System.out.println("Rok: " + st1.nextToken());


        //2


        Stat depth = new Stat();
        depth.depth = 10;


        Stat weight = new Stat();
        weight.weight = 31;

        Stat height = new Stat();
        height.height = 20;

        System.out.println(" height " + height.height + " weight " + weight.weight + " depth " + depth.depth);






    }





}

class Stat {
    int height;
    int weight;
    int depth;
}

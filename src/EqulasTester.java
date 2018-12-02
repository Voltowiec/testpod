import java.sql.SQLOutput;

public class EqulasTester {
    public static void main(String[] args) {

        String str1, str2;
        str1 = "raz dwa trzy";
        str2 = new String ("raz dwa trzy");

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("ten sam obiekt? " + (str1 == str2));
        System.out.println("ten sam obiekt? " + (str1.equals(str2)));

        String name = "Tomek";
        System.out.println(name.getClass());
        System.out.println(name.getClass() .getName());
        System.out.println(name.getClass() .getSimpleName());

        System.out.println();
        System.out.println(name instanceof String);
        System.out.println(name instanceof Object);

        Object object = new Object();
        object = name;
        System.out.println(object instanceof Integer);
    }


}

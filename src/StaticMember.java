public class StaticMember {

    public static void main(String[] args) {

        FamillyMember dad = new FamillyMember();
        dad.name = "Piotr";
        dad.age = 32;

        FamillyMember mam = new FamillyMember();
        mam.name = "Anna";
        mam.age = 31;

        FamillyMember kid = new FamillyMember();
        kid.name = "Zosia";
        kid.age = 3;

        show(mam);
        show(dad);
        show(kid);
    }

    static void show (FamillyMember famillyMember) {
        System.out.print(famillyMember.name);
        System.out.print(" ");
        System.out.print(famillyMember.surname);
        System.out.print(" ");
        System.out.print(famillyMember.age    );
        System.out.println(" lat/a");
    }

}


class FamillyMember {
    static String surname = "Nowak";
    String name;
    int age;

}


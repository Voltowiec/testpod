public class HalfDollars {
    public static void main(String[] args) {

        int[] denver = {1_700_000, 4_600_000, 2_100_000};
        int[] philadelphia = {1_80_000, 5_000_000, 1_800_000};
        int[] total = new int[denver.length];
        int average;

        int sum = 0;

        philadelphia[0] = 1_800_000;
        philadelphia[1] = 5_000_000;
        philadelphia[2] = 1_800_000;

        total[0] = denver[0] + philadelphia[0];
        total[1] = denver[1] + philadelphia[1];
        total[2] = denver[2] + philadelphia[2];

        average = (total[0]+total[1] + total[2])/3;

        System.out.print("Produkcja w 2012: ");
        System.out.format("%,d%n", total[0]);
        System.out.print("Produkcja w 2013: ");
        System.out.format("%,d%n", total[1]);
        System.out.print("Produkcja w 2014: ");
        System.out.format("%,d%n", total[2]);
        System.out.print("średnia produkcja: ");
        System.out.format("%,d%n", average);

        int[][][] arr3D = new int [4][10][10];
        arr3D[0] = new int [10][];

for (int i = 0; i < denver.length; i++) {
    total[i] = denver[i] + philadelphia[i];
    System.out.println("produkcja w " + (2012 + i) + "roku: ");

    sum += total[i];

}


    }
}

public class Suma {
    public static void main(String[] args) {
        int suma = 0;
        /* Tohle je zatím trochu magie, vysvětlím později ;-). */
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while (sc.hasNextInt()) {
            suma += sc.nextInt();
        }
        System.out.printf("Soucet zadanych cisel je %d.\n", suma);
    }
}


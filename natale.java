import java.util.Scanner;

/* albero di natale

Scusi prof se ho fatto solo questo, ma
quando ho provato a farlo non ho saputo da dove iniziare

Buon Natale

Gabriele Piumatto
 */

class AlberoDiNatale {
    public static void main(String[] args) {
        Scanner lettore;
        lettore = new Scanner(System.in);

        System.out.print("Digita l'altezza dell'albero: ");
        int n=lettore.nextInt();
        int i,j;

        i=1;
        while(i<=n)
        {
            j=1;
            while(j<=n-i) {
                System.out.print(" ");
                j++;
            }
            j=0;
            while(j<2*i-1) {
                System.out.print("*");
                j++;
            }
            j=1;
            while(j<=n-i) {
                System.out.print(" ");
                j++;
            }
            System.out.println();
            i++;
        }
        j=1;
        while(j<n) {
            System.out.print(" ");
            j++;
        }
        System.out.println("*");
        j=1;
        while(j<n) {
            System.out.print(" ");
            j++;
        }
        System.out.println("*");
    }
}

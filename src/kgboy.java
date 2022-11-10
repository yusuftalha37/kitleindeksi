import java.util.Scanner;
public class kgboy {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double Boy;
        double Kg ,total ;
        System.out.print("Lütfen boyunuzu (metre) cinsinden giriniz :");
        Boy = input.nextInt();

        System.out.print("Lütfen ağırlığınızı (KG) cinsinden giriniz :");
         Kg = input.nextInt();
         total = Kg / Boy * Boy;
         System.out.print("Vücüd kitle indeksiniz" + total);


    }
}

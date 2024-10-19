// Don't delete any comments below!!!
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Todo : Create ManajemenInventaris Object and Scanner
        ManajemenInventaris manager = new ManajemenInventaris();
        // Todo : Create Loop list menu
        Scanner input = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\n=== Menu Inventory Makanan ===");
            System.out.println("1. Tambahkan makanan kering");
            System.out.println("2. Tambahkan makanan basah");
            System.out.println("3. Tampilkan semua inventory makanan");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();
            
            switch (pilihan) {
                case 1:
                manager.tambahMakananKering();
                break;
                case 2:
                manager.tambahMakananBasah();
                break;
                case 3:
                manager.tampilkanSemuaMakanan();
                break;
                case 4:
                System.out.println("Keluar program");
                default:
                System.out.println("Menu tidak ada, silahkan pilih yang lain");
            }

        } while (pilihan != 4);

        input.close();

    }       
}
// Mantap 


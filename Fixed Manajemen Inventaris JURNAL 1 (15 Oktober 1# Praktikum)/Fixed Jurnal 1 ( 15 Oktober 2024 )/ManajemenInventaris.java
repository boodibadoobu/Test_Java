// Don't delete any comments below!!!
// Todo : Import Arraylist and Scanner
import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenInventaris {
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items
    ArrayList<MakananKering> daftarMakananKering = new ArrayList<>();
    ArrayList<MakananBasah> daftarMakananBasah = new ArrayList<>();
    public void tambahMakananKering() {
        
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        Scanner input = new Scanner (System.in);

        System.out.print("Nama : " );
        String namaMakananKering = input.nextLine();

        System.out.print("Harga : " );
        double harga = input.nextDouble();

        System.out.print("Jumlah : " );
        int jumlah = input.nextInt();

        input.nextLine();

        System.out.print("Nama brand : " );
        String namaBrand = input.nextLine();

        // Todo : Create a new object for MakananKering
        MakananKering Kue = new MakananKering(namaMakananKering, jumlah, harga, namaBrand);
        daftarMakananKering.add(Kue);
        
        // Todo : Create Print Notifitaction "Makanan kering berhasil ditambahkan"
        System.out.println("Makanan kering berhasil ditambahkan");
    }

    public void tambahMakananBasah() {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan
        Scanner input = new Scanner (System.in);

        System.out.print("Nama : " ); 
        String namaMakananBasah = input.nextLine();

        System.out.print("Harga : " );
        double harga = input.nextDouble();

        System.out.print("Jumlah : " );
        int jumlah = input.nextInt();

        input.nextLine();

        System.out.print("Bahan : " );
        String bahan = input.nextLine();
        // Todo : Create a new object for MakananBasah
        MakananBasah Basah = new MakananBasah(namaMakananBasah, jumlah, harga, bahan);
        daftarMakananBasah.add(Basah);
        
        // Todo :Create Print Notifitaction "Makanan Basah berhasil ditambahkan"
        System.out.println("Makanan basah berhasil ditambahkan");
    }

    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            // Todo : Create Print Notification "Tidak ada makanan disini"
            System.out.println("Tidak ada makanan disini");
        } else {
            // Todo : Create print notification for Makanan Kering  
            for (MakananKering makananKering : daftarMakananKering) {
                System.out.println("Tidak ada makanan kering");
                makananKering.ShowDataKering();
            }

            for (MakananBasah makananBasah : daftarMakananBasah){
                System.out.println(" Tidak ada makanan basah");
                makananBasah.ShowDataBasah();
            }
        }
    }
}

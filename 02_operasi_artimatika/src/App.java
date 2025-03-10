import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int angka1 = 50;
        int angka2 = 50;

        String nama = "Enrico";
        

        // penjumlahan
        // int hasil = 10 + 10;

        // pengurangan
        // int hasil = 20 - 10 - 10 - 5;

        // perkalian
        // int hasil = 10 * 2;

        // pembagian
        // int hasil = 20 / 2;

        // Modulus (Sisa bagi)
        // int hasil = 1024 % 2;
        // System.out.println(hasil);

        // Menggunakan prioritas operasi
        // int hasil = (10 + 20) * 2;

        // Menggunakan variabel
        // int hasil = angka1 + angka2;


        // Operator Concatenate (operator penggabungan)
        // System.out.println(nama + angka1);
        
        // Tidak bisa karena variabel ditentukan tipe datanya integer
        // int hasil = nama + angka1;

        // Tidak bisa selain +
        // System.out.println(nama - nama);



        // Operasi Perbandingan
        // > , < , == , !=
        // < dan > hanya bisa untuk angka

        // System.out.println(nama == "Bambang");


        // Penggunaan Scanner untuk menerima input
        Scanner input = new Scanner(System.in);

        // System.out.print("Ketik nama anda : ");
        // String namaLengkap = input.next();

        // System.out.println("Halo salam kenal ya " + namaLengkap);
        // int bilangan = input.nextInt();

        // Latihan sederhana
        // Hitung total bayar
        int harga, kuantitas, total;

        System.out.print("Harga barang : ");
        harga = input.nextInt();
        System.out.print("Kuantitas : ");
        kuantitas = input.nextInt();
        
        total = harga * kuantitas;
        
        System.out.println("-----------------------");
        System.out.println("Harga Barang = Rp " +  harga);
        System.out.println("Kuantitas  = " +  kuantitas);
        System.out.println("Total  = Rp " +  total);
        System.out.println("-----------------------");
    }
}

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        // int umur = 15;
        // boolean isMan = true;

        // Nested Condition
        // &&
        // ||

        // if(umur >= 20){
        //     System.out.println("Anda sudah dewasa");
        // }else{
        //     System.out.println("Belum dewasa");
        // }

        // Tentukan grade dari sebuah nilai
        // Jika nilainya diatas 80 maka grade A
        // Jika nilainya diatas 70 maka grade B
        // Jika nilainya diatas 60 maka grade C
        // Jika nilainya selain itu maka grade E
        Scanner input = new Scanner(System.in);
 

        // int nilai = input.nextInt();

        // && AND = dua duanya harus bernilai true untuk bisa menghasilkan true
        // || OR = salah satunya bernilai true maka akan menghasilkan true

        // if(nilai > 100 || nilai <= 0){
        //     System.out.println("Nilai tidak valid harus 0 - 100");
        // }else if (nilai > 80) {
        //     System.out.println("Grade A");
        // }else if(nilai > 70) {
        //     System.out.println("Grade B");
        // }else if(nilai > 60) {
        //     System.out.println("Grade C");
        // }else if(nilai <= 60){
        //     System.out.println("Grade E");
        // }

        // sini
        String keterangan;
        // if(nilai >= 80){
        //     keterangan = "Lulus";
        // }else if (nilai >70){
        //     keterangan = "Remedial";
        // }else{
        //     keterangan = "Tidak Lulus";
        // }

        // Ternary operator
        // keterangan = nilai >= 80 ? "Lulus" : nilai >= 70 ? "Remedial" : "Tidak Lulus";

        // System.out.println("Keterangan  : " + keterangan);


        // Nested If
        // Kelayakan masyarakat menerima bansos
        // Dia harus WNI
        // Penghasilannya < 4jt
        // Umurnya diatas 50 (lansia)
        // dia anaknya lebih dari 2, bansosnya senilai 2jt
        // dia anaknya kurang dari 2, bansosnya senilai 1jt

        boolean isWargaIndonesia;
        int penghasilan, umur, jumlahAnak;
        String tempString;

        System.out.print("Apakah WNI ? (YA/TIDAK)");
        isWargaIndonesia = input.next().compareTo("YA") == 0;
        
        System.out.print("Penghasilan : ");
        penghasilan = input.nextInt();

        System.out.print("Umur : ");
        umur = input.nextInt();

        System.out.print("jumlah anak : ");
        jumlahAnak = input.nextInt();
        
        System.out.println("WNI : " + isWargaIndonesia);
        System.out.println("Penghasilan : " + penghasilan);
        System.out.println("Umur : " + umur);
        System.out.println("Jumlah Anak : " + jumlahAnak);

        if(isWargaIndonesia ){
            if(penghasilan < 4000000){
                if(umur >= 50){
                    if(jumlahAnak >= 2){
                        System.out.println("Anda berhak mendapatkan Bansos 2jt rupiah");        
                    }else{
                        System.out.println("Anda berhak mendapatkan Bansos 1jt rupiah");        
                    }
                }else{
                    System.out.println("Umur anda tidak layak mendapatkan bansos");    
                }
            }else{
                System.out.println("Penghasilan anda tidak layak mendapatkan bansos (<4jt)");    
            }
        }else{
            System.out.println("Anda bukan WNI");
        }
    }  
}

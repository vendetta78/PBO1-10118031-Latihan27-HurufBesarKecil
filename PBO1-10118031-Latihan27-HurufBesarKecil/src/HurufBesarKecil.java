
import java.util.Scanner;

/**
 *
 * @author Vendetta 
 * NAMA              : Rizki Aria Putra 
 * KELAS             : PBO1 
 * NIM               : 10118031
 * Deskripsi Program : Program ini berisi program untuk formating huruf besar dan kecil
 */
public class HurufBesarKecil {

    public static void main(String[] args) {
        System.out.print("Masukkan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        String kalimat = scanner.nextLine();
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : " + kalimat.toUpperCase());
        System.out.println("Huruf Kecil : " + kalimat.toLowerCase());
    }

}

import java.util.Scanner;

public class jumlahkata {
    public static void main(String args[]) {
        String sentence, word;
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Masukan text  : ");
        sentence = scanner.nextLine();
 
        System.out.println("Pilih Kalimat Yang ingin dihapus  : ");
        word = scanner.nextLine();
        sentence = sentence.replaceAll(word, "");
 
        System.out.println("Hasil" + sentence);
    }
}

import java.util.Scanner;

public class ReverseString {
    
    public static void main(String args[]) {
        
        String kataNormal;
        String kataBalik = "";
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Text : ");
        
        kataNormal = input.nextLine();
        
        for (int i = kataNormal.length() - 1; i >= 0; i--)
        {
            kataBalik += kataNormal.charAt(i);
        }
        
        System.out.println(" ");
        System.out.println("Hasil : " + kataBalik );
    
        }
}

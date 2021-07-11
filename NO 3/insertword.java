public class insertword {

      public static void main(String[] args){
        //Mendefinisikan Objek dan Nilainya
        StringBuffer data = new StringBuffer("Sayabelajar struktur data");
        
        //Menyisipkan Karakter pada Objek StringBuffer
        data.insert(4, " sedang ");
        //Menampilkan Output
        System.out.println(data);
    }
}

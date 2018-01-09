import java.util.Scanner;
 public class Bumus{
 public static void main(String args []) {
 Scanner input=new Scanner(System.in);
 int a;
 System.out.print("Masukan nomor bulan :");
 a=input.nextInt();
 switch(a) {
 case 1:
 System.out.println("Bulan januari");
 System.out.println("Bulan Januari mengalami musim dingin");
 break;
 case 2:
 System.out.println("Bulan Februari");
 System.out.println("Bulan Februari mengalami musim dingin");
 break;
 case 3:
 System.out.println("Bulan Maret");
 System.out.println("Bulan Maret mengalami musim semi");
 break;
 case 4:
 System.out.println("Bulan April");
 System.out.println("Bulan April mengalami musim semi");
 break;
 case 5:
 System.out.println("Bulan Mei");
 System.out.println("Bulan Mei mengalami musim semi");
 break;
 case 6:
 System.out.println("Bulan Juni");
 System.out.println("Bulan Juni mengalami musim panas");
 break;
 case 7:
 System.out.println("Bulan Juli");
 System.out.println("Bulan Juli mengalami musim panas");
 break;
 case 8:
 System.out.println("Bulan Agustus");
 System.out.println("Bulan Agustus mengalami musim panas"); 
 break;
 case 9:
 System.out.println("Bulan September");
 System.out.println("Bulan September mengalami musim gugur");
 break;
 case 10:
 System.out.println("Bulan Oktober");
 System.out.println("Bulan Oktober mengalami musim gugur");
 break;
 case 11:
 System.out.println("Bulan November");
 System.out.println("Bulan November mengalami musim gugur");
 break;
 case 12:
 System.out.println("Bulan Desember");
 System.out.println("Bulan Desember mengalami musim dingin");
 break;
 default:
 System.out.println("Dunia Lain");
}
}
}
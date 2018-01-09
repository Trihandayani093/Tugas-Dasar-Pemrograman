import java.util.Scanner;

public class Variabel{
 public static void main(String args[]){
 //pernyataan masukan
 Scanner input=new Scanner(System.in);
 int a;
 System.out.println("Masukan a=");
 a=input.nextInt();
 System.out.println("Nilai a ="+a);

 //promosi dan casting
 int TahunAngkatan=2017;
 int TahunLahir=2000;
 int UmurSekarang=(int)(TahunAngkatan-TahunLahir);
 System.out.println("UmurSekarang="+UmurSekarang);
 }
}

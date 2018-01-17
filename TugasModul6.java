import java.util.Scanner;
public class TugasModul6
{
   public static void main(String args[])
   {
	Scanner masuk=new Scanner(System.in);
	float bil,  rata, jumlah;
	int data=0;
	int i=1;
	System.out.print("Banyaknya data : ");
	data=masuk.nextInt();
bil=0;
jumlah=0;
	do
	{
	System.out.print("Masukkan bilangan ke-"+i+" : ");
	bil=masuk.nextFloat();
	jumlah+=bil;
	i++;
		}while (i<=data) ;
		rata=jumlah/data;
		System.out.println("Rata-rata dari bilangan positif  diatas adalah : " + rata);
       
}
}

import java.util.Scanner;
public class Modul5
{
   public static void main(String args[])	
   {
	Scanner masuk=new Scanner(System.in);
	System.out.print(" Banyaknya Data : ");
	int data = masuk.nextInt();
	int K, B;
	int data_ke = 0;
	int t = 1;
	int h = 0;
	K = 0;
	B = 0;		
		while (t<=data){
		h++;
		System.out.print(" Data ke- "+h+" : ");
		data_ke = masuk.nextInt();
		if(t==1){
		K = data_ke;
		B = data_ke;
		}
		else if (data_ke<K){
		K = data_ke;
		}
		else if (data_ke>B){
		B = data_ke;
		}
		t++;	
			}
		System.out.println(" Bilangan TerKecil : " +K);
		System.out.println(" Bilangan Terbesar : " +B);
					
	}

}

import java.util.Scanner;
public class UlangFor7 
{
    public static void main(String args[]) {
	Scanner masuk=new Scanner(System.in);
 	int i;
	float n, jum, x, rata;
	System.out.print("Banyaknya data : ");
	n=masuk.nextFloat();
	rata=1;
	jum=0;
	for(i=1;i<=n;i++){
	   System.out.print("Data ke-"+i+" : ");
 	   x=masuk.nextFloat();
	  jum += x;
	rata= jum/n;
	}
	System.out.println("Jumlah : "+jum);
	System.out.println("Rata-rata : "+rata);
}
}
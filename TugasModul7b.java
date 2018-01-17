import java.util.Scanner;
public class TugasModul7b
{
    public static void main(String args[]){
	Scanner masuk=new Scanner(System.in);
	int t;
	int r;
	int i;
	System.out.print("Masukkan batas awal : ");
	t= masuk.nextInt();
	System.out.print("Masukkan batas akhir : ");
	r= masuk.nextInt();
	for(i=t;i<=r;i++){
	if ((i%2) !=0){
	   System.out.println(i);
	}
	}
}
}
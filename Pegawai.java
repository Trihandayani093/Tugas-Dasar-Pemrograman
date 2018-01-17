import java.util.Scanner;
public class Pegawai{
public static void main(String args[]){
	Scanner masuk=new Scanner (System.in);
	int n, g, j, t;
	String nama = "Tri Handayani" ;
	int u=0; 
	int p=0;
	int ga=0;
	System.out.print("NIP : ");
	n=masuk.nextInt();
	System.out.print("gaji pokok pegawai : ");
	g=masuk.nextInt();
	System.out.print("jumlah hadir : ");
	j=masuk.nextInt();
	System.out.print("besar tunjangan pegawai : ");
	t=masuk.nextInt();
	System.out.println("Nama : " + nama);
		u= j* 22000;
		System.out.println("ULP pegawai kontrak = "+ u);
		p=g+u+t*3/100;
		System.out.println("Pph pegawai kontrak = " +p);
		ga=g+u+t-p;
		System.out.println("Gaji Akhir pegawai kontrak ="+ga); 
}
}

	
	
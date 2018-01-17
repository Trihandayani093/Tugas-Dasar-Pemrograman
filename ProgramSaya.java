import java.util.Scanner;

public class ProgramSaya
{
 public static void main (String args[])
 {

Scanner input=new Scanner(System.in);
int x; int v; int t; int Vavg; int t1; int t2; int x1; int x2;   
int z; int y ;

do{ 
	System.out.println("Inilah beberapa pilihan yang akan anda hitung");
	System.out.println("1. Menghitung Jarak yang ditempuh suatu gerak benda");
	System.out.println("2. Menghitung Kecepatan dari suatu gerak benda");
	System.out.println("3. Menghitung Kecepatan rata-rata dari suatu gerak benda");

System.out.print("Masukan pilihan :");
z=input.nextInt();
switch (z) {

    case 1:
 System.out.print("Masukan v =");
 v = input.nextInt(); 		//kecepatan dari suatu gerak benda
 System.out.print("Masukan t =");
 t = input.nextInt(); 		//waktu yang digunakan oleh suatu gerak benda
	
	//jarak yang ditempuh oleh suatu gerak benda(x)
	x=v*t;
	System.out.println("x=v*t");
	System.out.println("Jarak yang ditempuh adalah : " + x + "km");

	//pernyataan if else mengenai hasil case 1
	if(x<=10){
	System.out.println("Selamattttt Jarakmu telah ditempuh sesuai yang anda inginkan");}
	else{
	System.out.println("Sorryyy jarakmu belum sampai");}

 break;

    case 2:
 System.out.print("Masukan x =");
 x= input.nextInt(); 		//jarak yang ditempuh oleh suatu gerak benda
 System.out.print("Masukan t =");
 t = input.nextInt();		//waktu yang digunakan oleh suatu gerak benda
	
	//kecepatan dari suatu gerak benda(v)
	v=x/t;
	System.out.println("v=x/t");
	System.out.println("Kecepatan dari suatu gerak benda : "+v +"km/s" );

	//pernyataan if else mengenai hasil case 2
	if(v<=5){
	System.out.println("Selamatttt Kecepatan telah tercapai sesuai yang anda inginkan");}
	else{
	System.out.println("Sorryyy kecepatan belum terlalu cepat");}
break;

    case 3:
 System.out.print("Masukan x2 =");
 x2= input.nextInt(); 		//waktu akhir yang digunakan oleh suatu gerak benda
 System.out.print("Masukan x1 =");
 x1= input.nextInt(); 		//waktu awal yang digunakan oleh suatu gerak benda	
 System.out.print("Masukan t2 =");
 t2= input.nextInt(); 		//jarak akhir yang ditempuh oleh suatu gerak benda
System.out.print("Masukan t1 =");
 t1 = input.nextInt();		//jarak awal yang ditempuh oleh suatu gerak benda

	//kecepatan rata-rata dari suatu gerak benda
	Vavg= x2-x1/t2-t1;
	System.out.println("Vavg=v2-v1/t2-t1");
 	System.out.println("Kecepatan rata-rata : "+Vavg +"km/s");	
	
	//pernyataan if else mengenai hasil case 3
	if(Vavg<=10){
	System.out.println("Selamatttt Kecepatan rata-rata telah tercapai sesuai yang anda inginkan");}
	else{
	System.out.println("Sorryyy kecepatan rata-rata belum tercapai");}
break;
	
default:
System.out.print("masih dunia lain");
}

	System.out.println();
	System.out.println("Tekan 0 jika ingin melanjutkan \nJika tidak melanjutkan tekan sembarangan");
	y= input.nextInt();
	}while ( y==0 );
 	
}
}
    
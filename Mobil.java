class Mobil


{


//variabel instant


private String merek;


private String warna;


private int tahunprod;




//konstruktor


public Mobil(String mrk,String wrn,int
thnprod)


{ this.merek=mrk;


this.warna=wrn;


this.tahunprod=thnprod;


}







//method


public void tampilData()


{ System.out.println("=======DATA MOBIL=========");


System.out.println("Merek mobil : "+ this.merek);


System.out.println("Warna : "+ this.warna);


System.out.println("Tahun produksi : "+this.tahunprod);


System.out.println("");


System.out.println("");


}


} //end of class



class Mobil{ //untuk nama file


public static void main(String[] args){


//instant obyek


Mobil car1=new Mobil("Kijang Innova" ,"Hitam",2005);


car1.tampilData();

 }
}
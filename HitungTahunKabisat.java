import java.util.*;
class HitungTahunKabisat {
public static void main(String[] args) {
String thk="Tahun Kabisat",thbk="bukan tahun kabisat";
int th;
Scanner input=new Scanner(System.in);
System.out.println("Hitung Tahun Kabisat");
System.out.println("--------------------");
System.out.print("Masukan Tahun (1900-2020): ");
th=input.nextInt();
if(th>=1900 && th<=2020)
if(th%4==0 && th%400==0){
System.out.println("Tahun " + th + " Adalah " + thk);
}else{
System.out.println("Tahun " + th + " Adalah " + thbk);
}
}
}
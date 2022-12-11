import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double ucret, kdvOran = 0.18;
		double kdvTutari, kdvliFiyat;
		
		System.out.println("Ücreti Giriniz: ");
		ucret = scan.nextDouble();
		
		if(ucret>1000) {
			kdvOran = 0.08;
		}
		
		kdvTutari = ucret * kdvOran;
		kdvliFiyat = ucret + kdvTutari;
		
		System.out.println("KDV'siz Fiyat: " + ucret);
		System.out.println("KDV'li Fİyat: " + kdvliFiyat);
		System.out.println("KDV Tutarı: " + kdvTutari);
	}

}

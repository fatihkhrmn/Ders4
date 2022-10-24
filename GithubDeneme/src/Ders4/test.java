package Ders4;

import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char []kullaniciCevaplari = new char[5];
		char []dogruCevaplar = {'B','C','A','D','A'};
		int soruSayisi=0;
		int dogruSayaci=0;
		
		while(soruSayisi!=5) {
			int i=0;
			soru1();
			char cevap =scan.next().charAt(0);
			if(cevap == dogruCevaplar[i]) {
				System.out.println("Doğru");
				kullaniciCevaplari[i] = cevap;
				i++;
				soruSayisi++;
				dogruSayaci++;
			}
			else {
				System.out.println("Yanlış");
				kullaniciCevaplari[i] = cevap;
				i++;
				soruSayisi++;
			}
			System.out.println();
			
			
			soru2();
			char cevap2 =scan.next().charAt(0);
			if(cevap2 == dogruCevaplar[i]) {
				System.out.println("Doğru");
				kullaniciCevaplari[i] = cevap2;
				i++;
				soruSayisi++;
				dogruSayaci++;
			}
			else {
				System.out.println("Yanlış");
				kullaniciCevaplari[i] = cevap2;
				i++;
				soruSayisi++;
			}
			System.out.println();
			
			
			soru3();
			char cevap3 =scan.next().charAt(0);
			if(cevap3 == dogruCevaplar[i]) {
				System.out.println("Doğru");
				kullaniciCevaplari[i] = cevap3;
				i++;
				soruSayisi++;
				dogruSayaci++;
			}
			else {
				System.out.println("Yanlış");
				kullaniciCevaplari[i] = cevap3;
				i++;
				soruSayisi++;
			}
			System.out.println();
			
			
			soru4();
			char cevap4 =scan.next().charAt(0);
			if(cevap4 == dogruCevaplar[i]) {
				System.out.println("Doğru");
				kullaniciCevaplari[i] = cevap4;
				i++;
				soruSayisi++;
				dogruSayaci++;
			}
			else {
				System.out.println("Yanlış");
				kullaniciCevaplari[i] = cevap4;
				i++;
				soruSayisi++;
			}
			System.out.println();
			
			
			
			soru5();
			char cevap5 =scan.next().charAt(0);
			if(cevap5 == dogruCevaplar[i]) {
				System.out.println("Doğru");
				kullaniciCevaplari[i] = cevap5;
				i++;
				soruSayisi++;
				dogruSayaci++;
			}
			else {
				System.out.println("Yanlış");
				kullaniciCevaplari[i] = cevap5;
				i++;
				soruSayisi++;
			}
			System.out.println();
			
	}
		if(dogruSayaci == 5) {
			System.out.println("Mükemmel");
		}
		else if(dogruSayaci == 4) {
			System.out.println("Çok İyi");
		}
		else {
			System.out.println("Küresel ısınma hakkında bilgilerinizi tazeleme zamanı");
		}
		System.out.println();
		System.out.println("KULLANICININ CEVAPLARI");
		System.out.println("*********");
		for(char i : kullaniciCevaplari) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		System.out.println("DOĞRU CEVAPLAR");
		System.out.println("*********");
		for(char i : dogruCevaplar) {
			System.out.print(i + " ");
		}
		
		
		
		
		
		
		

	}
	public static void soru1() {
		System.out.println("Hangi gezegenin atmosferi küresel ısınma ile yok edilmektedir?");
		System.out.println("A-Jüpiter\nB-Venüs\nC-Mars\nD-Merkür");
		
	}
	public static void soru2() {
		System.out.println("Küresel ısınmaya karşı en savunmasız hayvan hangisidir?");
		System.out.println("A-Kar Leoparı\nB-Kutup Ayısı\nC-Deniz Gergedanı\nD-Tukan");
		
	}
	public static void soru3() {
		System.out.println("Hangisi küresel ısınmanın bir etkisi olabilir?");
		System.out.println("A-Deniz seviyesinin yükselmesi\nB-Daha fazla ada tarımı\nC-Daha çok volkanik püskürme\nD-Daha fazla heyelan gerçekleşmesi");
		
	}
	public static void soru4() {
		System.out.println("Aşağıdakilerden hangisi toksik bir sera gazıdır?");
		System.out.println("A-Nitrojen\nB-Oksijen\nC-Karbonmonoksit\nD-Metan");
		
	}
	public static void soru5() {
		System.out.println(" Kirlilik havaya yayıldıkça ne azalır?");
		System.out.println("A-Ozon tabakası\nB-Okyanuslar\nC-Yağmur ormanları\nD-Karbondioksit");
		
	}

}
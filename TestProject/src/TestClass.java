import java.text.DecimalFormat;
import java.util.Scanner;

public  class TestClass {
	public static void main(String[] args){
		 
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Ýþlem Menüsü\n1-Toplama\n2-Çýkarma\n3-Çarpma\n4-Bölme\n");
 
        int islem;
        while(true){
 
            System.out.println("Lütfen Ýþlem Seçiniz (1-4) :");
            islem = scanner.nextInt();
 
            if(islem > 0 && islem < 5) {
                System.out.println("Lütfen iki sayý giriniz.");
                break;
 
            }
        }
 
        System.out.println("1.Sayý:");
        int s1 = scanner.nextInt();
 
        System.out.println("2.Sayý:");
        int s2 = scanner.nextInt();
 
        if(islem == 1){
 
            System.out.println(s1 + " + " + s2 + " = " + (s1+s2));
 
        }
        else if(islem == 2){
 
            System.out.println(s1 + " - " + s2 + " = " + (s1-s2));
 
        }
        else if(islem == 3){
 
            System.out.println(s1 + " * " + s2 + " = " + (s1*s2));
 
        }
        else if(islem == 4){
        	
        	DecimalFormat formatter2 = new DecimalFormat("##.##");
        	 
             double sonuc = (double)s1 / (double)s2 ;
             
             System.out.println(formatter2.format(sonuc));
             
           
 
        }
 
        
 
    }

	
	 
	 
	 
	}
import java.text.DecimalFormat;
import java.util.Scanner;

public  class TestClass {
	public static void main(String[] args){
		 
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("��lem Men�s�\n1-Toplama\n2-��karma\n3-�arpma\n4-B�lme\n");
 
        int islem;
        while(true){
 
            System.out.println("L�tfen ��lem Se�iniz (1-4) :");
            islem = scanner.nextInt();
 
            if(islem > 0 && islem < 5) {
                System.out.println("L�tfen iki say� giriniz.");
                break;
 
            }
        }
 
        System.out.println("1.Say�:");
        int s1 = scanner.nextInt();
 
        System.out.println("2.Say�:");
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
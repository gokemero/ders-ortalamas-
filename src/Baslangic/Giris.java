import java.sql.SQLOutput;
import java.util.Scanner;


public class Giris {
    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
System.out.println("ilk dersi girin  :");
   int a = input.nextInt();
System.out.println("2. dersi girin :");
  int b = input.nextInt();
  System.out.println("3. dersi girin :");
  int c = input.nextInt();
  float d = (a + b + c)/3;
boolean x = d >= 60;

     System.out.print("not ortalamanız :");
     System.out.println(d);
        String  sonuc = (x) ? "Geçtiniz" : "Kaldınız";
        System.out.println(sonuc);
    }
}

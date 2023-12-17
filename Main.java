import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int row,column;
        Scanner scan = new Scanner(System.in);
        System.out.println("Mayın Tarlasına Hoşgeldiniz !");
        System.out.println("Lütfen oynamak istediğiniz boyutları giriniz!");
        System.out.print("Satır Sayısı: ");
        row = scan.nextInt();
        System.out.print("Sütun Sayısı: ");
        column=scan.nextInt();


        MayinTarlasi mayin = new MayinTarlasi(row,column);
        mayin.run();
    }
}

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // önce veri tanımla
        double tutar,kdvoran;

        Scanner input=new Scanner(System.in);
        System.out.print("Fiyat girin=");

        tutar= input.nextDouble();

        kdvoran= 0.18;
        double kdv=kdvoran*tutar;
        double kdvlifiyat=(kdvoran*tutar)+tutar;

        System.out.print("KDV");
        System.out.println(kdv);
        System.out.print("KDV'li fiyat=");
        System.out.println(kdvlifiyat);
    }
    }

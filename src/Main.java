import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, toplam=0, counter=0;
        double ortalama;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        sayi = input.nextInt();

        if(sayi <= 0){
            System.out.print("Hatalı bir değer girdiniz!");
        }else{
            for(int i=1; i<=sayi; i++){
                if(i%3==0 && i%4==0){
                    toplam += i;
                    counter += 1;
                }
            }

            if(counter == 0){
                System.out.print("Math Error!");
            }else{
                ortalama = (double) toplam / counter;
                System.out.println("1'den " + sayi + "'ya kadar 3'e ve 4'e bölünebilen sayıların sayısı: : " + counter);
                System.out.println("1'den " + sayi + "'ya kadar 3'e ve 4'e bölünebilen sayıların toplamı: : " + toplam);
                System.out.println("1'den " + sayi + "'ya kadar 3'e ve 4'e bölünebilen sayıların toplamının ortalaması : " + ortalama);
            }
        }
    }
}
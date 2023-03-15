import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int[] dizi = new int[10000];
        Random rastgele = new Random();

        
        for (int x = 0; x < dizi.length; x++) {
            dizi[x] = rastgele.nextInt();
        }

        // Max Bulma Algoritması
        long baslangic = System.nanoTime();
        int max = maxBulma(dizi);
        long bitis = System.nanoTime();
        long calismaSuresi = bitis - baslangic;

        System.out.println("Max Bulma Algoritması çalışma süresi: " + calismaSuresi + " nanosaniye.");
     
        baslangic = System.nanoTime();
        int maxBrute = maxBulmaBruteForce(dizi);
        bitis = System.nanoTime();
        calismaSuresi = bitisZamani - baslangicZamani;

        System.out.println("BruteForce Algoritması çalışma süresi: " + calismaSuresi + " nanosaniye.");
    }

    public static int maxBulma(int[] dizi) {
        int max = Integer.MIN_VALUE;
        for (int x = 0; x < dizi.length; x++) {
            if (dizi[x] > max) {
                max = dizi[x];
            }
        }
        return max;
    }

    public static int maxBulmaBruteForce(int[] dizi) {
        int max = Integer.MIN_VALUE;
        for (int x = 0; x < dizi.length; x++) {
            for (int y = x + 1; y < dizi.length; y++) {
                if (dizi[j] > max) {
                    max = dizi[y];
                }
            }
        }
        return max;
    }
}

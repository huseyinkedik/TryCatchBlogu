import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner input = new Scanner(System.in);
        System.out.println("10 elemanlı tek boyutlu bir dizi içerisinde görmek istediğiniz indeksin numrasını girin:");
        int i = input.nextInt();
        try {
            System.out.println(i+".index: "+arr[i]);
        } catch (Exception e) {
            System.out.println("hata:dizi boyutu dışında index numarası girdiniz");
        }
    }
}
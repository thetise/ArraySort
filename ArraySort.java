package ArrayHomeworks;

import java.util.Arrays;
import java.util.Scanner;
public class ArraySort {
    public static void main(String[] args) {

        int n;

        System.out.print("Dizinin boyutu n : ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        int[] arr = new int[n];
        int temp;

        System.out.println("Dizinin elemanlarını giriniz: ");

        for(int i = 0; i < n; i++){
            System.out.print((i + 1) + ". Elamanı : ");
            arr[i] = input.nextInt();
        }

        System.out.print("Oluşturduğumuz dizi: ");
        System.out.println(Arrays.toString(arr));

        for(int j = 0; j < arr.length; j++){
            for(int k = 1; k < (arr.length - j); k++){
                if(arr[k - 1] > arr[k]){
                    temp = arr[k - 1];
                    arr[k - 1] = arr[k];
                    arr[k] = temp;
                }
            }
        }

        System.out.print("Küçükten büyüğe sıraladıktan sonra dizimiz: ");
        System.out.println(Arrays.toString(arr));
    }
}
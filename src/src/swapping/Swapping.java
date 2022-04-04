package swapping;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the elements");
        int[] array = new int[3];
        array[0]= s.nextInt();
        array[1]= s.nextInt();
        array[2]= s.nextInt();

        System.out.printf("Enter elements [%d,%d,%d] %n",array[0],array[1],array[2]);

        Ex81 ex = new Ex81();
        int[] finalresult = ex.swap(array);
        System.out.printf("Final result [%d,%d,%d] %n",array[2],array[1],array[0]);
    }
}

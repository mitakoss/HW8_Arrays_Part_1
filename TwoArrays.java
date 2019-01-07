/*
Дадени са два масива. Изведете на конзолата
true ако двата масива имат един и същ първи
или последен елемент.
 */

import java.util.Scanner;

public class TwoArrays {
    public static void main(String[] args) {
        compareArrays(getFirstArray(),getSecondArray());
    }

    public static int[] getFirstArray(){
        int [] firstArray = new int[3];
        Scanner inputFirstArray = new Scanner(System.in);
        for (int i = 0; i < firstArray.length ; i++) {
            System.out.print("Моля, въведете първия масив: ");
            firstArray[i] = inputFirstArray.nextInt();
        }
        return firstArray;
    }

    public static int[] getSecondArray(){
        int [] secondArray = new int[5];
        Scanner inputSecondArray = new Scanner(System.in);
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print("Моля, въведете втория масив: ");
            secondArray[i] = inputSecondArray.nextInt();
        }
        return secondArray;
    }

    public static void compareArrays(int arrayOne[], int arrayTwo[]){
        if (arrayOne[0] == arrayTwo[0] || arrayOne[arrayOne.length-1] == arrayTwo[arrayTwo.length-1]){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

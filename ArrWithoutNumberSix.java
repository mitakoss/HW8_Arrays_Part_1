/*
Даден е масив int[] array. Създайте нов масив
с елементите от първия, но без числото 6.
Пример:
int[] array = {2,4,5,6,8,6,3,4,6}
--> int[] array = {2,4,5,8,3,4}
 */

import java.util.Arrays;

public class ArrWithoutNumberSix {
    public static void main(String[] args) {
        int[] array = {2, 4, 5, 6, 8, 6, 3, 4, 6};
        printResult(array);
        System.out.println();
        makingNewArr(array);
    }

    public static void makingNewArr(int[] newArray) {
        int position = 0;
        int[] resultArray = new int[newArray.length];

        for (int elem: newArray) {
            if (elem != 6) {
                resultArray[position] = elem;
                position++;
            }
        }
        removingEmptyPosition(position, resultArray);
    }

    public static void removingEmptyPosition(int poss, int[] array){
        int[] finalArray = new int[poss];
        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = array[i];
        }
        printResult(finalArray);
    }

    public static void printResult(int[] array){
        System.out.println(Arrays.toString(array));
    }
}

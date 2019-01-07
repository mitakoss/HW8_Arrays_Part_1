/*
Въвеждат се от потребителя два масива с еднаква дължина.
Създайте масив, който на четни позиции съдържа елементите
от четните позиции на първия масив, а на нечетните позиции -
елементите от нечетните позиции.
 */
import java.util.Scanner;

public class ArrWithOddElements {
    public static void main(String[] args) {
        changeElementsOfArrays(getFirstArr(), getSecondArr());
    }

    public static int[] getFirstArr() {
        int[] firstArray = new int[6];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print("Моля, въведете първия масив: ");
            firstArray[i] = input.nextInt();
        }
        return firstArray;
    }

    public static int[] getSecondArr() {
        int[] secondArray = new int[6];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print("Моля, въведете втория масив: ");
            secondArray[i] = input.nextInt();
        }
        return secondArray;
    }

    public static void changeElementsOfArrays(int arrayOne[], int arrayTwo[]) {
        int[] reservedArray = arrayTwo;

        for (int i = 1; i < reservedArray.length; i += 2) {
            reservedArray[i] = arrayOne[i];
        }

        printAArrays(arrayOne);
        System.out.println();
        printAArrays(arrayTwo);
        System.out.println();
        printAArrays(reservedArray);
    }

    public static void printAArrays(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("element[%d] = %s%n", i, array[i]);
        }
    }
}

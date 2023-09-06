import java.util.Arrays;

/**
 * @author 1ommy
 * @version 06.09.2023
 */
public class Main {
    static int countReplaces2 = 0;

/*
    static int Factorial(int n) {
        if (n == 1)
            return 1;
        return Factorial(n - 1) * n;
    }
*/

    static int binarySearch(int a[], int x) {
        int l = 0, r = a.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (a[mid] == x) return mid;

            if (a[mid] < x) {
                l = mid + 1;
            } else if (a[mid] > x) {
                r = mid - 1;
            }
        }

        return -1;
    }

    static int partition(int[] array, int start, int end) {
        int pivot = array[end];

        int startIndex = start;

        for (int i = start; i < end; i++) {
            if (array[i] < pivot) {
                countReplaces2++;
                int copy = array[i];
                array[i] = array[startIndex];
                array[startIndex++] = copy;
            }
        }

        int copy = array[startIndex];
        array[startIndex] = array[end];
        array[end] = copy;
        countReplaces2++;
        return startIndex;
    }


    static void quickSoart(int a[], int start, int end) {
        if (start >= end) return;

        int pivot = partition(a, start, end);

        // рассматриваем и сортируем массив, содержащий элементы меньше опорного элемента
        quickSoart(a, start, pivot - 1);
        // рассматриваем и сортируем массив, содержащий элементы больше опорного элемента
        quickSoart(a, pivot + 1, end);
    }

    public static void main(String[] args) {
       /* int[] agesOfEmployees = new int[10000];
        int[] copyArray = new int[10000];
        // 18,19,20,25,29,40,53,54
//        System.out.println(agesOfEmployees.length);

        Random random = new Random();
        for (int i = 0; i < agesOfEmployees.length; i++) {
            agesOfEmployees[i] = random.nextInt(10000);
            copyArray[i] = agesOfEmployees[i];
        }

        //29,54,18,19,20,76
        int countOfReplaces = 0;
        for (int i = 0; i < agesOfEmployees.length; i++) {
            for (int j = 0; j < agesOfEmployees.length - 1; j++) {
                if (agesOfEmployees[j] > agesOfEmployees[j + 1]) {
                    countOfReplaces++;
                    int copy = agesOfEmployees[j];
                    agesOfEmployees[j] = agesOfEmployees[j + 1];
                    agesOfEmployees[j + 1] = copy;
                }
            }
        }
        Arrays.sort(copyArray);
        System.out.println(String.format("Количество перестановок в сортировке хоара: %d", countReplaces2));
        System.out.println(String.format("Количество перестановок %d", countOfReplaces));*/
        int arr[] = {1, 2, 2, 3, 4, 5, 18, 23, 46, 90};
        int x = 100;
        int indexOfX = binarySearch(arr, x);
        if (indexOfX != -1) {
            System.out.println(indexOfX);
        } else {
            System.out.println("Увы, такого элемента в массиве нет");
        }

        System.out.println(Arrays.binarySearch(arr, 900));
        /*for (int age : agesOfEmployees) {
            System.out.println(age);
        }*/


        int[] array = {1,2,6,8,9};
    }
}
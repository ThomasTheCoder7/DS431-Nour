package lab2;

public class SortingMethodsTest {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] x = {5, 8, 7, 13, 1, 4};
        print(x);
        // swapNew(x[0],x[1]);
        //insertionSort(x);
        //selectionSort(x);
        double startT = System.nanoTime();
        //  bubbleSort(x);
        //selectionSort(x);
        insertionSort(x);
        double endT = System.nanoTime();
         System.out.println("Time taken for sorting " + (endT - startT) / 1000000 + " seconds");
        print(x);
    }
    public static void insertionSort(int[] a) {
        int i, j, k, temp;
        for (i = 1; i < a.length; i++) {
            temp = a[i];
            j = findInsertPostion(a, i, temp);
            shiftR(a, i, j);
            a[j] = temp;
           // System.out.print("Pass " + (i) + "| ");
           // print(a);
        }
    }
    public static int findInsertPostion(int[] a, int i, int temp) {
        int j = 0;
        for (j = 0; j < i; j++) {
            if (a[j] > temp) {
                break;
            }
        }
        return j;
    }
    public static void shiftR(int[] a, int i, int j) {
        for (int k = i; k > j; k--) {
            a[k] = a[k - 1];
        }
    }

    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int m = findMinFrom(a, i);
            swap(a, i, m);
            System.out.print("Pass " + (i + 1) + "| ");
            print(a);
        }
    }

    public static int findMinFrom(int[] a, int start) {
        int min = start;
        for (int i = start + 1; i < a.length; i++) {
            if (a[i] < a[min]) {
                min = i;
            }
        }// for loop
        return min;
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void print(int[] a) {
        for (int j = 0; j < a.length; j++) // for each element,
        {
            System.out.print(a[j] + " ");  // display it
        }
        System.out.println("");
    }

    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    isSorted = false;
                }//if
            }//j
            if (isSorted) {
                break;
            }
            System.out.print("Pass " + (i + 1) + "| ");
            print(a);
        }// i

    }// bubblesort

}

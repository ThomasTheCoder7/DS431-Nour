package week07;
import java.util.Random;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
public class RangePerformanceEval {
    public static void main(String[] args) throws FileNotFoundException{
        
        File f = new File("c:\\temp\\lab2_results.csv"); 
        PrintWriter output = new PrintWriter(f);
        int[] experimentSize = {10,20,30,50,80, 1000, 2000,3000, 4000,5000,6000,6500, 8000,9000,9500, 16000};
        output.println("n,range1,range2,range3");
        for (int i = 0; i < experimentSize.length; i++) {
            System.out.println("==============================================");
            System.out.println("Results with N =" +experimentSize[i]);
        //    System.out.println("Results with N =" +1000);
            int n =experimentSize[i];
   
            output.print(n);
            output.print(",");
            int[] a = fillArray(n);
           
            double duration1 = runExperiment("range1", a);
            output.print(duration1);
            output.print(",");
            
            double duration2 = runExperiment("range2", a);
            output.print(duration2);
            output.print(",");
            double duration3 = runExperiment("range3", a);
            output.println(duration3);
            
            System.out.println("Time for range1 is " + duration1);
            System.out.println("Time for range2 is " + duration2);
            System.out.println("Time for range3 is " + duration3);
            System.out.println("==============================================");
    }
        output.close();
    }
    public static double runExperiment(String methodName, int[] arr) {
        double startTime, endTime, duration;
        startTime = System.nanoTime();
        if (methodName == "range1") {
            range1(arr);
        }
        if (methodName == "range2") {
            range2(arr);
        }
        if (methodName == "range3") {
            range3(arr);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000;
        return duration;
    }

    public static int[] fillArray(int n) {
        int[] arr = new int[n];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }
        return arr;
    }
    public static int range1(int[] numbers) {
        int maxDiff = 0;   int diff = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                diff = Math.abs(numbers[j] - numbers[i]);
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            }
        }
        return maxDiff;
    }
    public static int range2(int[] numbers) {
        int maxDiff = 0;         int diff = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                diff = Math.abs(numbers[j] - numbers[i]);
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            }
        }
        return maxDiff;
    }

    public static int range3(int[] numbers) {
        int max = numbers[0];     // find max/min values
        int min = max;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max - min;
    }

}

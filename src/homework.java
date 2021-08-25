import java.util.Arrays;

public class homework {

    public static void main(String[] args) {

        double[] myArray2 = { 6.3, 7.4, 8.4, -6.8, 5.2, 8.6, -6.12, -3.1, -0.89, 7.59, -8.82, 3.9, -7.2, 6.5, -0.11 };
        boolean firstNegativeFound = false;
        double sum = 0;
        for (int i = 0; i < myArray2.length; i++) {
            if (!firstNegativeFound && myArray2[i] < 0) {
                firstNegativeFound = true;
                continue;
            }
            if (firstNegativeFound) {
                sum += myArray2[i];
            }
            System.out.println(myArray2[i]);
        }
        System.out.println("Sum is " + sum);

        //Array sort

        int sArray[] = {1, 6, 13, 15, 9, 14, 10, 12};

        int n = sArray.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (sArray[j - 1] > sArray[j]) {
                    //Code to swap the elements
                    temp = sArray[j - 1];
                    sArray[j - 1] = sArray[j];
                    sArray[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(sArray));
    }

}


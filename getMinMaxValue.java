import java.util.Arrays;

/* Nour Hany Abdallah 19p4089 */

public class getMinMaxValue {

    public static int getMaxValue(int[] numbers) {
        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    public static int getMinValue(int[] numbers) {
        int minValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        return minValue;
    }

    public static void main(String args[]) {
        int arr[] = {1, 5, -11, 12, -3, 60, 18, 23, 4, -6};

        System.out.println("Minimum Value = " + getMinValue(arr));
        System.out.println("Maximum Value = " + getMaxValue(arr));

    }

}

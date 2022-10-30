package Array1;

public class AverageNumbers {

    public static void main(String[] args) {

        int[] array = {10, 20, 35, 15};

        int sum = 0;

        for (int i : array) {

            sum += i;
        }
        int avg = sum / array.length;

        System.out.println(avg);
    }
}

package Array1;

public class AverageNumbers {

    public static void main(String[] args) {

        int[] array = {10, 20, 35, 18};

        double sum = 0;

        for (int i : array) {

            sum += i;
        }
        double avg = sum / array.length;

        System.out.println(avg);
    }
}

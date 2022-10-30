package Array1;

public class AverageNumbers {

    public static void main(String[] args) {

        double[] array = {10, 20, 35, 15};

        double sum = 0;

        for (double i : array) {

            sum += i;
        }
        double avg = sum / array.length;

        System.out.println(avg);
    }
}

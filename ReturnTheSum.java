package Array1;

public class ReturnTheSum {

    public static void main(String[] args) {

        int[] arr = {56, 87, 6, -9, 98, -876, 3, -34, 22};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {

                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}

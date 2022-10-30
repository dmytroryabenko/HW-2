package Array1;

import java.util.Arrays;

public class ReverseOrder {

    public static void main(String[] args) {

        int[] num = {2, 3, 1, 7, 11,};

        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1; j++) {
                if (num[j] < num[j + 1]) {
                    int tmp = num [j];
                    num[j] = num [j + 1];
                    num [j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
}

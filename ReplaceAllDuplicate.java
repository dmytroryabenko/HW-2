package Array1;

import java.util.Arrays;

public class ReplaceAllDuplicate {

    public static void main(String[] args) {

        int[] array = {3, 2, 3, 1, 4, 2, 8, 3};

        for (int i : array) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j]) {

                    array [j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

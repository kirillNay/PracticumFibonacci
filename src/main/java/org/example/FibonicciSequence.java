package org.example;

public class FibonicciSequence {

    String[] getSequence(int length) {
        int a = 0;
        int b = 1;
        String[] result = new String[length];

        for (int i = 0; i < length; i++) {
            int sum = a + b;
            result[i] = String.format("%d. %d + %d = %d", i + 1, a, b, sum);
            a = b;
            b = sum;
        }

        return result;
    }

}

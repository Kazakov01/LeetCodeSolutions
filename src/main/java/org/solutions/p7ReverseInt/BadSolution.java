package org.solutions.p7ReverseInt;

public class BadSolution {
    public static void main(String[] args) {
        int i1 = 123;
        int i2 = -123;
        int i3 = 120;

        System.out.println(reverse(i3));
    }

    public static int reverse(int x) {
        String xStr = String.valueOf(x);
        StringBuilder sb = new StringBuilder();
        if(x > 0) {
            for (int i = xStr.length() - 1; i > -1; i--) {
                sb.append(xStr.charAt(i));
            }
            double xDbl = Double.parseDouble(sb.toString());
            if (xDbl < 2147483647.00) {
                return Integer.parseInt(sb.toString());
            } else {
                return 0;
            }

        } if (x < 0) {
            for (int i = xStr.length() - 1; i > 0; i--) {
                sb.append(xStr.charAt(i));
            }
            double xDbl = Double.parseDouble(sb.toString()) * -1.00;
            if (xDbl > -2147483648.00) {
                return Integer.parseInt(sb.toString()) * -1;
            } else {
                return 0;
            }
        }
        return 0;
    }
}

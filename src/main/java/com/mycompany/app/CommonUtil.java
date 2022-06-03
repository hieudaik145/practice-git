package com.mycompany.app;

public class CommonUtil {
    
    public static Integer sum(int a, int b) {
        int sum = a + b;

        return sum > 0 ? sum : 99;
    }

    public static Integer divide(int a, int b) {
        if (b == 0) {
            throw new IllegalCallerException("cannot divide by zero");
        }

        return a/b;
    }
}

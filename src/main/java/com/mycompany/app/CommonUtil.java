package com.mycompany.app;

public class CommonUtil {
    
    public static Integer sum(int a, int b) {
        int sum = a + b;

        return sum > 0 ? sum : 99;
    }
}

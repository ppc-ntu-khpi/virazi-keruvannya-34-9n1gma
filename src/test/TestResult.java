package test;

import domain.Exercise;
import java.util.Arrays;


public class TestResult {

    public static void main(String[] args) {
        int[]a = {3,6,7,1,7,1,7,8,7,1};
        

        System.out.println(Arrays.toString(a));  // Vyvodim na ekran masyv scho vyishov
        System.out.println("Chyslo scho naibilshe povtoryuetsya: " + Exercise.Calculate(a));
    }
}

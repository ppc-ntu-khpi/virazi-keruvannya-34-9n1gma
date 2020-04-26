package test;

import domain.Exercise;
import java.util.Arrays;


public class TestResult {

    public static void main(String[] args) {
        int[]a = {1,2,3,2,2,6,7,8,9,1};
        

        System.out.println(Arrays.toString(a));  // Виводим на екран масив що вийшов 
        System.out.println("Число що найчастіше повторюється " + Exercise.Calculate(a));
    }
}

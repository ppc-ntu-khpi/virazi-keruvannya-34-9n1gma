package domain;



public class Exercise {
    public static float Calculate(int[] a){
         
    
        int m = 1;                           // Описуємо потрібну змінну і масив
        int a1[] = new int[a.length];

        for (int i = 0; i < a.length; i++) {        // Створюєм масив з підрахунками
            for (int j = 0; j < a.length; j++){
                if ((a[j] == a[i] ) && (j != i)){ ++m;       }
            }
            a1[i] = m;
            m = 1;
        }

        int max = a1[0];
                                               // Шукаємо саме більше значення в масиві
        for (int i = 0; i < a.length - 1; i++){
            if (max <= a1[i+1]){
                max = a1[i+1];}
        }      
                                                  // Шукаємо якому значенню належить головний масив
        int res = 0;
        for (int i = 0; i < a1.length; i++){
            if (max == a1[i]){ 
                res = a[i];
                break;   // Найбільш  повторюване число виводим на екран
            }
        }
       
        return res;

    }
    
 }

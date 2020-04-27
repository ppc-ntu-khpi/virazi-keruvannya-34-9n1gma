package domain;



public class Exercise {
    public static float Calculate(int[] a){
         
    
        int m = 1;                           // Opysuyemo potribnu zminnu i masyv
        int a1[] = new int[a.length];

        for (int i = 0; i < a.length; i++) {        // Stvoryemo masyv z pidrahunkamy
            for (int j = 0; j < a.length; j++){
                if ((a[j] == a[i] ) && (j != i)){ ++m;       }
            }
            a1[i] = m;
            m = 1;
        }

        int max = a1[0];
                                               // Shukaemo same bilshe znachennya v masyvi
        for (int i = 0; i < a.length - 1; i++){
            if (max <= a1[i+1]){
                max = a1[i+1];}
        }      
                                                  // Shukaemo yakomu zhachenny nalezhit' masyv
        int res = 0;
        for (int i = 0; i < a1.length; i++){
            if (max == a1[i]){ 
                res = a[i];
                break;   // Naibilsh povtoryvane chyslo vyvodym na ekran
            }
        }
       
        return res;

    }
    
 }

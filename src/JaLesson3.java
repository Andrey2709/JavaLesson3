import java.lang.reflect.Array;
import java.util.Arrays;

import static java.util.Collections.min;

public class JaLesson3 {

    public static void main(String[] args) {


        //flipOver();

        //fill();

        // io();

        //cross();

        //layout(4,5);

        //arr();

        int[] array = {1,0,2,3,52,1,57} ;

        //checkBalance(array);
        //replacement(array,-3);
        //String str  = Arrays.toString(array);
        //System.out.println(str);

    }
// 1
    private static void flipOver(){
        int[] flip = {1,1,1,1,0,0,1,0,1,0,0};
        for (int i = 0; i < flip.length; i++) {
            if(flip[i] == 1) flip[i] =0;
            else flip[i]=1;
        }
        for (int i = 0; i < flip.length; i++) {
            System.out.println(flip[i]);
        }
    }
    //2
    private static void fill(){
        int[] filling = new int[100];
        for (int i = 0; i <filling.length ; i++) {
            filling[i]=i;
        }
        for (int i = 0; i <filling.length ; i++) {
            System.out.println(filling[i]);
        }

    }
    //3
    private static void io(){
        int[] fast = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i <fast.length ; i++) {
            if(fast[i]<6) fast[i] = fast[i] * 2;
        }
        for (int i = 0; i <fast.length ; i++) {
            System.out.println(fast[i]);
        }
    }
    //4
    private static void cross(){
        int[][] drop  = new int[5][5];
        for (int i = 0; i <drop.length ; i++) {
            for (int j = 0; j < drop.length; j++) {
                if(i == j) drop[i][j] = 1;
                else if((i+j) == (drop.length -1))drop[i][j] = 1;
            }
            
        }
        for (int i = 0; i <drop.length ; i++) {
            for (int j = 0; j < drop.length; j++) {
                System.out.print(drop[i][j]+" ");

            }
            System.out.println();
        }

    }
    //5
    private static int[] layout(int len, int initialValue){
        int[] oop = new int[len];
        for (int i = 0; i <oop.length ; i++) {
            oop[i] = initialValue;
        }
        for (int i = 0; i <oop.length ; i++) {
            System.out.println(oop[i]);
        }

            return oop;
    }
    //6
    private static void arr(){

        int[] minmax = {100,3,200,45,140,2,2,4,542,1,6};
        int max = 0;
        int min = minmax[0];
        for (int i = 0; i <minmax.length; i++) {
            if(max<minmax[i]) max = minmax[i];
            if(min>minmax[i]) min = minmax[i];
        }
        System.out.println("Min = " + min  + "\nMax = " + max);
    }
    //7
    private static boolean checkBalance(int[] a){
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i <a.length -2 ; i++) {
           sum1 += a[i];
        }
        for (int i = a.length-2; i< a.length ; i++) {
            sum2 += a[i];
            }
                return sum1==sum2;

        }


    //8
    private static void replacement(int[]a,int n){
      int take;
       if(n>0) {
           for (int i = 0; i < n; i++) {
               take = a[a.length - 1];
               for (int j = a.length - 1; j > 0; j--) {
                   a[j] = a[j - 1];
               }
               a[0] = take;
           }
       }
if(n<0){
    for (int i = n; i < 0; i++) {
        take = a[0];
        for (int j = 0; j <a.length-1 ; j++) {
            a[j] = a[j + 1];
        }
        a[a.length-1] = take;
    }
}

    }
    }


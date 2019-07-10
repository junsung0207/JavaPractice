package org.dimigo.basic;

public class SnackTest {
    public static void main(String[] args) {

        Snack[] arr = new Snack[]{
                new Snack("새우깡","농심",1100,2),
                new Snack("콘칲","크라운",1200,1),
                new Snack("허니버터칩","해태",1500,4)
        };

        printSnack(arr);

        int FinalNum=0;
        for(int i = 0 ; i< 3 ; i ++){
            FinalNum += arr[i].calcPrice();
        }
        System.out.printf("총 구매 금액 : %,d원",FinalNum);

    }

    private static void printSnack(Snack[] SnackArr) {
        for(Snack value : SnackArr){
            System.out.println(value);
        }
    }
}

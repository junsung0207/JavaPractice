package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class MyFavorite {
    private static String[ ] questions = {

            "가장 좋아하는 가수는?",

            "가장 좋아하는 배우는?",

            "가장 좋아하는 과목은?"

    };

    private static String[] answers = {

            "숀",

            "박신혜",

            "자료구조"

    };


    public static void main(String[] args) {

        int ChooseNum=3;

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("------------------");
            System.out.println("1. 질문 선택");
            System.out.println("2. 정답 공개");
            System.out.println("9. 프로그램 종료");
            System.out.println("------------------");
            System.out.printf("메뉴 선택 -> ");
            String answer = scanner.next();
            if(answer.equals("1")){
                int Qnum = new Random().nextInt(3);
                if(Qnum == 0){
                    System.out.println("가장 좋아하는 가수는? ");
                    String Singer = scanner.next();
                    if(Singer.equals(answers[0])){
                        System.out.println("정답입니다!");
                    }
                    else{
                        System.out.println("틀렸습니다!");
                    }
                }
                else if(Qnum == 1){
                    System.out.println("가장 좋아하는 배우는? ");
                    String Singer = scanner.next();
                    if(Singer.equals(answers[1])){
                        System.out.println("정답입니다!");
                    }
                    else{
                        System.out.println("틀렸습니다!");
                    }
                }
                else{
                    System.out.println("가장 좋아하는 과목은? ");
                    String Singer = scanner.next();
                    if(Singer.equals(answers[2])){
                        System.out.println("정답입니다!");
                    }
                    else{
                        System.out.println("틀렸습니다!");
                    }
                }
            }
            else if(answer.equals("2")){
                StringBuilder Ans = new StringBuilder();
                for(int i = 0 ; i < 3; i++){
                    Ans.append(questions[i]).append(" ").append(answers[i]).append("입니다.\n");
                }
                System.out.printf("%s",Ans);
            }
            else if(answer.equals("9")){
                System.out.println("Bye~");break;
            }
            else{
                System.out.println("없는 메뉴입니다.");
            }
        }
    }
}

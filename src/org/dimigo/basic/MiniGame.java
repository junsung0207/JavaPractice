package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

public class MiniGame {
    public static void main(String[] args) {

        int[] attackPoint = {100,100,100,100};
        String[] character = {"마법사", "영주", "기사", "농민"};
        Scanner scanner = new Scanner(System.in);

        int CharNum = 0, IsChar = 0;
        int menu;

        do{
            System.out.println("--------------------");
            System.out.println("<< 게임 메뉴 >>");
            System.out.println("1. 케릭터 설정");
            System.out.println("2. 공격력 증가");
            System.out.println("3. 공격력 감소");
            System.out.println("9. 종료");
            System.out.println("--------------------");
            System.out.print("메뉴 입력 => ");

            menu = scanner.nextInt();

            switch(menu){
                case 1:{
                    IsChar = 1;
                    CharNum = new Random().nextInt(4);
                    System.out.println(character[CharNum] + "(으)로 설정하셨습니다.");
                    break;
                }
                case 2:{
                    if(IsChar == 1){
                        attackPoint[CharNum] += 10;
                        System.out.println(character[CharNum] + " 공격력이 증가되었습니다. 현재 공격력 : " + attackPoint[CharNum]);
                        break;
                    }
                    else{
                        System.out.println("먼저 캐릭터를 설정하세요!!");
                        break;
                    }
                }
                case 3:{
                    if(IsChar == 1){
                        attackPoint[CharNum] -= 10;
                        System.out.println(character[CharNum] + " 공격력이 감소되었습니다. 현재 공격력 : " + attackPoint[CharNum]);
                        break;
                    }
                    else{
                        System.out.println("먼저 캐릭터를 설정하세요!!");
                        break;
                    }
                }
                case 9:{
                    scanner.close();
                    break;
                }
                default:{
                    System.out.println("없는 메뉴입니다!!");
                }
            }
        }while(menu != 9);
        System.out.println("이제 공부하세요!");
    }
}

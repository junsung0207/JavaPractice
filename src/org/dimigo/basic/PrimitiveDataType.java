package org.dimigo.basic;

public class PrimitiveDataType {
    public static void main(String[] args) {
        String name = "아이유";
        boolean isMale = false;
        int age = 25;
        double height = 161.8;
        float weight = 44.3f;
        char bloodType = 'A';
        String titleSong = "삐삐";

        System.out.printf("<<아이유 프로필>>\n");
        System.out.printf("이름 : %s\n",name);
        System.out.printf("성별 : ");
        System.out.printf(isMale? "남자\n":"여자\n");
        System.out.printf("나이 : %d세\n", age);
        System.out.printf("키 : %.1fcm\n",height);
        System.out.printf("몸무게 : %.1fkg\n",weight);
        System.out.printf("혈액형 : %c형\n",bloodType);
        System.out.printf("대표곡 : %s\n",titleSong);
    }
}

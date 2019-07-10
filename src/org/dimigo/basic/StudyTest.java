package org.dimigo.basic;

public class StudyTest {
    public static void main(String[] args) {

        String name = "아이유";
        Boolean girl = true;
        int age = 25;
        double height = 161.8;
        float weight = (float) 44.3;
        String blood = "A";
        String song = "삐삐";

        System.out.println(height + " / "+ weight);

        System.out.println((age >= 25) ? "yes":"no");




        switch(age){
            case 20:
                System.out.println("20");
                break;
            case 250:
                System.out.println("25");
                System.out.println("25");
                break;
                default:
                    System.out.println("no");
                    break;
        }
    }
}

package org.dimigo.basic;

public class CarTest2 {

    public static void main(String[] args) {
        System.out.println("<< 자동차 목록 >>");

        Car2 car[] = {new Car2("현대자동차","제네시스","검정색",225,50000000),
                 new Car2("기아자동차","K7","흰색",246,40000000),
                 new Car2("삼성자동차","SM7","회색",200,38000000)};


        for(int i = 0 ;i < 3 ; i++){
            System.out.printf("제조사명 : %s\n",car[i].getCompany());
            System.out.printf("모델명 : %s\n",car[i].getModel());
            System.out.printf("색상 : %s\n",car[i].getColor());
            System.out.printf("최대속도 : %dkm\n",car[i].getMaxSpeed());
            System.out.printf("가격 : %,d원\n\n",car[i].getPrice());
        }
    }
}

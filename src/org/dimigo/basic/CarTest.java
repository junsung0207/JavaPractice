package org.dimigo.basic;

public class CarTest {

    public static void main(String[] args) {
        System.out.println("<< 자동차 목록 >>");

        Car car[] = {new Car(), new Car(), new Car()};

        car[0].setColor("검정색");
        car[0].setCompany("현대자동차");
        car[0].setMaxSpeed(225);
        car[0].setModel("제네시스");
        car[0].setPrice(50000000);

        car[1].setColor("흰색");
        car[1].setCompany("기아자동차");
        car[1].setMaxSpeed(246);
        car[1].setModel("K7");
        car[1].setPrice(40000000);

        car[2].setColor("회색");
        car[2].setCompany("삼성자동차");
        car[2].setMaxSpeed(200);
        car[2].setModel("SM7");
        car[2].setPrice(38000000);



        for(int i = 0 ;i < 3 ; i++){
            System.out.printf("제조사명 : %s\n",car[i].getCompany());
            System.out.printf("모델명 : %s\n",car[i].getModel());
            System.out.printf("색상 : %s\n",car[i].getColor());
            System.out.printf("최대속도 : %dkm\n",car[i].getMaxSpeed());
            System.out.printf("가격 : %,d원\n\n",car[i].getPrice());
        }
    }
}

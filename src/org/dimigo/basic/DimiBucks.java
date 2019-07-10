package org.dimigo.basic;

public class DimiBucks {
    public static void main(String[] args) {
        System.out.println("<< 디미벅스 연간 인건비 >>");
        long month_wage = 1700000L;
        long Zigwon = 3L;
        long Market_num = 1500L;
        System.out.println("월 평균 급여 : " + String.format("%,d", month_wage) + "원");
        System.out.println("점포 내 직원 수 : " + Zigwon + "명");
        System.out.println("점포 수 : " + String.format("%,d",Market_num) + "개");

        long total = month_wage * 12 * Zigwon * Market_num;
        System.out.printf("연간 인건비 : %,d원", total);

    }
}

package operator_20;

import java.util.Scanner;

public class Quiz02 {

  public static void main(String[] args) {
    
    /**
     *-------------------------------------------------
     * 1) int형 변수 age를 선언하고 자신의 나이를 대입합니다.
     * 2) year 변수를 선언하고, age 변수를 사용하여 자신이 태어난 년도를 계산하여 대입하세요.
     *    
     * [출력결과 예시]
     *--------------------------------------------------
     * 1990년도에 태어났습니다.
     */
    
    System.out.println("당신의 나이를 입력하세요");
    
    Scanner sc = new Scanner(System.in);
    int aage = sc.nextInt();
    
    int age = 16;
    int year = 2023 - age;
    
    System.out.println(year + "년도에 태어났습니다.");
    
  }
}

package basic_API_90;

import java.util.Random;

public class Ex100_Random {

  public static void main(String[] args) {
    
    //특정범위의 수를 랜덤으로 추출하는 클래스 Random
    Random random = new Random();
    
    //10을 넘지 않는 정수 추출 -> 0~9
    int nowIdx = random.nextInt(10); //10포함이 안됨, 쓴 숫자는 안나옴.
    System.out.println("nowIdx = " + nowIdx);
    
    //0.0 =< x < 1.0 범위의 실수 추출-> 1.0은 미포함
    double dbl = random.nextDouble();
    System.out.println("dbl =" + dbl);
  }
}

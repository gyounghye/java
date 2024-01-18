package class_50;

class Cal{
  /*
    오버로딩의 조건
    1. 함수명이 같아야 한다.
    2. 매개변수의 개수 or 매개변수의 타입 or 매개변수의 순서 가 달라야 한다.
    3. 리턴타입은 아무 관계없다.
   */
  
  //아래의 plus()메소드 호출이 잘 작동하도록 오버로딩 하시오.
   public void plus(int a, int b){
       System.out.println(a+b);
    }
   
   public void plus(float i, float j) { //float 4비트
     System.out.println(i+j);
   }
   
   public void plus(double d, double e){ //double 8비트
     System.out.println(d+e);
   }
}

public class Ex100_CalculatorMain {

  public static void main(String[] args) {
    
    Cal cal = new Cal();
   
    cal.plus(3, 5);
    cal.plus(0.1f, 0.2f);
    cal.plus(0.5d, 0.7d);  
    
  }
}

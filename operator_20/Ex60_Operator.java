package operator_20;

public class Ex60_Operator {

  public static void main(String[] args) {
    
   // boolean 타입의 값은 2개 -> true / false :주로 비교 연산할 때 사용
   //비교 연산에 대한 결과는 boolean 값이다.
    int a = 123;
    int b = 456;
    // == 는 비교연산기호: a와 3이 같은가요?
    boolean result1 = a == 3; //false
   
    //!= 는 같지 않다는 뜻 (!는 not의 의미)
    boolean result2 = a != b; //true
    
    boolean result3 = a > b; //false
    
    boolean result4 = a <= b; //true
    
    System.out.println("1. result1 = " + result1);
    System.out.println("2. result2 = " + result2);
    System.out.println("3. result3 = " + result3);
    System.out.println("4. result4 = " + result4);
    
  }
}

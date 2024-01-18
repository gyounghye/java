package operator_20;

public class Ex40_Operator {

  public static void main(String[] args) {
    
    int a = 1;
    a = a + 1;//2
    a += 1;//3
    
    //단독으로 사용할 경우 전위와 후위증감연산자의 결과는 같다. 
    a ++; //4 후위 증가 연산자
    ++a;//전위는 잘 사용하지 않음.
    
    System.out.println("1. a = " + a);
    
    int b = 5;
    b = b - 1;
    b -= 1;
    b --; //감소 연산자
    
    System.out.println("2. b = " + b);
  }//end of main
}

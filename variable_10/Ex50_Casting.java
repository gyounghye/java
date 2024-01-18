package variable_10;

public class Ex50_Casting {

  public static void main(String[] args) {
    
// 자동 형변환: 작은 범주의 데이터가 큰범주의 데이터타입으로 자동 변환
    short s = 100; // 짧은 범위의 정수
    int i = s; // 보통범위의 정수
    long l = i; // 큰범위의 정수
    float f = l; // 실수
    double d = f; // 큰 범위의 실수
    
//자동형변환 예제
   int myWeight = 50;
   double dulyWeight = 25.7d;
   
   double result1 = myWeight - dulyWeight;
   int result2 = (int) (myWeight - dulyWeight);
   
   System.out.println("result1 = " + result1);
   System.out.println("result2 = " + result2);
   
    
  }//end of main()
  
}

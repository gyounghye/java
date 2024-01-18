package exception_110;

//문자로된 잘못된 값을 숫자로 변환시 예외처리하는 예제
public class Ex30_NumberExceptionHandling {

  public static void main(String[] args) {
    
    String count = "이십";
    
    try {
      //숫자로 변환할 수 없으면 NumberFormatException 예외오류가 발생한다.
      //만약 예외오류가 발생하면 그 아래의 코드는 실행되지 않고 프로그램이 멈춘다.
      int totCount = 100 + Integer.parseInt(count);
      
      System.out.println("totCount = " + totCount);
      
    }catch(NumberFormatException e) {  //최상위 클래스가 Exception여서 Exception것만 써도 된다. 자세하게 쓰는 것이 좋다.
      //예외오류 발생시 실행시킬 코드영역 
      System.out.println("숫자로 변환할 수 없는 값으로 인해 에러가 발생했습니다.");
      System.out.println("원인 : " + e.getMessage());
   
    }finally {
      System.out.println("예외오류 발생과 상관없이 무조건 실행되는 finally 코드 블럭"); //finally블럭은 생략가능
    }
    
    
    System.out.println("프로그램을 종료합니다.------------------------------");
  }
}

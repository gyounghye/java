package exception_110;

/*
 Exception 이란? 실행할 때 발생하는 예기치 않은 사건 -> 자바는 예외가 발생하면 예외 클래스로부터 객체를 생성해 예외 처리시 사용
 
   오류의 종류
 
     1. 문법(Compile)오류 - 오류가 나면 빨간줄 생겨 확인이 되며 해결난이도가 가장 낮다.
     
     2. 논리오류 - 해결난이도가 가장 높다.
     
     3. 실행(Runtime)오류 - 실행조건에 따라 발생할 수 있는 오작동 -> 이때 예외오류 발생
       예) HDD고장, 메모리고장, 메모리부족, 인터넷끊김, 정전시 오작동
       이 실행 오류는 논리적으로 문제없는 코드이기는 하지만 ...
       
       -> 해결방법
           만약 내가 작성한 코드가 오류가 발생할 여지가 있는 코드라면 
           try~catch~finally 구문을 작성한다. -> 예외가 발생하더라도 프로그램의 갑작스런 종료를 막고 정상 실행을 유지할 수 있도록 처리
      
     4. Exception 의 구분
     
       1) Checked 익셉션
         -> 컴파일러가 예외처리 구문 작성을 강제로 지시함
         
       2) UnChecked 익셉션
         -> 개발자가 필요에 의해 예외처리 구문을 작성(강제아님)
         -> NumberFormatException, ArrayIndexOutOfBoundsException의 겨우에는 예외처리를 강제하지 않는다.
         -> RuntimeException을 상속받은 익셉션의 경우 예외처리 구문 작성이 필수가 아니다.
         -> 즉, 의무적으로 작성하지 않아도 에러로 잡히지 않는다. 
 */

public class Ex10_Exception_is {

  public static void main(String[] args) {
    
    //실험-1
    String year = "1980";
    int myAge = 2024- Integer.parseInt(year); //문자를 숫자로 변환 (정상작동)-> API의 WrapperClass에서 확인
    System.out.println("myAge = " + myAge);
    
    //실험-2
    String count = "이십";
    
    //숫자로 변환할 수 없으면 NumberFormatException 예외오류가 발생한다.
    //만약 예외오류가 발생하면 그 아래의 코드는 실행되지 않고 프로그램이 멈춘다.
    int totCount = 100 + Integer.parseInt(count);
    System.out.println("totCount = " + totCount);
    
   System.out.println("프로그램을 종료합니다.------------------------------");
    
  }
}

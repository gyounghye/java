package exception_110;

//다중 예외처리를 설명하는 예제
public class Ex50_MultiExceptionHandling {

  public static void main(String[] args) {
    
    String msg = null;
    int a = 100;
    int b = 0;
    
    // checked 익셉션(빨간줄 보임) - 강제로(무조건) 예외처리를 해야 하는 코드
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {      
     // e.printStackTrace();
    }
    
    
    //unChecked 익셉션    
    try {
      //java.lang.NullPointerException 에러발생 
      msg = "안녕하세요~";
      System.out.println("msg 문자열의 길이 = " + msg.length()); // -> unchecked 익셉션이라 빨간줄 안보인다.
      
      System.out.println("a / b = "+ a / b);
      
    }catch(NullPointerException e) {
      System.out.println("null 값을 가진 문자열변수의 길이측정을 시도해서 오류가 발생했습니다.");
    
    }catch(ArithmeticException e) {
      System.out.println("0으로 나누어서 오류가 발생했습니다.");
    
    }catch(Exception e) {
      System.out.println("원인을 알 수 없는 예외오류가 발생했습니다."); //어떤오류가 발생할지도 모르니 통합적으로 쓴다.
      e.printStackTrace(); //오류 원인 추적
    
    }finally {
      System.out.println("오류가 있건 없건간에 무조건 실행됩니다.");
    }
    
    System.out.println("실제로 이 뒤로 엄청 많은 출력이 있어요.");
    System.out.println("★★★★★ 프로그램 종료 ★★★★★");
  }
}

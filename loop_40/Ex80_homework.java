package loop_40;

public class Ex80_homework {

  public static void main(String[] args) {
    
  //연습문제 - 3의 배수 이면서 5의 배수 찾기

    /**
     *-------------------------------------------------
     * 1부터 100까지의 자연수 중에서 3의 배수이면서 동시에 5의 배수인 숫자를 출력하여보자.
     * 
     * [출력결과 예시]
     *--------------------------------------------------
     * 15
     * 30
     * 45
     * 60
     * 75
     * 90
     */
    
    //3의 배수 회전
    for(int i = 3; i<=100; i += 3) {
      
      if (i % 5 == 0) {
        System.out.println(i);
      }
      
    }
    System.out.println();
    
    //5의 배수이면서 8의 배수 
    for(int i = 8; i<=100; i+=8) {
      if(i % 5 == 0) {
        System.out.println(i);
      }
      
    }
    
    //
    
    
    
    
    
    
  /*  for(int i = 1; i <= 100; i++) {
      if(i % 3 == 0 && i % 5 == 0){
        System.out.println(i);
      }
      
    }*/
    
  }//main 
}

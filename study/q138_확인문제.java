package study;

public class q138_확인문제 {

  public static void main(String[] args) {
    
    //3. 1~100 중 3의 배수 총합
    int sum = 0;
    for(int i=1; i<=100; i++) {
      if(i%3==0) {
        sum += i;
      }      
    }
    System.out.println("3의 배수의 합: "+sum);
    
    //5. 4x+5y=60 의  모든 해 x,y=10이하 자연수 (x,y)형태
    int x, y = 1;
    
    
  }
}

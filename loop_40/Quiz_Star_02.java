package loop_40;

public class Quiz_Star_02 {

  public static void main(String[] args) {
    
    //유형3
    for(int i=1; i<=10; i++) { //회전수
      
      //공백찍기
      for(int b=1; b<=10-i; b++) {
        System.out.print(" ");
      }
      //별찍기
      for(int s=1; s<1+i; s++) {
        System.out.print("*");
      }
      //줄바꿈
      System.out.println();
    }
    
    System.out.println();
    System.out.println();
    
    //유형4
    for(int i=1; i<=10; i++) { //회전수
      for(int b=1; b<=1+i; b++) { //공백찍기
        System.out.print(" ");
      }
      for(int s=1; s<=10-i; s++) {
        System.out.print("*");//줄바꿈
      }
      System.out.println();
    }
  }
}

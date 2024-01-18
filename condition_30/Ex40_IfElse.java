package condition_30;

import java.util.Scanner;

//if~else 모 아니면 도
public class Ex40_IfElse {

  public static void main(String[] args) {
    
    System.out.println("토익 점수를 입력해주세요");
    
    Scanner sc = new Scanner(System.in);
    int scor = sc. nextInt();
    
    if(scor >= 600) {
      System.out.println("영어 좀 공부 했군요~!");
    } else {
      System.out.println("보충학습 후 다시 한번 도전해 보세요~!");
    }
    
  }//end of main
}

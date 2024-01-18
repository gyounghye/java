package loop_40;

// 128페이지 구구단 작성 
public class Ex40_GuGuDan {

  public static void main(String[] args) {
    
    for (int m=2; m<=9; m++) {
      System.out.println("*** " + m + "단 ***");
      for (int n=1; n<=9; n++) {
        System.out.println(m + "x" + n + "=" + (m*n));
      }
    }
    
  }
}

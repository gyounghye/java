package condition_30;

public class Ex30_If_Simple {

  public static void main(String[] args) {
    
    boolean isKorean = true;
    
    
    
    if (isKorean == true) {
      System.out.println("한국 사람 입니다.");
    }
    
    if (isKorean) {
      System.out.println("한국 사람 입니다."); // isKorean == true 와 isKorean 는 같다.
    }
    
    if(isKorean != false) {
      System.out.println("한국 사람이 아닙니다.");
    }
    
    if(!isKorean) {
      System.out.println("한국 사람이 아닙니다."); // isKorean != false 와 !isKorean 는 같다.
    }
    
    
    boolean isJapanese = false;
    
    if (!isJapanese) {
      System.out.println("일본 사람 입니다.");
     }
    
    if (isJapanese) {
      System.out.println("일본 사람이 아닙니다.");
    }
    
      
    
  }
}

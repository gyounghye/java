package array_80;

public class Ex10_Array {
  public static void main(String[] args) {
    
    //js에서는 const num = [1,2,3]; 배열의 크기가 고무줄이어서 추가 삭제, 빈배열 가능
    
    /*자바 배열의 특징
     * 1. 단순히 양적인 저장공간
     * 2. 배열의 크기를 변경할수 없다.(자바스크립트는 가능)
     * 3. 배열 선언시 크기를 지정해야 함(자바스크립트는 하지 않는다)
     * 4. 배열의 길이는 "배열명.length'로 확인      
    */
    
    //자바에서는 배열의 크기를 정하고 그대로 사용함. 동적으로 추가못한다. 
    //배열 선언시 크기를 지정해야 함.
    int[] num = new int[3]; 
    
    num[0] = 75;
    num[1] = 82;
    num[2] = 91;
    
   // num[3] = 33; 예외오류 발생, 3개밖에 못들어가는데 4개여서 에러
    
    //전통적인 for문을 사용하여 배열의 아이템 출력
    for(int i=0; i<num.length; i++) {
      System.out.println(num[i]);
    }
    
    System.out.println("---------------------------------");
    
    //배열생성시 일괄 값할당, 배열 생성과 동시에 값입력
    int[] score = new int[] {100, 80, 90};
    
    //어드벤스드한 for문을 사용하여 배열의 아이템 출력 -> value에 score배열의 값을 순서대로 넣어준다.
      for(int value : score) {
        System.out.println(value);      
    }
    
    
  }//main
}

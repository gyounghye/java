package exception_110;

//배열의 예외발생에 대한 설명하는 예제
public class Ex20_Array_Exception {

  public static void main(String[] args) {
    
    int[] arrNum = new int[3]; // 크기가 3으로 고정되어 있어 5개 출력시도하여 에러발생 
    
    //i값이 3이되는 순간 ArrayIndexOutOfBoundsException 예외오류 발생한다.-> 따라서 안전한 표기법은 5숫자 대신에 arrNum.length 쓴다.
    for(int i = 0; i<5; i++) {
      //예외오류 발생 회피용 if구문
     // if(i<arrNum.length) {
        arrNum[i] = i;
        System.out.printf("\n arrNum[%d] = %d" , i, arrNum[i]);
        
     // }
    }
    
  }
}

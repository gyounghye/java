package variable_10;

/*
 * 자바프로그램 소스의 최소단위는 클래스 이다.
 * 클래스명은 .java 파일명과 일치해야 하며, 영어/숫자/언더바만 사용한다. (언더바는 잘사용안한다)
 * 특히, 첫 글자는 반드시 영문대문자로 시작 
 */


public class Ex20_Variable {

  //실행함수 main() - 프로그램의 사작점
  public static void main(String[] args) {
    
    //콘솔에 문장을 출력하기 위한 명령어
    //문장을 표현하는 방법--> ""로 묶는다.-->문자열
    System.out.println("독도는 대한민국 영토~!");
    
   
    //"둘리"를 갑으로 가지는 문자열 변수 name을 선언하고 값을 할당하시오.
    //변수의 선언과 할당을 동시에
    String name = "둘리";
    
    //선언과 할당을 분리
    int age;
    age = 7;
    
    
   
    //name변수를 이용하여 "내친구 둘리"로 출력되도록 코드를 작성하시오.
    System.out.println("내친구 "+ name);
    
    //내친구 둘리는 7살입니다.
    
  } //end of main()
}
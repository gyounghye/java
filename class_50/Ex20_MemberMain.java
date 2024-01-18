package class_50;

//일반적으로 멤버변수는 선언만 한다.         예)붕어빵틀
class Member{ //속성만 있다. 메소드 없어도 클래스가 된다.  main이 없어 실행x
  String address="서울"; //필요에 따라 값을 설정할 수도 있다.
  String name; // 기본값이 null로 초기화
  int age; // 0으로 초기화
}

public class Ex20_MemberMain {

 public static void main(String[] args) { //main은 실행 가능한 클래스 
   
   //하나의 클래스가 정의되면, 그 클래스의 구조를 기반으로 하는 여러개의 객체(정보묶음)을 생성할 수 있다. 
   Member hong = new Member(); // 예)붕어빵내용물1  
   hong.name = "홍길동";
   hong.age = 16;
   
   System.out.println(hong.name); //예) 붕어빵내용물 꺼내옴  
   System.out.println(hong.age);
   
   
   Member duly = new Member();
   
   duly.name = "둘리";          // 예)붕어빵내용물2 (여러개 만들수 있다)
   duly.age = 7;
   
   System.out.println(duly.name);
   System.out.println(duly.age);
   
   
/* String name; 초기값이 없다.
   int age;
   System.out.println(name); 에러발생
   System.out.println(age);
*/
 }
}

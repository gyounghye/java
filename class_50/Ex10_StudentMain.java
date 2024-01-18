package class_50;

// public class Student => public은 하나만 써야한다. 그 이상이면 에러난다.

//멤버변수로만 이루어진 클래스 => 사용자 정의 데이터타입
class Student{ //공간이 2개인 데이터타입 만들었다.
  //멤버변수, 필드
  String name = "홍길동"; //보통은 값을 넣지 않는다.
  int age = 16;
}

public class Ex10_StudentMain {
  
 public static void main(String[] args) {
    
   //객체의 선언과 할당 분리 (예)int x;     x=100;
   Student hong;
   hong = new Student();
   
   
   // 예) int x = 100; (선언과 할당 같이) 
   //객체(변수) 생성
  // Student hong = new Student(); //  new 는 메모리를 만들겠다라는 뜻
   //클래스 이름은 홍이고 새로운 메모리를 만들겠다.
    
    System.out.println("1. 이름 : " + hong.name);
    System.out.println("2. 나이 : " + hong.age);
  }
}

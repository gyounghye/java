package class_50;

//생성자함수를 오버로딩하여 멤버변수의 값을 초기화
class Magic{
  private int num;
  private String color;
  
    
  
  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  //기본 생성자 함수: 자동으로 컴파일러가 넣어준다. 아래와 같이 직접 써도 상관없다.
  //보이지 않는 가상 매개변수 this를 컴파일러가 첫번째 매개변수로 넣어준다. 
  public Magic() {}
  
  //Constructor OverLoading
  //보이지 않는 가상 매개변수 this를 컴파일러가 첫번째 매개변수로 넣어준다. -> this.int num 있다고 생각
  public Magic(int num, String color) {
    this.num = num;
    this.color = color;
  }
  
  void show() {
    System.out.println("this = "+ this); //magic_1과 magic_2의 this 값이 다르다
    System.out.println("num = " + this.num); //멤버변수 활용시 무조건 this 붙여쓰자
    System.out.println("color = " + this.color);
  }
  
  
}

public class Ex80_MagicMain {

  public static void main(String[] args) {
    
   // int age; //초기화가 안된 변수의 값을 출력시도해서 에러발생 (함수 안에서 선언한 지역변수는 자동 초기화가 안된다.)
    //System.out.println("age = " + age);
    
    Magic magic_1 = new Magic();
    
    //멤버변수에 직접접근은 좋지않다. 최소화시킴 -> 멤버변수에 private 을 붙인다. ->게터와 세터로 핸들링 한다.
   // magic_1.num = 100;   // magic_1.color = "Red";
    
    magic_1.show();
    
    //생성자함수를 이용한 멤버변수 초기화
    Magic magic_2 = new Magic(7, "블루");
    magic_2.show();
    
  }//main
}

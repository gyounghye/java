package class_50;

class Car{
  
  int number, speed; //클래스의 직계자식인 멤버변수(속성, Property):  값을 정하지 않으면 자동으로 0으로 초기화
  
  String color; //null값으로 초기화
  
  public String getColor() {
    return this.color; // this에 객체의 참조값(myCar,yourCar)이 들어온다.
  }
  
  public void setColor(String color) {
    this.color = color;
  }
  
  //멤버함수(멤버메소드, 메소드, 함수) -> 자바에서 같은 의미
  void speedUp() {
    System.out.println("속도를 100만큼 올립니다.");
    speed += 100;
  }
  
  void speedDown() {
    System.out.println("속도를 50만큼 내립니다.");
    speed -= 50;
  }  
}

public class Ex70_CarMain {

  public static void main(String[] args) {
   // int number; //함수안의 지역변수: 초기화 안됨
    
    //아래 두개의 객체변수는 서로 독립적으로 동작 -> 자바스크립트와 개념 동일
    Car myCar = new Car(); //독립적인 객체변수(참조변수) 2개 생성
    
    //점 찍고 직접 접근할 수 있다.
    myCar.number = 3724;
    myCar.color = "black"; //자바에서는 무조건 ""쌍따옴표
    myCar.speed = 10;    
    
    System.out.println("1. 차번 = " + myCar.number); //3724
    System.out.println("2. 색상 = " + myCar.color); //black
    System.out.println("3. 현재속도 = " + myCar.speed); //10
    
    myCar.speedUp(); //함수호출, 메소드호출
    System.out.println("3. 현재속도 = " + myCar.speed); //110
    
    System.out.println("--------------------------");
    
    Car yourCar = new Car();
    
    yourCar.number = 9632;
    yourCar.color = "blue";
    yourCar.speed = 150;
    
    System.out.println("1. 차번 = " + yourCar.number); 
    System.out.println("2. 색상 = " + yourCar.color); 
    System.out.println("3. 현재속도 = " + yourCar.speed);
    
    yourCar.speedDown();
    System.out.println("3. 현재속도 = " + yourCar.speed);
    
  }
}

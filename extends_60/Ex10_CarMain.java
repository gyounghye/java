package extends_60;

// is-a 상속 : SM -> Sedan -> Car
// 상속을 통해 기능을 확장할 수 있다. 
class Car{
  public void carSound() {
    System.out.println("1. Car : 빵~빵!");
  }
}

class Sedan extends Car{
  public void sedanSound() {
    System.out.println("2. Sedan : 빠바방~!");
  }
}
      //원래는 패키지 명까지 써야함. 'extends_60.Sedan'
class SM extends Sedan{
  public void smSound() {
    System.out.println("3. SM : 빵라방방~!");
  }
}

public class Ex10_CarMain {
  
 static int num = 100; //멤버변수: static써야 출력됨
  
  public static void main(String[] args) {
    System.out.println(num); //위 변수에 스테틱 없으면 에러난다. 스테틱 함수는 변수도 스테틱이어야 한다. 
    
    SM sm = new SM(); //모든 클래스는 .Object()을 암묵적으로 상속 받았다. 
    
    sm.smSound();
    sm.sedanSound();
    sm.carSound();
  }
}

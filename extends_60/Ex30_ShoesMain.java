package extends_60;

//메소드 오버라이딩
//상위 클래스
class Shoe{
  public void info() {
    System.out.println("1. Shoe 클래스의 info() 실행");
  }
}

//하위클래스
class Hill extends Shoe{
  
  @Override //오버라이딩 할때 써주면 좋다.
  public void info() {   //부모의 public void info() {} 를 똑같이 쓰고 {}안의 내용만 변경가능
    System.out.println("2. Hill 클래스의 info() 실행");
  }
}

//또그 하위클래스
class HiHill extends Hill{
  
  @Override
  public void info() {
    System.out.println("3. HiHill 클래스의 info() 실행");
  }
}

public class Ex30_ShoesMain {

  public static void main(String[] args) {
    
    Shoe shoe = new Shoe();
    shoe.info();
    
    Hill hill = new Hill();
    hill.info(); //Override 없이 출력하면 : Shoe 클래스의 info() 실행, 오버라이딩 후 출력하면: Hill 클래스의 info() 실행
    
    HiHill hiHill = new HiHill();
    hiHill.info(); //Override 없이 출력하면 : Shoe 클래스의 info() 실행, 오버라이딩 후 출력하면: HiHill 클래스의 info() 실행
  }
}

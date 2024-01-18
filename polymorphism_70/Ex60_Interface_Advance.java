package polymorphism_70;

interface Telecoms{
  void beeper();
  
  //JDK8 이후 문법
  //원래는 인터페이스안에 {}구현이 불가능한데, 예외적으로 default 쓰면 인터페이스 안에서도 구현 가능->오버라이딩 의무 없어진다.
  //인터페이스를 상속중인 여러개의 하위 클래스중 특정 클래스만을 위한 메소드를 추고 하고 싶을때 사용
  //{}구현상태로 제공
  default void alarm() {
    System.out.println("default키워드 사용시 추가 되더라도 의무적으로 하위 클래스에서 오버라이딩 하지 않아도 됨");
  }
  
  //JDK8 이후 문법
  //static 쓰면 오버라이딩 불가능, 오버라이딩 내용이 모두 같을때 사용
  //{}구현상태로 제공
  static void must() {
    System.out.println("static 키워드 사용시 하위 클래스는 오버라이딩이 불가능하며 구현상태 그대로 사용해야 함");
  }
}

class SK implements Telecoms{

  @Override
  public void beeper() {
   System.out.println("SK 클래스에서 beeper() 매소드 오버라이딩");       
  }

  @Override
  public void alarm() {
    System.out.println("따르릉 학원갈 시간이에요");
  }
  
}

public class Ex60_Interface_Advance {
  public static void main(String[] args) {
    
    //Telecoms 인터페이스에서 alarm() must()가 추가되었지만 default, static으로 되어있기 때문에 SK클래스는 별도의 추가 작업이 필요없다.
    SK sk = new SK();
    sk.beeper();
    sk.alarm();
    Telecoms.must();
  }
}

package basic_API_90;

//Object 클래스의  toStrinf(), equals()를 오버라이드 하는 예제

class MyObject{
  private String msg;
  
  public MyObject(String msg) {
    this.msg =msg;
  }

  //Object 클래스의 toString() 메소드를 오버라이드 함
  @Override
  public String toString() {   
    return msg;
  }

  //Object 클래스의 equals() 메소드를 오버라이드 함
  //규칙변경 -> 타입이 같고, 전달받은 문자열이 같으면 true
  @Override //결과는 true
  public boolean equals(Object obj) { //여기서 obj=obj3
   // if(this.getClass() == obj.getClass()) { //여기서 this=obj2     
      if(obj instanceof MyObject) { //obj가 MyObject 클래스의 객체인지 확인 -> true/false , 위의 if문장의 또다른 표현
      return msg.equals(((MyObject)obj).msg);     //업캐스팅 된것  
     
    }else {
      return false;
    }
  }  
}//MyObject

public class Ex20_Object_Override {

  public static void main(String[] args) {
    
    MyObject obj1 = new MyObject("굿모닝");    
    System.out.println("obj1.toString() -> " + obj1.toString());
    
    MyObject obj2 = new MyObject("Good Morning");
    MyObject obj3 = new MyObject("Good Morning");
    
    //false결과 나온다.->기본적으로는 주소값 비교 , 서로다른 객체이므로
    if(obj2.equals(obj3)) {
      System.out.println("obj2.equals(obj3) is True");
    }else {
    System.out.println("obj2.equals(obj3) is False");
    }
  }
}

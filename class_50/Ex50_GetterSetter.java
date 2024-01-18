package class_50;

//게터와 세터형식의 클래스
class Person{
  private String name = "둘리"; //캡슐화 private
  private int age = 7;

  //name에 대한 게터(리턴있다)와 세터
  public String getName() { //get은 가져온다는 뜻
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public int getAge() {
    return age;
  }
  
  public void setAge() {
    this.age = age;
  }
  
  void say() {
    String name = "하니";
    System.out.println("이름 : "+ name);
    System.out.println("나이 : "+ getAge());
  }
 
  
}

public class Ex50_GetterSetter {

  public static void main(String[] args) {
    
    Person duly = new Person();
    
    System.out.println(duly.getName());
    System.out.println(duly.getAge());
  }
  
}

package about_class_40;

public class Ex10_StudentMain {

  public static void main(String[] args) {
    

    //데이터 타입 변수명 = 값;
    Student duly = new Student(); //한줄 표기
     // 선언과 할당을 분리 가능   Student = duly;  와 duly = new Student();
    
    System.out.println(duly.name);
    System.out.println(duly.age);
    
    duly.hello();
   
  }

}

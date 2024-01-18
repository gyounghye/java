package class_50;

class SoloThis{
  private int i = 0;
                  //getThis() 메소드생성
  public SoloThis getThis() {
    //this 자체를 리턴, this 타입은 당연히 SoloThis
    return this; //class_50.SoloThis@4d591d15
  }
  
  public void print() {
    i++;
    System.out.println(" i = " + i);
  }
}

public class Ex120_SoloThisMain {
  
  public static void main(String[] args) {
    
    SoloThis st1 = new SoloThis();//객체생성
    
   // System.out.println(st1); // 결과 : class_50.SoloThis@4d591d15 -> 이객체를 가리키는 주소값
    System.out.println("SoloThis st1 =" + st1); //출력결과 i=1,i=2
    st1.print();
    st1.print();
    
    
   // SoloThis st2 = new SoloThis();//또다른 객체생성 -> 각각 실행,  st1과 주소값 다르다 - >출력결과 i=1,i=2
    SoloThis st2 = st1.getThis(); //이렇게하면 st1과 같은 주소값을 가진 객체 생성
    System.out.println("SoloThis st1 =" + st2); // - > st1과 같은 주소값이어서 출력결과 i=3,i=4
    st2.print();
    st2.print();
    
  }//main
  
  
}

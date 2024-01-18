package extends_60.components;


public class Army extends Unit{

  public Army(String name) {
    super(name);
  }
  
  @Override //annotation 주석 (@Override는 컴파일러에게 알려주는 단순주석) , 기능이 추가된 annotation 이 있다.
  public void attack() {
    System.out.println(super.getName() + " >> 지상공격 실행함 ");
   
  }
  
  public void tank() {
    System.out.println(super.getName() + " >> 탱크공격 ");
  }

  
}

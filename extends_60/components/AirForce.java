package extends_60.components;

public class AirForce extends Unit{
  
  
  public AirForce(String name) {
    super(name);
  }

  @Override
  public void attack() {
    System.out.println(this.getName() + " >> 이륙");
    System.out.println(this.getName() + " >> 공중 폭격 실행함");
  }
  
  public void plane() {
    System.out.println(super.getName() + " 비행기 공격 ");
  }
}

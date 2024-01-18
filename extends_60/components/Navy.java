package extends_60.components;

public class Navy extends Unit {
  
  
  
  

  public Navy(String name) {
    super(name);
  }

  @Override
  public void attack() {
    System.out.println(this.getName() + " >> 해전 실행함");
  }
  
  public void nucleus() {
    System.out.println(super.getName() + " >> 잠수함공격");
  }
}

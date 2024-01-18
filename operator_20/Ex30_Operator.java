package operator_20;

//복합대입 연산자
public class Ex30_Operator {

  public static void main(String[] args) {
    
    //누적은 버스카드충전이다. 
    int buscard = 100;
    
    buscard = buscard + 10000;    
    buscard += 10000; //20100
    
    buscard = buscard - 5000;
    buscard -= 5000; //15100
    
    buscard = buscard * 2;
    buscard *= 2;//30200
    
    buscard = buscard / 100;
    buscard /= 100; //302
    
    buscard = buscard % 2;
    buscard %= 2; //나머지 0
    
    System.out.println("buscard = " + buscard);
    
  }//end of main
}

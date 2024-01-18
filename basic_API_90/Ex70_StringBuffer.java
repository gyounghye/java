package basic_API_90;

public class Ex70_StringBuffer { 

  public static void main(String[] args) {
    String str1 = "Hello, "; //100번지 String로 만든건 불변, 이후 사용안한 메모리라 자동정리됨
    String str2 = "World~!"; //200번지
    
    //String result = str1 + str2;
    //String result = str1.concat(str2); //.concat -> 연결
    str1 = str1.concat(str2); // 두개를 연결해서 새로운 메모리 300번지에 저장, 이제 str1은 100번지가 아니라 300번지가 됨
    System.out.println(str1);
    
    /*
     .concat()메소드는 문자열을 연결하는 가장 간단한 방법이다.
     그러나 문자열을 대량으로 연결할 때는 더 효율적인 방법으로 
     StringBuffer나 StringBuffer 클래스를 사용하는 것이 좋을 수도 있다.
     이 클래스들은 문자열 연결 작업에 효율적이며, 반복적으로 대량의 문자열을 수정해야 하는 경우 유용하다.
     
     */
    
    str1 = "아기공룡"; //400번지, 그자체의 메모리가 변경되지 않는다. 
    str2 = "둘리~!"; //500번지
    
    StringBuffer sb = new StringBuffer(); //600번지 //기본적으로 16칸 준비됨. 메모리가 연결되면 자동으로 여유분16칸이 추가됨
    sb.append(str1);
    sb.append(str2);
    
    String result = sb.toString(); //StringBuffer 가 toString() 를 오버라이드 한것이라 결과는 '아기공룡둘리~!'
    System.out.println(result);
        
  }
}

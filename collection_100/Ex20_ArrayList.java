package collection_100;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.stream.Stream;

public class Ex20_ArrayList {

  public static void main(String[] args) {
    
    Calendar cal = Calendar.getInstance();
    Date now = cal.getTime();
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String joinday = sdf.format(now);
    
    //Member 타입의 값을 원소로 하는 컬렉션
    ArrayList<Member> memList = new ArrayList<Member>();
    
    //객체이다
    memList.add(new Member("둘리","duly@naver.com","2222",joinday));
    memList.add(new Member("하니","hani@naver.com","1234",joinday));
    memList.add(new Member("마이콜","micol@naver.com","2580",joinday));
    
    //목업데이터 입력 - Mock Data는 API로 연결되어있는 데이터가 아닌 가짜데이터, 샘플데이터
    for(int i = 0; i<100; i++) {
      memList.add(new Member("Name_"+i, "email_"+ i +"@naver.com", "1234", joinday));
    }
    
    //스트림으로 출력
    System.out.println("------------스트림으로 출력------------");
    Stream<Member> memStream = memList.stream();
   // memStream.forEach(mem->System.out.println(mem.toString())); 아래의 한줄표기법
    
    memStream.forEach((mem)->{
      System.out.println(mem.toString());
    });
    
    //어드벤스드 for문으로 출력 - 컬렉셔에 저장된 요소들을 읽어오는 표준화된 방법중 하나
    System.out.println("-----------for문으로 출력-------------------");
    for(Member mem : memList) {     
      System.out.println(mem.toString());
    }
    
  }
}

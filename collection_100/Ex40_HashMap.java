package collection_100;

import java.util.HashMap;
import java.util.Set;
import java.util.stream.Stream;

//HashMap는 자바스크립트의 Object와 유사하다.
public class Ex40_HashMap {

  public static void main(String[] args) {
    HashMap<String, String> memMap = new HashMap<String, String>();
    
    System.out.println("현재 memMap 개체가 비어 있나요? " + memMap.isEmpty());
    
    System.out.println();
    memMap.put("duly", "둘리"); //자동으로 오토박싱처리됨
    memMap.put("hani", "하니");
    memMap.put("micol", "마이콜");
    memMap.put("iu", "아이유");
    
    memMap.put("hani", "달려라 하니~!"); //key가 중복되는것이 없으면 추가, 중복되면 value값이 수정됨
    
    System.out.println(memMap.get("duly"));
    System.out.println(memMap.get("hani"));
    System.out.println(memMap.get("micol"));
    System.out.println(memMap.get("iu"));
    
    memMap.remove("duly");//삭제
    
    System.out.println();
    System.out.println("1. memMap 객체에 담긴 원소의 개수는? " + memMap.size()); //개수
    
    System.out.println();
    System.out.println("2. hani라는 이름의 key가 있나요? " + memMap.containsKey("hani"));
    
    System.out.println();
    System.out.println("3. 아이유라는 value가 있나요? " + memMap.containsValue("아이유"));
    
    System.out.println();
    System.out.println("4. memMap의 key만 가져와서 줄력하기");
    Set<String> idSet = memMap.keySet(); 
    for(String id : idSet) {
      System.out.println(id + " : " + memMap.get(id));
    }
    
    System.out.println();
    //스트림으로 출력시도
   
    Stream<String> idStream = idSet.stream();
    idStream.forEach(id -> System.out.println(id + " : " + memMap.get(id)));    
    
  }
}
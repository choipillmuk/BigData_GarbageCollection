import java.util.ArrayList;
import java.util.List;

// GC로도 메모리 leak발생
/*
addToMyList 메서드를 통해 list에 100만 개의 문자열을 추가. 
list 변수가 인스턴스 변수로 선언되어 있어서,  GC_Leak인스턴스가 소멸될 때까지 메모리에 계속 남으므로, 가비지 컬렉션으로도 해당 메모리를 
해제할 수 없기 때문에, 메모리 누수가 발생.
 */
public class GC_Leak {
    private List<String> list = new ArrayList<>();
    
    public void addToMyList(String str) {
        list.add(str);        
    }
    
    public static void main(String[] args) {
        GC_Leak gc = new GC_Leak();
        for (int i = 0; i < 1000000; i++) {
            gc.addToMyList("string" + i);
        }
    }
    
}

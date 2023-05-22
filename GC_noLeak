import java.util.ArrayList;
import java.util.List;

// GC가 제대로 작동
//list 변수를 지역 변수로 선언하면, 해당 메서드가 호출될 때마다 새로운 list 객체가 생성되므로, 인스턴스가 소멸될 때 해당 객체도 함께 메모리에서 해제.


public class GC_noLeak {
    
    public void addToMyList(List<String> list, String str) {
        list.add(str);
    }
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        GC_noLeak gc = new GC_noLeak();
        for (int i = 0; i < 1000000; i++) {
            gc.addToMyList(list, "string" + i);
        }
    }
}

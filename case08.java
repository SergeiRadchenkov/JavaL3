import java.util.ArrayList;
import java.util.List;

public class case08 {
    public static void main(String[] args) {
        // Character value = null;
        List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'i');
        System.out.println(list1);
        List<Character> list2 = new ArrayList<Character>();
        list2.add('S');
        list2.add('e');
        list2.add('r');
        list2.remove(1);
        System.out.println(list2);
    }
}

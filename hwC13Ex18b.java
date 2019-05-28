import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class hwC13Ex18b {
public static void main(String[] args) {
    List<Integer> myList = new ArrayList<Integer>();
    myList.add(5);
    myList.add(1);
    myList.add(3);
    myList.add(2);
    myList.add(9);
    myList.add(15);

    System.out.println(myList);
    Collections.sort(myList);
    //Collections.reverse(myList);
    System.out.println(myList);
}
}
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public ArrayList<String> food = new ArrayList<String>();

    public void addElements() {
        food.add("Pizza");
        food.add("Hamburger");
        food.add("Hot Dog");
    }

    public void listElements() {
        System.out.println(food.toString());
    }
}

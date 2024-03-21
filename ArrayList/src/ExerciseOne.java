import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseOne {
    public ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 7, 4, 6, 8, 9, 3));

    public void listElements() {
        System.out.println(numbersList.toString());
    }

    public void listPair() {
        for(int i = numbersList.size() - 1; i >= 0; i--) {
            if(numbersList.get(i) % 2 == 0) {
                numbersList.remove(i);
            }
        }
        listElements();
    }
}

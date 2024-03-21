import java.util.ArrayList;
import java.util.Arrays;

public class RevertList {
    public ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

    public ArrayList<Integer> revertArray() {
        ArrayList<Integer> invertedArr = new ArrayList<>();
        for (int i = numbersList.size() - 1; i >= 0; i--) {
            invertedArr.add(numbersList.get(i));
        }
        return invertedArr;
    }
}

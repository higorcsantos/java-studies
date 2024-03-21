import java.util.ArrayList;
import java.util.Arrays;

public class CounterMajor {
    public ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(12, 5, 4, 12, 25, 6, 23, 1));

    public int counterBiggest() {
        ArrayList<Integer> biggestNumbers = new ArrayList<>();
        int n = 10;
        for(int i = numbersList.size() - 1; i >= 0; i --) {
            if(numbersList.get(i) > n) {
                biggestNumbers.add(numbersList.get(i));
            }
        }
        return  biggestNumbers.size();
    }
}

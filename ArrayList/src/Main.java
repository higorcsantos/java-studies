import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayListExample foodArr = new ArrayListExample();
//        foodArr.addElements();
//        foodArr.removeElement(1);
//        foodArr.addElement("Hamburger");
//        foodArr.addElement("Chocolate");
//        foodArr.setElement(2, "Meat");
//        foodArr.listElements();
        ExerciseOne exerciseOne = new ExerciseOne();
        exerciseOne.listPair();
        RevertList revertList = new RevertList();
        ArrayList<Integer> revertedArray = revertList.revertArray();
        System.out.println(revertedArray.toString());
        CounterMajor counterMajor = new CounterMajor();
        int biggestNumbers = counterMajor.counterBiggest();
        System.out.println(biggestNumbers);
    }
}
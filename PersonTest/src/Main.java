import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] cars = { "Camaro", "Corvette", "Tesla" };
        cars[0] = "Mustang";
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        //Criação dinâmica
        int[] arr = new int[5];
        /*Tamanho do array */
        System.out.println(cars.length);
        // iterando sobre um array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
    }
}
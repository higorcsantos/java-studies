import java.util.ArrayList;

public class ArrayListExample {
    public ArrayList<String> food = new ArrayList<String>();

    public void addElements() {
        food.add("Pizza");
        food.add("Hamburger");
        food.add("Hot Dog");
    }

    public void addElement(String value) {
        food.add(value);
    }

    public void listElements() {
        System.out.println(food.toString());
    }

    //Remover um elemento
    public void removeElement(int index) {
        food.remove(index);
    }

    //Atualizar um elemento
    public void setElement(int index, String value) {
        food.set(index, value);
    }

    public int getSize() {
        return food.size();
    }

    //Limpar um array
    public void clearArr() {
        food.clear();
    }

    //Verificar se um array é vazio ele retorna um booleano

    public boolean isEmpty() {
        return food.isEmpty();
    }

    //retorna o indice de um elemento

    public int indexOf(String value) {
        return food.indexOf(value);
    }
}

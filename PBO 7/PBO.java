import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PBO<T> {

    private T value;

    public PBO(T value) {
        this.value = value;
    }

    public T getvalue() {
        return value;
    }

    public static <E> void printList(List<E> list) {
        for (E element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Muhamad");
        stringList.add("Abdurahman");
        printList(stringList);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "11 Januari");
        map.put(2, "22 Tahun");
        map.forEach((key, value) -> System.out.println(value));

        PBO<Integer> genericInteger = new PBO<>(2002);
        System.out.println("Tahun : " + genericInteger.getvalue());
    }
}
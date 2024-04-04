package Generic;

import java.util.ArrayList;
import java.util.List;


public class ListName {
    List<String> names = new ArrayList<>();

    public ListName(){
        names.add("Muhamad");
        names.add("Abdurahman");

        names.set(1, "Rahman");
    }

    public void getInfo(){
        System.out.println(names.get(0));
        System.out.println(names.get(1));
    }
}

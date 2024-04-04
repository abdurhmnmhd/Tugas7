package Generic;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashet {
    Set<String> names = new LinkedHashSet<>();

    public LinkedHashet(){
        names.add("Muhamad");
        names.add("Abdurahman");
    }

    public void getInfo(){
        for(String name : names){
            System.out.println(name);
        }
    }
}
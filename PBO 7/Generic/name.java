package Generic;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays; 

public class name {
    Collection<String> names = new ArrayList<>();

    public name() {
        names.add("Ali");
        names.add("Jaelani");
        names.addAll(Arrays.asList("Aldi", "Programan", "ajib", "Sekali"));

        names.remove("Jaelani");
    }

    public void getInfo(){
        for (String name : names){
            System.out.println(name);
        }

        System.out.println(names.contains("Ali"));
        System.out.println(names.contains(Arrays.asList("Jaelani", "Sekali")));
        
        System.out.println(names.contains("Jaelani"));
        System.out.println(names.contains(Arrays.asList("ajib", "Programer")));
        
        System.out.println(names.contains("Aldi"));
        System.out.println(names.contains(Arrays.asList("Aldi", "Sekali")));
    }
}
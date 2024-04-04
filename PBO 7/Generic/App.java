package Generic;



public class App {
    public static void main(String[] args) throws Exception {
        mahasiswa<Integer> mhs1 = new mahasiswa<Integer>("Ilham", 12345);
        mahasiswa<String> mhs2 = new mahasiswa<String>("Ilham", "12345");
        mahasiswa<Double> mhs3 = new mahasiswa<Double>("Ilham", 12345.0);
        mhs1.info();
        mhs2.info();
        mhs3.info();

        System.out.println("=====================");
        Concatination Y = new Concatination();
        Y.add(1, "Muhamad");
        Y.add(1, "Muhamad", "Abdurahman");
        System.out.println("=====================");
        
        System.out.println("\n=====================");
        IterableIterator list = new IterableIterator();
        list.getName();
        System.out.println("=====================");

        System.out.println("\n=====================");
        name Name = new name();
        Name.getInfo();
        System.out.println("=====================");
        
        System.out.println("\n=====================");
        ListName ListName = new ListName();
        ListName.getInfo();
        System.out.println("=====================");

        System.out.println("\n=====================");
        Hashet HashSet = new Hashet();
        HashSet.getInfo();
        System.out.println("=====================");

        System.out.println("\n=====================");
        LinkedHashet Linked = new LinkedHashet();
        Linked.getInfo();
        System.out.println("=====================");
    }
}

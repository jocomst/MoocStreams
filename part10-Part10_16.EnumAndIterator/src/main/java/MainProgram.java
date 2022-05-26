
public class MainProgram {

    public static void main(String[] args) {
        // test your classes here
        Employees peps = new Employees();
        peps.add(new Person("bob", Education.BA));
        peps.print();
        peps.print(Education.BA);
    }
    
}

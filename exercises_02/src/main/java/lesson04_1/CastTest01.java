package lesson04_1;

//CASTING OBJECT REFERENCES
//Using generic superclass reference is useful for passing objects around but if we need to access subclass methods we use casting

public class CastTest01 {

    public static void main(String[] args) {
        Employee e = new Manager(102, "Joan Kern",
                "012-23-4567", 110_450.54, "Marketing");

        if (e instanceof Manager) {
            Manager m = (Manager) e;
            m.setDeptName("HR");
            System.out.println(m.getDetails());
        }
    }
}

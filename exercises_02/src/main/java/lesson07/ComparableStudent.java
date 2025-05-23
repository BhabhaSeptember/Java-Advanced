package lesson07;

//ORDERING COLLECTIONS

//Collections API provides Comparable and Comparator interfaces for ordering elements

//Comparable: provides single sorting option for class & override compareTo method
//Comparator: enables multiple sorting options, multiple Comparator classes & uses compare method

//Below class implements Comparable interface
//Interface designed to use generics...
//...class type that is passed into compareTo method is ComparableStudent

public class ComparableStudent implements Comparable<ComparableStudent> {

    private String name;
    private long id = 0;
    private double gpa = 0.0;

    public ComparableStudent(String name, long id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return this.name;
    }

    public long getId() {
        return this.id;
    }

    public double getGpa() {
        return this.gpa;
    }

    @Override
    public String toString() {
        return "=== Student Details ===\nName: " + this.name + "\nID: " + this.id
                + "\nGPA:" + this.gpa;
    }

//Below we override Comparable interfaces compareTo method 
    @Override
    public int compareTo(ComparableStudent s) {
        int result = this.name.compareTo(s.getName());
        if (result > 0) {
            return 1;//s comes after current element
        } else if (result < 0) {
            return -1;//s comes before current element
        } else {
            return 0;//s is equal to the current element
        }
    }
}

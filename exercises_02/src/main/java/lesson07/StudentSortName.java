package lesson07;

//COMPARATOR: EXAMPLE

import java.util.Comparator;

public class StudentSortName implements Comparator<Student>{
    
    @Override
    public int compare(Student s1, Student s2){
        int result = s1.getName().compareTo(s2.getName());
        if (result != 0) { return result; }
        else { 
            return 0;// Or do more comparing
        } 
    }
}

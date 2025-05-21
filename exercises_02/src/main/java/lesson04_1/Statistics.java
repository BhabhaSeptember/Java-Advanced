package lesson04_1;

//METHODS USING VARIABLE ARGUMENTS

public class Statistics {
    
//We can collapse overloaded methods that perform the same function but just differ in the number of arguments it can take of the same type
//The feature is called varargs or variable arguments
//Varargs notation treats nums argument as an array object of type int[]
//This allows method to iterate over and allow any number of elements    
//i.e. The list of arguments are converted into an int array object  
   
    public float average(int... nums) {
        int sum = 0;
        float result = 0;
        if (nums.length > 0) {
            for (int x : nums) {  // iterate int array nums
                sum += x;
            }
            result = (float) sum / nums.length;
        }
        return (result);
    }
}
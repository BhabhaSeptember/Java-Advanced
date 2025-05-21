/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson04_1;

//IMMUTABLE CLASSES

//It is a class whose object state cannot be modified once created
//Any modification results in another new immutable object e.g. java.lang.String

//The class must be declared as final to prevent it being extended where a subclass could alter the immutability of its superclass
public final class Contacts {

    
//All fields must be declared private and final to prevent direct access and modification 
//No setter methods are provided for variables    
    private final String firstName;
    private final String lastName;
    private final String mobileNo;

//All fields should initialized by a constructor    
    public Contacts(String fname, String lname, String mobile) {
        this.firstName = fname;
        this.lastName = lname;
        this.mobileNo = mobile;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String toString() {

        return firstName + " - " + lastName + " - " + mobileNo;

    }
}

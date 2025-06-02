package lesson08;

import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author MikeW
 */
public class RoboCall05 {
    
//METHODS
//SUMMARY    
//Take a list of people (List<Person> pl) and a condition (Predicate<Person> pred).
//Iterate through each person p in the list.
//Use pred.test(p) to check if the person satisfies the condition.
//If true, call roboCall(p) — simulating a phone call to that person.
  public void phoneContacts(List<Person> pl, Predicate<Person> pred){
    for(Person p : pl){
      if (pred.test(p)){
        roboCall(p);
      }
    }
  }

  public void emailContacts(List<Person> pl, Predicate<Person> pred){
    for(Person p:pl){
      if (pred.test(p)){
        roboEmail(p);
      }
    }
  }

  public void mailContacts(List<Person> pl, Predicate<Person> pred){
    for(Person p:pl){
      if (pred.test(p)){
        roboMail(p);
      }
    }
  }  
  
  public void roboCall(Person p){
    System.out.println("Calling " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge() + " at " + p.getPhone());
  }
  
  public void roboEmail(Person p){
    System.out.println("Emailing " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge() + " at " + p.getEmail());
  }
  
  public void roboMail(Person p){
    System.out.println("Mailing " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge() + " at " + p.getAddress() + ", " + p.getCity() + ", " + p.getState() + " " + p.getCode());
  }

}

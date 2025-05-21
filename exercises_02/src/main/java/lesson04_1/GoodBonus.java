package lesson04_1;

//APPLYING POLYMORPHISM
//This is good practice that passes params and writes methods that use the most generic possble form of the object
//Meaning one method will calculate the bonus for each Employee type

public class GoodBonus {
 
//USING THE INSTANCEOF KEYWORD
//Employee is a good base class but we use instanceof to know what object type has been passed in during runtime   
  public double calcBonus(Employee e){
    if (e instanceof Employee){
      return e.getSalary() * 0.01;
    }else if (e instanceof Engineer){
      return e.getSalary() * 0.02;
    }else if (e instanceof Manager){
      return e.getSalary() * 0.03;
    }else if (e instanceof Director){
      return e.getSalary() * 0.05;
    }else {
      return 0;
    }
  }
}

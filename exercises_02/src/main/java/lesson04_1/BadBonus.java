package lesson04_1;

//APPLYING POLYMORPHISM
//Each method performs calculation based on the type of employee passed in and returns the bonus amount
//If we add more employee types, we would have to add more methods which could just be repetitive code
//It's better to have methods that use the most generic form of our object
public class BadBonus {
    
  public double calcBonus(Employee e){
    return e.getSalary() * 0.01;
  }
  
  public double calcBonus(Manager m){
    return m.getSalary() * 0.03;
  }

  public double calcBonus(Engineer e){
    return e.getSalary() * 0.02;
  }

  public double calcBonus(Director d){
    return d.getSalary() * 0.05;
  }
}

package lesson05;

//Class below extends an abstract class
//Classes that extend abstract classes must either be declared as abstract...
//...or must override parent class abstract methods

//Abstract methods are used to outline functionality required in child classes

public class Television extends ElectronicDevice {

//Overriding abstract method from superclass     
    public void turnOn() {
        changeChannel(1);
        initializeScreen();
    }
    public void turnOff() {}
    
    public void changeChannel(int channel) {
        System.out.println("TV Changing Channel");
    }
    
    public void initializeScreen() {
        System.out.println("TV Initializing Screen");}
}
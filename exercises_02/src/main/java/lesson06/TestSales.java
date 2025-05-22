package lesson06;

//INTERFACE REFERENCES

public class TestSales {

    public static void main(String[] args) {
        
//A class that implements an interface can be referenced using that interface

//CrushedRock object is referenced by its classname as well as interface that it implements
        CrushedRock rock1 = new CrushedRock(12, 10, 50);
        SalesCalcs rock2 = new CrushedRock(12, 10, 50);
//And calcSalesPrice from interface can be referenced by CrushedRcok class & SalesCalcs interface       
        System.out.println("Rock1 Sales Price: R" + rock1.calcSalesPrice());
        System.out.println("Rock2 Sales Price: R" + rock2.calcSalesPrice());

      
//INTERFACE REFERENCE USEFULNESS        
        SalesCalcs[] itemList = new SalesCalcs[5];
        ItemReport report = new ItemReport();

        itemList[0] = new CrushedRock(12.0, 10.0, 50.0);
        itemList[1] = new CrushedRock(8.0, 6.0, 10.0);
        itemList[2] = new RedPaint(10.0, 8.0, 25.0);
        itemList[3] = new Widget(6.0, 5.0, 10);
        itemList[4] = new Widget(14.0, 12.0, 20);

//Because all three class objects above share a common interface,...
//...a list of different classes can be created and processed in the same way

//EXAMPLE1:   
System.out.println("\n===== Sales Report =====");
        for (SalesCalcs item : itemList) {
            report.printItemData(item);
        }
   
//EXAMPLE2:        
        System.out.println("\n===== Sales Report 2 =====");
        for (SalesCalcs item : itemList) {
            item.printItemData2();
        }
        
        
 //Implementing A static method from interface    
    SalesCalcs.printItemArray(itemList);

    }
}

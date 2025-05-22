package lesson06;

//ENCAPSULATE THE FOR LOOP

//An improvement on Z02Analyzer class is to encapsulate the forloop
public class Z03Analyzer {

//The for loop has been encapsulated into a static helper method  
//The parameters are: 
//a) a string array, 
//b) a search string and 
//c) a class that implements the StringAnalyzer interface (remember interfaces can be used as references for the classes which implement them)    
  public static void searchArr(String[] strList, String searchStr, StringAnalyzer analyzer){
    for(String currentStr:strList){
      if (analyzer.analyze(currentStr, searchStr)){
        System.out.println("Match: " + currentStr);
      }
    } 
  }

  public static void main(String[] args) {
    String[] strList01 = 
    {"tomorrow","toto","to","timbukto","the","hello","heat"};  
    String searchStr = "to";
    System.out.println("Searching for: " + searchStr);
    
    // Call concrete class that implments StringAnalyzer
    ContainsAnalyzer contains = new ContainsAnalyzer();
        
    System.out.println("===Contains===");
    Z03Analyzer.searchArr(strList01, searchStr, contains);
  }  
}

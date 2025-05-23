package lesson06;

//STRING ANALYSIS LAMBDA EXPRESSION

public class Z05Analyzer {
  
  public static void searchArr(String[] strList, String searchStr, StringAnalyzer analyzer){
    for(String currentStr:strList){
      if (analyzer.analyze(currentStr, searchStr)){
        System.out.println("Match: " + currentStr);
      }
    } 
  }
  
  public static void main(String[] args) {
    String[] strList = 
    {"tomorrow","toto","to","timbukto","the","hello","heat"};
    String searchStr = "to";
    System.out.println("Searching for: " + searchStr);

// Lambda Expression replaces anonymous inner class
//lambda expression also returns a boolean
//It uses the functional interface as the base but shortens the code & makes it more readable
    System.out.println("==Contains==");
    Z05Analyzer.searchArr(strList, searchStr, 
      (String target, String search) -> target.contains(search));    
  }    
}

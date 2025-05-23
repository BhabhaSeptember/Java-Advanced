package lesson06;

//STRING ANALYSIS ANONYMOUS INNER CLASS EXAMPLE

public class Z04Analyzer {
  
  public static void searchArr(String[] strList, String searchStr, StringAnalyzer analyzer){
    for(String currentStr:strList){
//if analyze method returns true, then we print out the Match to console        
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

//Implementing an anonymous inner class
//It specifies no name but implemens almost exactly the same code
//The class is defined where a parameter variable would normally be
 
//SUMMARY: The class analyzes an array of strings given a search string
//The prints the strings that contain the search string

//Created an anon inner class for third argument
//Code is stored in the calling class
System.out.println("===Contains===");
    Z04Analyzer.searchArr(strList01, searchStr, 
      new StringAnalyzer(){
        @Override
        public boolean analyze(String target, String searchStr){
          return target.contains(searchStr);
        }
      });    
  }    
}

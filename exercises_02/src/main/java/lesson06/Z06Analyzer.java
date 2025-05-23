package lesson06;

//LAMBDA EXPRESSION SHORTHAND


public class Z06Analyzer {
  
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

//Using the short hand form Lambda
//the type of the argument used in the lambda expression is inferred based on the context the expression is being used
    System.out.println("==Contains==");
    Z06Analyzer.searchArr(strList01, searchStr, 
      (t, s) -> t.contains(s));
    
    // Changing logic becomes easy
    System.out.println("==Starts With==");
    Z06Analyzer.searchArr(strList01, searchStr, 
      (t, s) -> t.startsWith(s));
  }    
}

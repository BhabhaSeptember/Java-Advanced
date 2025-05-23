package lesson06;

//HERE WE IMPLEMENT AN INTERFACE INSTEAD OF USING A PLAIN CLASS 
//AS WE DID IN Z01Analyzer EXAMPLE

//Concrete class below implements a Functional Interface

//Instead of using an anonymous inner class like with Z04Analyzer example,
//we could have a separate class performing the same function
public class ContainsAnalyzer implements StringAnalyzer {

//We override the interfaces method with a specialization to search for matches    
    @Override
    public boolean analyze(String target, String searchStr) {
        return target.contains(searchStr);
    }
}

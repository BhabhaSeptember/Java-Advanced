package lesson06;



//Concrete class below implements a Functional Interface

//Instead of using an anonymous inner class like with Z04Analyzer example,
//we could have a separate class performing the same function
public class ContainsAnalyzer implements StringAnalyzer {

    @Override
    public boolean analyze(String target, String searchStr) {
        return target.contains(searchStr);
    }
}

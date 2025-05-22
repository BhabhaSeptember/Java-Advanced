package lesson06;

//STRING ANALYZER INTERFACE TEST CLASS

//below class is not much different to Z01Analyzer class
//the only difference is that a different class is used to perform string testing
public class Z02Analyzer {

    public static void main(String[] args) {
        String[] strList
                = {"tomorrow", "toto", "to", "timbukto", "the", "hello", "heat"};
        String searchStr = "to";
        System.out.println("Searching for: " + searchStr);

//Call concrete class that implements StringAnalyzer
        ContainsAnalyzer contains = new ContainsAnalyzer();

        System.out.println("===Contains===");
        for (String currentStr : strList) {
            if (contains.analyze(currentStr, searchStr)) {
                System.out.println("Match: " + currentStr);
            }
        }
    }
}

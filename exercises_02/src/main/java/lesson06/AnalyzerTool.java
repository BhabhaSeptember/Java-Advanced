package lesson06;

//STRING ANALYSIS REGULAR CLASS

//Class analyzes an array of strings given a search string
//returns true is source string contains the search string
//returns false if source string does not contain the search string
public class AnalyzerTool {

    public boolean arrContains(String sourceStr, String searchStr) {
        return sourceStr.contains(searchStr);
    }
}

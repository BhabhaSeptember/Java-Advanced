package lesson06;

//Using a regular class to analyze a string
public class Z01Analyzer {

    public static void main(String[] args) {
        String[] strList
                = {"tomorrow", "toto", "to", "timbukto", "the", "hello", "heat"};
        String searchStr = "to";
        System.out.println("Searching for: " + searchStr);

//Create/instantiate a regular class object called analyzeTool
        AnalyzerTool analyzeTool = new AnalyzerTool();

//Call the arrContains method on the object
        System.out.println("===Contains===");
        for (String currentStr : strList) 
            if (analyzeTool.arrContains(currentStr, searchStr)) {
                System.out.println("Match: " + currentStr);
            }
        }
    }


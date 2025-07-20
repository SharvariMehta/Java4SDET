package ex_08_Single_Inheritance_QA_Ex;

public class Single_Inheritance_QA_Ex {
    public static void main(String[] args) {

        System.out.println("Steps for executing Test Case 1 : ");
        TC1 testcase1 = new TC1();
        testcase1.LaunchBrowser();
        testcase1.OpenWebsite();
        testcase1.ReadDataFromExcel();
        testcase1.ExecuteTC1();
        testcase1.closeBrowser();

        System.out.println();

        System.out.println("Steps for executing Test Case 2 : ");
        TC2 testcase2 = new TC2();
        testcase2.LaunchBrowser();
        testcase2.OpenWebsite();
        testcase2.ReadDataFromExcel();
        testcase2.ExecuteTC1();
        testcase2.closeBrowser();
    }

}
/*
OUTPUT:
Steps for executing Test Case 1 :
Browser is Launched
Site is opened
Input taken from Excel
TC1 is Executed
Browser is Closed

Steps for executing Test Case 2 :
Browser is Launched
Site is opened
Input taken from Excel
TC2 is Executed
Browser is Closed
 */
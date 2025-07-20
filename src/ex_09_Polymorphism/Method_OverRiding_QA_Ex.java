package ex_09_Polymorphism;

public class Method_OverRiding_QA_Ex {
    public static void main(String[] args) {
        common c1 = new chrome();
        c1.OpenBrowser();
    }

    public static class common {
        void OpenBrowser()
        {
            System.out.println("By Default open IE Browser");
        }
    }
    public static class chrome extends common {
        @Override
        void OpenBrowser()
        {
            System.out.println("Open Chrome Browser");
        }
    }
}
/*
Open Chrome Browser
 */
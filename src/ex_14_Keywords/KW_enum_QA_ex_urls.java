package ex_14_Keywords;

public enum KW_enum_QA_ex_urls {
    vwo("www.vwo.com"),
    katlon("www.katalon.com"),
    google("www.google.com");
    private String url;
    KW_enum_QA_ex_urls (String url)    {
        this.url = url;
    }   // Parameterized constructor
    String getURL() {
        return this.url;
    }                   // Method to get URL
}

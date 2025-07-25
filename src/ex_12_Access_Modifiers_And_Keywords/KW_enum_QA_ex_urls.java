package ex_12_Access_Modifiers_And_Keywords;

public enum KW_enum_QA_ex_urls {
    vwo("www.vwo.com"),
    katlon("www.katalon.com"),
    google("www.google.com");
    private String url;
    KW_enum_QA_ex_urls (String url)    {
        this.url = url;
    }
    String getURL() {
        return this.url;
    }
}

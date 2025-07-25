package ex_12_Access_Modifiers_And_Keywords;

public enum urls {
    vwo("www.vwo.com"),
    katlon("www.katalon.com"),
    google("www.google.com");
    private String url;
    urls(String url)    {
        this.url = url;
    }
    String getURL() {
        return this.url;
    }
}

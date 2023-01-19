package data;

public enum CertLanguage {

    UKRAINIAN("ukr"),
    RUSSIAN("ru");
    private String lang;

    CertLanguage(String en) {
        this.lang = en;
    }

    public String getLang() {
        return lang;
    }
}

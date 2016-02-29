
package models.login.request;


import android.content.Context;


public class Data {

    private String action;
    private String lang;

    public Data(Context context) {
        action = "LOGIN";
        lang = "EN";
    }

    /**
     * @return The action
     */
    public String getAction() {
        return action;
    }

    /**
     * @param action The action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * @return The lang
     */
    public String getLang() {
        return lang;
    }

    /**
     * @param lang The lang
     */
    public void setLang(String lang) {
        this.lang = lang;
    }

}

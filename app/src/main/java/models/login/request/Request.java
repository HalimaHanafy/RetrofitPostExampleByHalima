
package models.login.request;

import android.content.Context;

public class Request {

    private String name;
    private String password;

    public Request(Context context) {
        this.name = "salon";
        this.password = "1";
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password The password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}

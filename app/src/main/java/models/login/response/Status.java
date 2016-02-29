
package models.login.response;


public class Status {

    private boolean succeed;
    private String message;

    /**
     * @return The succeed
     */
    public boolean isSucceed() {
        return succeed;
    }

    /**
     * @param succeed The succeed
     */
    public void setSucceed(boolean succeed) {
        this.succeed = succeed;
    }

    /**
     * @return The message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message The message
     */
    public void setMessage(String message) {
        this.message = message;
    }

}


package models.login.response;

public class LoginResponseModel {

    private Status Status;
    private Result Result;

    /**
     * @return The Status
     */
    public Status getStatus() {
        return Status;
    }

    /**
     * @param Status The Status
     */
    public void setStatus(Status Status) {
        this.Status = Status;
    }

    /**
     * @return The Result
     */
    public Result getResult() {
        return Result;
    }

    /**
     * @param Result The Result
     */
    public void setResult(Result Result) {
        this.Result = Result;
    }

}


package models.login.request;

public class LoginRequestModel {

    private Data Data;
    private Request Request;

    public LoginRequestModel(Data data, Request request) {
        Data = data;
        Request = request;
    }



    /**
     * @return The Data
     */
    public Data getData() {
        return Data;
    }

    /**
     * @param Data The Data
     */
    public void setData(Data Data) {
        this.Data = Data;
    }

    /**
     * @return The LoginRequestModel
     */
    public Request getRequest() {
        return Request;
    }

    /**
     * @param Request The LoginRequestModel
     */
    public void setRequest(Request Request) {
        this.Request = Request;
    }
}


package models.login.response;

public class Result {

    private String apiKey;
    private String userId;
    private String message;
    private String salonName_ar;
    private String salonName_en;
    private String salonImageUrl;
    private String salonRating;
    private String salonStatus;
    private String url_img;

    public void setUrlImg(String urlImg) {
        this.url_img = urlImg;
    }

    public String getUrlImg() {
        return url_img;
    }

    /**
     * @return The apiKey
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * @param apiKey The apiKey
     */
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * @return The userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId The userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return The message
     */
    public String getMessage() {
        return message;
    }

    public String getSalonName_ar() {
        return salonName_ar;
    }

    public void setSalonName_ar(String salonName_ar) {
        this.salonName_ar = salonName_ar;
    }

    public void setSalonName_en(String salonName_en) {
        this.salonName_en = salonName_en;
    }

    public void setUrl_img(String url_img) {
        this.url_img = url_img;
    }

    public String getSalonName_en() {
        return salonName_en;
    }

    public String getUrl_img() {
        return url_img;
    }

    /**

     * @param message The message
     */
    public void setMessage(String message) {
        this.message = message;
    }



    /**
     * @return The salonImageUrl
     */
    public String getSalonImageUrl() {
        return salonImageUrl;
    }

    /**
     * @param salonImageUrl The salonImageUrl
     */
    public void setSalonImageUrl(String salonImageUrl) {
        this.salonImageUrl = salonImageUrl;
    }

    /**
     * @return The salonRating
     */
    public float getSalonRating() {
        return Float.parseFloat(salonRating);
    }

    /**
     * @param salonRating The salonRating
     */
    public void setSalonRating(String salonRating) {
        this.salonRating = salonRating;
    }

    /**
     * @return The salonStatus
     */
    public String getSalonStatus() {
        return salonStatus;
    }

    /**
     * @param salonStatus The salonStatus
     */
    public void setSalonStatus(String salonStatus) {
        this.salonStatus = salonStatus;
    }

}

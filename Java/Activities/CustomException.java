package activities;

public class CustomException extends Throwable {
    private String message = null;
    CustomException(String message)
    {
        this.message = message;

    }
    public String getMessage()
    {
        return message;
    }


}

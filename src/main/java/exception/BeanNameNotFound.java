package exception;

/**
 * Created by KAI on 10/7/17.
 */
public class BeanNameNotFound extends Exception {
    public BeanNameNotFound(String message) {
    }

    public BeanNameNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public BeanNameNotFound(Throwable cause) {
        super(cause);
    }

    public BeanNameNotFound() {
    }
}

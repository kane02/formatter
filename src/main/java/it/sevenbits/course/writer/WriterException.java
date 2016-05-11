package it.sevenbits.course.writer;

/**
 * WriterException
 */
public class WriterException extends Exception {

    /**
     * Constructs a new exception with the specified detail message
     * @param message is the message of the exception
     * @param e is exception that can be catching
     */
    WriterException(final String message, final Throwable e) {
        super(message, e);
    }

    /**
     * Constructs a new exception with the specified detail message
     * @param message is the message of the exception
     */
    WriterException(final String message) {
        super(message);
    }
}

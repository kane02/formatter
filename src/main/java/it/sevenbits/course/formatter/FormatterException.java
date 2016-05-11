package it.sevenbits.course.formatter;

/**
 * FormatterException
 * It occurs then some operation during formatting are failed
 */
public class FormatterException extends Exception {

    /**
     * Constructs a new exception with the specified detail message
     * @param message is the message of the exception
     * @param e is exception that can be catching
     */
    FormatterException(final String message,Throwable e) {
        super(message, e);
    }

    /**
     * Constructs a new exception with the specified detail message.
     * The cause is not initialized, and may subsequently be initialized by a call
     * to Throwable.initCause(java.lang.Throwable).
     * @param message the detail message
     */
    FormatterException(final String message) {
        super(message);
    }
}

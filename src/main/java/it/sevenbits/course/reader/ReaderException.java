package it.sevenbits.course.reader;

/**
 * ReaderException
 * It occurs when some reading operation are failed
 */
public class ReaderException extends Exception {

    /**
     * Constructs a new exception with the specified detail message
     * @param message is the message of the exception
     * @param e is exception that can be catching
     */
    ReaderException(final String message, final Throwable e) {
        super(message, e);
    }

    /**
     * Constructs a new exception with the specified detail message.
     * The cause is not initialized, and may subsequently be initialized by a call
     * to Throwable.initCause(java.lang.Throwable).
     * @param message is the message of the exception
     */
    ReaderException(final String message) {
        super(message);
    }
}

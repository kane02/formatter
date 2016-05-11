package it.sevenbits.course.bootstrap;

/**
 * BoostrapException
 */
public class BootstrapException extends Exception {

    /**
     *
     * @param message is the message of the exception
     * @param e is exception
     */
    BootstrapException(final String message, final Throwable e) {
        super(message, e);
    }
}

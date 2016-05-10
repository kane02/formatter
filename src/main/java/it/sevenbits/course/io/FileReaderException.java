package it.sevenbits.course.io;

/**
 * FileReaderException
 * It occurs than some operation with read from bytes are failed
 */
public class FileReaderException extends Exception {

    /**
     *
     * @param message is message of the exception
     * @param e is exception
     */
    public FileReaderException(final String message, final Throwable e) {
        super(message, e);
    }
}

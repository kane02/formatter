package it.sevenbits.course.io;

import java.io.FileWriter;

/**
 * FileWriterException
 * It occurs when some operation with writing in file are failed
 */
public class FileWriterException extends Exception {

    /**
     *
     * @param message is message of the exception
     * @param e is exception
     */
    public FileWriterException(final String message, final Throwable e) {
        super(message, e);
    }
}

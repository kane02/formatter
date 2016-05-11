package it.sevenbits.course.writer;

import java.io.Closeable;

/**
 * provide stream for writing symbols in some source
 */
public interface IWriter extends Closeable {
    /**
     * write symbol into some source
     * @param result String that would be writing
     * @throws WriterException
     */
    void writeString(final String result) throws WriterException;
}

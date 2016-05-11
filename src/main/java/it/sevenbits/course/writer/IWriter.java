package it.sevenbits.course.writer;

import java.io.Closeable;

/**
 * provide stream for writing symbols in some source
 */
public interface IWriter extends Closeable {
    /**
     * write symbol into some sourse
     * @param c char that would be writing
     */
    void write(final char c);
}

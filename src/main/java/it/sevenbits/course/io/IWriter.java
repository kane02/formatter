package it.sevenbits.course.io;

/**
 * provide stream for writing symbols in some source
 */
public interface IWriter {
    /**
     * write symbol into some sourse
     * @param c char that would be writing
     */
    void write(final char c);
}

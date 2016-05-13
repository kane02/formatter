package it.sevenbits.course.writer;

/**
 * provide stream for writing symbols in some source
 */
public interface IWriter {
    /**
     * write symbols into some source
     * @param result String that would be writing
     * @throws WriterException
     */
    void writeString(final String result) throws WriterException;


    /**
     * write symbol into some source
     * @param result char that would be writing
     * @throws WriterException
     */
    void writeChar(final char result)throws WriterException;
}

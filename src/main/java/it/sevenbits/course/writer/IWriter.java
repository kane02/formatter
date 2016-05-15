package it.sevenbits.course.writer;

/**
 * provide stream for writing symbols in some source
 */
public interface IWriter {
    /**
     * Write symbols into some source
     * @param writingString String that would be writing
     * @throws WriterException
     */
    void writeString(final String writingString) throws WriterException;


    /**
     * Write symbol into some source
     * @param writingChar char that would be writing
     * @throws WriterException
     */
    void writeChar(final char writingChar)throws WriterException;
}

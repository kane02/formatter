package it.sevenbits.course.handlers;

import it.sevenbits.course.reader.ReaderException;
import it.sevenbits.course.writer.WriterException;

/**
 * IStreamContextManager
 * Classes implement this interface can manage stream input and output source
 */
public interface IStreamContextManager {

    /**
     * Method of getting the last read char from input stream
     * @return last read char from input stream
     */
    char getReadChar();

    /**
     * Method of getting the previous read char from input stream
     * @return  previous read char from input stream
     */
    char getPreviousReadChar();

    /**
     * Method of writing String into output stream
     * @param result is string which would be writing
     * @throws WriterException
     */
    void writeString(final String result) throws WriterException;

    /**
     * Method of writing char into output stream
     * @param result is char which would be writing
     * @throws WriterException
     */
    void writeChar(final char result) throws WriterException;

    /**
     * Method of reading the next symbol from the input stream
     * @throws ReaderException
     */
    void readNextChar() throws ReaderException;

    /**
     * Method of setting indent level of formatting code
     * @param level is the level of indent
     */
    void setIndentLevel(int level);

    /**
     * Method of getting indent level of formatting code
     * @return level of the indent of formatting code
     */
    int getIndentLevel();

    /**
     * Method of getting size of the indent
     * @return size of the indent
     */
    int getIndentSize();
}

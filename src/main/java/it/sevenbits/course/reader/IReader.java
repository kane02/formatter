package it.sevenbits.course.reader;

/**
 * IReader interface
 * This is abstraction of read input stream from some source
 */
    public interface IReader {

    /**
     * reading char symbol if it exists
     * @return next symbol, one char
     * @throws ReaderException
     */
    char readChar() throws ReaderException;


    /**
     * check end of stream
     * @return boolean true if it end of stream
     */
    boolean isEnd() throws ReaderException;

}

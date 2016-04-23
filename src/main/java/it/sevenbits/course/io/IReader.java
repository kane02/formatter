package it.sevenbits.course.io;

/**
 * Provide input
 */
public interface IReader {

    /**
     * reading char symbol if it exists
     * @return next symbol
     */
    char read();

    /**
     * check end of stream
     * @return boolean true if it end of stream
     */
    boolean isEnd();

}

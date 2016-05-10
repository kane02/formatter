package it.sevenbits.course.io;

import java.io.Closeable;

/**
 * IReader interface
 * This is abstraction of read input stream from some source
 */
public interface IReader extends Closeable {

    /**
     * reading char symbol if it exists
     * @return next symbol, one char
     */
    char readChar();


    /**
     * check end of stream
     * @return boolean true if it end of stream
     */
    boolean isEnd();

}

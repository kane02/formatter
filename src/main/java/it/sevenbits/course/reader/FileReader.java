package it.sevenbits.course.reader;

import it.sevenbits.course.reader.IReader;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * FileReader  class
 * Providing an read input stream from the file
 */
public class FileReader implements IReader {

    private FileInputStream fileInputStream;

    /*

     */
    public FileReader(final String name) {

    }
    /*

     */
    public char readChar() {
        return 0;
    }

    public boolean isEnd() {
        return false;
    }

    public void close() throws IOException {

    }
}

package it.sevenbits.course.reader;


import java.io.Closeable;
import it.sevenbits.course.reader.IReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileReader  class
 * Providing an read input stream from the file
 */
public class FileReader implements IReader , Closeable {

    private FileInputStream fileInputStream;


    /**
     * Constructs an object for reading stream from file
     * It contains FileInputStream for provide Input Stream
     * @param filename is a name of the open
     * @throws ReaderException
     */
    public FileReader(final String filename) throws ReaderException {
        try {
            this.fileInputStream = new FileInputStream(filename);
        } catch (FileNotFoundException exc) {
            throw new ReaderException("File not found", exc);
        }
    }

    /**
     * Method of reading char from the stream
     * Read next symbol if it exist
     * @return next char symbol
     * @throws ReaderException
     */
    public char readChar() throws ReaderException {
        try {
            return (char) fileInputStream.read();
        } catch (IOException e) {
            throw new ReaderException("Can not read file", e);
        }
    }

    /**
     * Method of checking of end of file
     * Checking end of file
     * @return true if it end of file
     */
    public boolean isEnd() throws ReaderException {
        try {
            return fileInputStream.available() == 0;
        } catch (IOException e) {
            throw new ReaderException("Error with work with file", e);
        }
    }

    /**
     * Method of closing of stream
     * @throws IOException
     */
    public void close() {
        try {
            fileInputStream.close();
        } catch (IOException exc) {
            exc.fillInStackTrace();
        }
    }
}

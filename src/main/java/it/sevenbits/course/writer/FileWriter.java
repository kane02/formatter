package it.sevenbits.course.writer;

import java.io.Closeable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Provide writing stream if file
 */
public class FileWriter implements IWriter, Closeable {

    private FileOutputStream fileOutputStream;

    /**
     * Constructor of FileWriter object
     * @param filename of file
     * @throws WriterException
     */
    public FileWriter(final String filename) throws WriterException {
        try {
            fileOutputStream = new FileOutputStream(filename);
        } catch (FileNotFoundException exc) {
            throw new WriterException(exc.getMessage(), exc);
        }
    }

    /**
     * Method of writing in file
     * @param result String that would be writing
     * @throws WriterException
     */
    public void writeString(final String result) throws WriterException {
        try {
            fileOutputStream.write(result.getBytes());
        } catch (IOException exc) {
            throw new WriterException(exc.getMessage(), exc);
        }
    }

    /**
     * Method of writing in file
     * @param result char that would be writing
     * @throws WriterException
     */
    public void writeChar(final char result) throws WriterException {
        try {
            fileOutputStream.write((int) result);
        } catch (IOException exc) {
            throw new WriterException(exc.getMessage(), exc);
        }
    }

    /**
     * Method of closing writing stream
     */
    public void close() {
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }
}

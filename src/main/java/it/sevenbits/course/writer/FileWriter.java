package it.sevenbits.course.writer;

import com.sun.xml.internal.ws.Closeable;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Provide writing stream if file
 */
public class FileWriter implements IWriter, Closeable {

    private FileOutputStream fileOutputStream;
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

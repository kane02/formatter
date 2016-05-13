package it.sevenbits.course.formatter;

import it.sevenbits.course.reader.IReader;
import it.sevenbits.course.reader.ReaderException;
import it.sevenbits.course.writer.IWriter;
import it.sevenbits.course.writer.WriterException;

import java.util.Map;

/**
 * Provides formatting of code
 */
public class Formatter implements IFormatter {

    /**
     * Method of formatting incoming code
     * @param reader income class must implement IReader
     * @param writer income class must implement IWriter
     * @param handlers Map of handlers
     * @throws FormatterException
     * @throws ReaderException
     * @throws WriterException
     */
    public void format(final IReader reader, final IWriter writer, final Map handlers) throws FormatterException , ReaderException, WriterException {


        try {
            while (!reader.isEnd()) {
                char inputChar = (char) reader.readChar();
                if (handlers.containsKey(inputChar)) {
                    writer.writeString((String) handlers.get(inputChar));
                } else {
                    writer.writeString(String.valueOf(inputChar));
                }
            }
        } catch (ReaderException e) {
            throw new FormatterException(e.getMessage(), e);
        } catch (WriterException e) {
            throw new FormatterException(e.getMessage(), e);
        }
    }
}

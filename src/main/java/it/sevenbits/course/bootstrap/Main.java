package it.sevenbits.course.bootstrap;

import it.sevenbits.course.formatter.Formatter;
import it.sevenbits.course.formatter.FormatterException;
import it.sevenbits.course.reader.FileReader;
import it.sevenbits.course.reader.ReaderException;
import it.sevenbits.course.writer.FileWriter;
import it.sevenbits.course.writer.WriterException;

import java.util.HashMap;
import java.util.Map;

/**
 * Enter point of project
 */
public class Main {

    /**
     * default constructor
     */
    public Main() {

    }

    /**
     * Enter point of project
     * @param args of incoming arguments
     */
    public static void main(final String[] args) throws BootstrapException, ReaderException, WriterException {
        Map<Character, String> handlers = new HashMap<Character, String>();
        handlers.put('{', " {\n    ");
        handlers.put('}', "\n}");
        handlers.put(';', ";\n    ");
        handlers.put('(', " ( ");
        handlers.put(')', " ) ");

        try {
            FileReader reader = new FileReader("input.txt");
            FileWriter writer = new FileWriter("output.txt");
            Formatter formatter = new Formatter();
            formatter.format(reader, writer, handlers);
        } catch (ReaderException e) {
            throw new BootstrapException(e.getMessage(), e);
        } catch (WriterException e) {
            throw new BootstrapException(e.getMessage(), e);
        } catch (FormatterException e) {
            throw new BootstrapException(e.getMessage(), e);
        }

    }
}

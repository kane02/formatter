package it.sevenbits.course.bootstrap;

import it.sevenbits.course.formatter.Formatter;
import it.sevenbits.course.formatter.FormatterException;
import it.sevenbits.course.handlers.IHandler;
import it.sevenbits.course.handlers.*;
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

        LeftBraceHandler leftBraceHandler = new LeftBraceHandler();
        RigthBraceHandler rigthBraceHandler = new RigthBraceHandler();
        SemicolonHandler semicolonHandler = new SemicolonHandler();
        OperandsHandler operandsHandler = new OperandsHandler();
        NotSpecificSymbolHandler handler = new NotSpecificSymbolHandler();

        Map<Character, IHandler> handlers = new HashMap<Character, IHandler>();
        handlers.put('{', leftBraceHandler);
        handlers.put('}', rigthBraceHandler);
        handlers.put(';', semicolonHandler);
        handlers.put('+', operandsHandler);
        handlers.put('-', operandsHandler);
        handlers.put('*', operandsHandler);
        handlers.put('/', operandsHandler);
        handlers.put('=', operandsHandler);
        handlers.put('>', operandsHandler);
        handlers.put('<', operandsHandler);
        handlers.put('%', operandsHandler);

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

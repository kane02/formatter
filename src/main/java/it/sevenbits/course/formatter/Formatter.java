package it.sevenbits.course.formatter;

import it.sevenbits.course.handlers.IHandler;
import it.sevenbits.course.handlers.*;
import it.sevenbits.course.reader.IReader;
import it.sevenbits.course.reader.ReaderException;
import it.sevenbits.course.writer.IWriter;
import it.sevenbits.course.writer.WriterException;

import java.util.HashMap;
import java.util.Map;

/**
 * Provides formatting of code
 */
public class Formatter implements IFormatter {

    private Map<Character, IHandler> handlersWork = new HashMap<Character, IHandler>();
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
        this.handlersWork = handlers;
        StreamContextManager streamContext = new StreamContextManager(reader, writer);
        NotSpecificSymbolHandler defaultCharHandler = new NotSpecificSymbolHandler();
        OperandsHandler operandsHandler = new OperandsHandler();

        try {
            while (!reader.isEnd()) {
                streamContext.readNextChar();
                if (handlersWork.containsKey(streamContext.getReadChar())) {
                    handlersWork.get(streamContext.getReadChar()).format(streamContext);
                } else {
                    defaultCharHandler.format(streamContext);
                }
            }
        } catch (ReaderException e) {
            throw new FormatterException(e.getMessage(), e);
        }
    }
}

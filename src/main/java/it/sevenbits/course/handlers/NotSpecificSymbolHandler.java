package it.sevenbits.course.handlers;

import it.sevenbits.course.writer.WriterException;

import java.util.ArrayList;

/**
 * Provide handler of formatting code
 * Work with not specific symbols
 */
public class NotSpecificSymbolHandler implements IHandler {

    /**
     * Method of formatting of the code
     * @param streamContextManager is interface for classes for manage work during format
     */
    public void format(final IStreamContextManager streamContextManager) {
        ArrayList<Character> symbols = new ArrayList<Character>();
        symbols.add('}'); symbols.add('{');
        symbols.add(';'); symbols.add('+');
        symbols.add('-'); symbols.add('/');
        symbols.add('*'); symbols.add('=');
        symbols.add('>'); symbols.add('<');
        symbols.add('%');
        if (!symbols.contains(streamContextManager.getReadChar())) {
            try {
                streamContextManager.writeChar(streamContextManager.getReadChar());
            } catch (WriterException e) {
                e.fillInStackTrace();
            }
        }
    }
}

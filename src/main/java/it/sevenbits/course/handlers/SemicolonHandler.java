package it.sevenbits.course.handlers;

import it.sevenbits.course.writer.WriterException;

/**
 * Provide handler of formatting code
 * Work with semicolon symbol
 */
public class SemicolonHandler implements  IHandler {
    /**
     * Method of formatting of the code
     * @param streamContextManager is interface for classes for manage work during format
     */
    public void format(final IStreamContextManager streamContextManager) {
        if (streamContextManager.getReadChar() != ';') {
            return;
        }
        try {
            streamContextManager.writeString(";");
            streamContextManager.writeString("\n");
            for (int i = 0; i < streamContextManager.getIndentLevel() * streamContextManager.getIndentSize(); i++)
                streamContextManager.writeChar(' ');
        } catch (WriterException e) {
            e.fillInStackTrace();
        }
    }
}

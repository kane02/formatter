package it.sevenbits.course.handlers;

import it.sevenbits.course.writer.WriterException;

/**
 * Provide handler of formatting code
 * Work with left brace symbol
 */
public class LeftBraceHandler  implements IHandler {


    /**
     * Method of formatting of the code
     * @param streamContextManager is interface for classes for manage work during format
     */
    public void format(final IStreamContextManager streamContextManager) {
        if (streamContextManager.getReadChar() != '{')
            return;
        try {
            if (streamContextManager.getPreviousReadChar() != ' ') {
                streamContextManager.writeString(" ");
            }
            streamContextManager.writeString("{");
            streamContextManager.writeString("\n");
            streamContextManager.setIndentLevel(streamContextManager.getIndentLevel() + 1);
            for (int i = 0; i < streamContextManager.getIndentLevel() * streamContextManager.getIndentSize(); i++)
                streamContextManager.writeChar(' ');
        } catch (WriterException e) {
            e.fillInStackTrace();
        }
    }
}

package it.sevenbits.course.handlers;

import it.sevenbits.course.writer.WriterException;

/**
 * Provide handler of formatting code
 * Work with right brace symbol
 */
public class RigthBraceHandler implements IHandler {

    /**
     * Method of formatting of the code
     * @param streamContextManager is interface for classes for manage work during format
     */
    public void format(final IStreamContextManager streamContextManager) {
        if (streamContextManager.getReadChar() != '}') {
            return;
        }
        streamContextManager.setIndentLevel(streamContextManager.getIndentLevel() - 1);
        try {
            streamContextManager.writeString("\n");
            for (int i = 0; i < streamContextManager.getIndentLevel() * streamContextManager.getIndentSize(); i++)
                streamContextManager.writeChar(' ');
            streamContextManager.writeString("}");
        } catch (WriterException e) {
            e.fillInStackTrace();
        }
    }
}

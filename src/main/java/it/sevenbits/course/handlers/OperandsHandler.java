package it.sevenbits.course.handlers;

import it.sevenbits.course.writer.WriterException;

import java.util.ArrayList;
import java.util.List;

/**
 * Provide handler of formatting code
 * Work with operands brace symbol
 */
public class OperandsHandler implements IHandler {

    private List<Character> operands = new ArrayList<Character>();
    private Character[] chars = {'+', '-', '*', '/', '=', '>', '<', '%'};

    /**
     * Method of formatting of the code
     *
     * @param streamContextManager is interface for classes for manage work during format
     */
    public void format(final IStreamContextManager streamContextManager) {
        for (int i = 0; i < chars.length; i++) {
            operands.add(chars[i]);
        }

        if (!operands.contains(streamContextManager.getReadChar())) {
            return;
        }
        if (streamContextManager.getPreviousReadChar() < 0) {
            if (streamContextManager.getPreviousReadChar() != ' ') {
                try {
                    streamContextManager.writeChar(' ');
                } catch (WriterException e) {
                    e.fillInStackTrace();
                }
            }
            try {
                streamContextManager.writeChar(streamContextManager.getReadChar());
                streamContextManager.writeChar(' ');
            } catch (WriterException e) {
                e.fillInStackTrace();
            }

        }
    }
}

package it.sevenbits.course.handlers;

import it.sevenbits.course.reader.IReader;
import it.sevenbits.course.reader.ReaderException;
import it.sevenbits.course.writer.IWriter;
import it.sevenbits.course.writer.WriterException;

/**
 * Provide some method of working during formatting code
 * Work with input and output stream source
 * Manage stream input and output source
 */
public class StreamContextManager implements IStreamContextManager {

    /**
     * size of indent
     */
    private int indentSize = 4;

    /**
     * char symbol of the indent
     */
    private char indentChar = ' ';

    private char readChar = ' ';
    private char readPreviousChar = ' ';
    private int indentLvl = 0;
    private boolean specialMode = false;

    private IReader reader;
    private IWriter writer;

    /**
     * Construct object which can manage formatting work
     * @param reader incoming class for reading from some source
     * @param writer incoming class for wtiting into some source
     */
    public StreamContextManager(final IReader reader, final IWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    /**
     * Method of getting last read char
     * @return last read char
     */
    public char getReadChar() {
        return this.readChar;
    }

    /**
     * Method of getting previous read char
     * @return previous read char
     */
    public char getPreviousReadChar() {
        return this.readPreviousChar;
    }

    /**
     * Method of writing String into output source
     * @param string which would be writing
     * @throws WriterException
     */
    public void writeString(final String string) throws WriterException {
        try {
            writer.writeString(string);
        } catch (WriterException e) {
            e.fillInStackTrace();
        }
    }

    /**
     * Method of writing char into output source
     * @param result is char which would be writing
     * @throws WriterException
     */
    public void writeChar(final char result) throws WriterException {
        try {
            writer.writeChar(result);
        } catch (WriterException e) {
            e.fillInStackTrace();
        }
    }

    /**
     * Method of reading next char symbol from input stream
     * @throws ReaderException
     */
    public void readNextChar() throws ReaderException {
        readPreviousChar = readChar;

        try {
            readChar = reader.readChar();
        } catch (ReaderException e) {
            e.fillInStackTrace();
        }

    }

    /**
     * Method of setting indent level of formatting code
     * @param level is the level of indent
     */
    public void setIndentLevel(final int level) {
        this.indentLvl = level;
    }

    /**
     * Method of setting indent level of formatting code
     * @return indent level of formatting
     */
    public int getIndentLevel() {
        return  this.indentLvl;
    }

    /**
     * Method of getting size of the indent
     * @return size of the indent
     */
    public int getIndentSize() {
        return indentSize;
    }
}

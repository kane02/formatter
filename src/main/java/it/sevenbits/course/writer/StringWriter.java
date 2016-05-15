package it.sevenbits.course.writer;

/**
 * Provide writing stream into string
 */
public class StringWriter implements IWriter {

    private String resultString;
    private int currentPosition;

    /**
     * Constructor
     * @param incomeString is string of destination
     * @throws WriterException
     */
    public StringWriter(final String incomeString) throws WriterException {
        resultString = incomeString;
    }

    /**
     * Method of writing string into result string
     * @param writingString String that would be writing
     * @throws WriterException
     */
    public void writeString(final String writingString) throws WriterException {
        resultString += writingString;
    }

    /**
     * Method of writing string into result string
     * @param writingChar char that would be writing
     * @throws WriterException
     */
    public void writeChar(final char writingChar) throws WriterException {
        resultString += writingChar;
    }
}

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
        try {
            resultString = incomeString;
        } catch (NullPointerException e) {
            throw new WriterException(e.getMessage(), e);
        }
    }

    /**
     * Method of writing string into result string
     * @param writingString String that would be writing
     * @throws WriterException
     */
    public void writeString(final String writingString) throws WriterException {
        try {
            resultString += writingString;
        } catch (Exception e) {
            throw new WriterException(e.getMessage(), e);
        }
    }

    /**
     * Method of writing string into result string
     * @param writingChar char that would be writing
     * @throws WriterException
     */
    public void writeChar(final char writingChar) throws WriterException {
        try {
            resultString += writingChar;
        } catch (Exception e) {
            throw new WriterException(e.getMessage(), e);
        }
    }

    /**
     * Method of getting result string
     * @return result string
     */
    public String getResultString() {
        return resultString;
    }
}

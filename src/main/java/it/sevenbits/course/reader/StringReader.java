package it.sevenbits.course.reader;

/**
 * Provide reading stream from the string
 */
public class StringReader implements IReader {

    private String workString;
    private int currentPosition;
    private int length;

    /**
     * Construct object of StringReader
     * @param incomingString is string which will be read
     * @throws ReaderException
     */
    public StringReader(final String incomingString) throws ReaderException {
        try {
            workString = incomingString;
            currentPosition = 0;
            length = workString.length();
        } catch (NullPointerException e) {
            throw new ReaderException(e.getMessage(), e);
        }
    }

    /**
     * Method of reading next char from string
     * @return next char from string
     * @throws ReaderException
     */
    public char readChar() throws ReaderException {
        char readChar;
        try {
            readChar = workString.charAt(currentPosition);
            currentPosition++;
            return readChar;
        } catch (IndexOutOfBoundsException e) {
            throw new ReaderException(e.getMessage(), e);
        }
    }

    /**
     * Method of checked end of string
     * @return true if it end
     * @throws ReaderException
     */
    public boolean isEnd() throws ReaderException {
        return currentPosition == length;
    }

    /**
     * Method of getting length of the work string
     * @return length of the string
     */
    public int getLength() {
        return length;
    }
}

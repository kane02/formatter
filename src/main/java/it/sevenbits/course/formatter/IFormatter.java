package it.sevenbits.course.formatter;

import it.sevenbits.course.reader.ReaderException;
import it.sevenbits.course.writer.IWriter;
import it.sevenbits.course.reader.IReader;
import it.sevenbits.course.writer.WriterException;

import java.util.Map;

/**
 * IFormatter interface
 */
public interface IFormatter {

    /**
     * Formatting of Java code
     * @param reader income class must implements IReader
     * @param writer income class must implements IWriter
     * @param handlers Map of handlers
     * @throws FormatterException
     * @throws ReaderException
     * @throws WriterException
     */
    void format(IReader reader, IWriter writer, Map handlers) throws FormatterException, ReaderException, WriterException;
}

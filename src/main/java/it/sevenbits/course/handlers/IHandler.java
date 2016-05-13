package it.sevenbits.course.handlers;

/**
 * IHandler interface
 * For class which handle different char symbols
 */
public interface IHandler {

    /**
     * Method of formatting part of the code near of some char symbol
     * @param streamContextManager is interface for classes for manage work during format
     */
    void format(IStreamContextManager streamContextManager);
}

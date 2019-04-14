package com.oszhugc.responsibilitychain;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 14:52
 **/
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers(){
        ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        FileLogger fileLogger = new FileLogger(AbstractLogger.DEBUGGER);
        ConsoleLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger chainOfLoggers = getChainOfLoggers();

        chainOfLoggers.logMsg(AbstractLogger.INFO," this is an informatioin");
        chainOfLoggers.logMsg(AbstractLogger.DEBUGGER," this is a debug level information");
        chainOfLoggers.logMsg(AbstractLogger.ERROR," this is an error information");
    }

}

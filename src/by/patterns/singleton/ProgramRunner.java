package by.patterns.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("Log Info №1");
        ProgramLogger.getProgramLogger().addLogInfo("Log Info №2");
        ProgramLogger.getProgramLogger().addLogInfo("Log Info №3");

        ProgramLogger.getProgramLogger().readLogFile();
    }
}

package calc.core.logger;

import java.time.LocalDateTime;

public class LoggerConsole implements Loggerable{

    public LoggerConsole() {
    }

    @Override
    public void logg(String msg) {

        System.err.println(LocalDateTime.now() + msg);

    }
}
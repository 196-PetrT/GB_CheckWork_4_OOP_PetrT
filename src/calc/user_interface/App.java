package calc.user_interface;

import calc.core.complexCalculator.ComplexCalculable;
import calc.core.complexCalculator.ComplexNumber;
import calc.core.impl.Calculator;
import calc.core.logger.Decorator;
import calc.impl.ConsoleComplexView;
import calc.impl.ConsoleView;

public class App {
//    ConsoleView ui;
    ConsoleComplexView ui;

    public App() {
//        ui = new ConsoleView(new Calculator());
//        ui = new ConsoleView(new LoggerCalculator(new Calculator()));
        ui = new ConsoleComplexView(new Decorator(new ComplexNumber()));

        ui.start();

    }

}

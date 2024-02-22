package calc.core.views;


public interface  View {

     default void start() {
        while (true) {
            prepare();
            String action = prompt();
            if (!action.equalsIgnoreCase("y")) {
                System.exit(0);
            }
        }
    }

    void prepare();

    String prompt();

    String getOperator();



}

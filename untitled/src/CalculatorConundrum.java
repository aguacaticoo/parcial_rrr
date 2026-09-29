
class IllegalOperationException extends RuntimeException {

    public IllegalOperationException(String message) {
        super(message);
    }

    public IllegalOperationException(String message, Throwable cause) {
        super(message, cause);
    }
}


public class CalculatorConundrum {

    public String calculate(int operand1, int operand2, String operation) {

        // 1. Verificar si operation es null
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }

        // 2. Verificar si operation está vacía
        if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }

        try {

            int result;

            // 3. Elegir la operación
            switch (operation) {

                case "+":
                    result = operand1 + operand2;
                    break;

                case "*":
                    result = operand1 * operand2;
                    break;

                case "/":
                    result = operand1 / operand2;
                    break;

                default:
                    throw new IllegalOperationException(
                            "Operation '" + operation + "' does not exist"
                    );
            }

            return operand1 + " " + operation + " " + operand2
                    + " = " + result;

        } catch (ArithmeticException e) {

            // 4. Capturar división entre cero
            throw new IllegalOperationException(
                    "Division by zero is not allowed",
                    e
            );
        }
    }


    public static void main(String[] args) {

        CalculatorConundrum calculator = new CalculatorConundrum();

        // Operaciones normales
        System.out.println(calculator.calculate(16, 51, "+"));
        System.out.println(calculator.calculate(32, 6, "*"));
        System.out.println(calculator.calculate(512, 4, "/"));

        System.out.println();

        // Operación inválida
        try {
            System.out.println(calculator.calculate(10, 1, "-"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Null
        try {
            System.out.println(calculator.calculate(10, 1, null));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Vacío
        try {
            System.out.println(calculator.calculate(10, 1, ""));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // División entre cero
        try {
            System.out.println(calculator.calculate(512, 0, "/"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

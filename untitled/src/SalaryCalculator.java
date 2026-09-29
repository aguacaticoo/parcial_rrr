
public class SalaryCalculator {

    public double salaryMultiplier(int daysSkipped) {

        double result = daysSkipped >= 5 ? 0.85 : 1.0;

        return result;
    }

    public int bonusMultiplier(int productsSold) {

        int result = productsSold >= 20 ? 13 : 10;

        return result;
    }

    public double bonusForProductsSold(int productsSold) {

        double result = productsSold * bonusMultiplier(productsSold);

        return result;
    }

    public double finalSalary(int daysSkipped, int productsSold) {

        double salary = 1000.0 * salaryMultiplier(daysSkipped)
                + bonusForProductsSold(productsSold);

        double result = salary > 2000.0 ? 2000.0 : salary;

        return result;
    }

    public static void main(String[] args) {

        SalaryCalculator calculator = new SalaryCalculator();

        int daysSkipped = 3;
        int productsSold = 25;

        System.out.println("Días faltados: " + daysSkipped);
        System.out.println("Productos vendidos: " + productsSold);
        System.out.println();

        System.out.println("Multiplicador de salario: "
                + calculator.salaryMultiplier(daysSkipped));

        System.out.println("Multiplicador de bono: "
                + calculator.bonusMultiplier(productsSold));

        System.out.println("Bono por productos vendidos: "
                + calculator.bonusForProductsSold(productsSold));

        System.out.println("Salario final: "
                + calculator.finalSalary(daysSkipped, productsSold));
    }
}


public class CarsAssemble {

    public double productionRatePerHour(int speed) {

        double successRate;

        if (speed >= 1 && speed <= 4) {
            successRate = 1.0;
        } else if (speed >= 5 && speed <= 8) {
            successRate = 0.90;
        } else if (speed == 9) {
            successRate = 0.80;
        } else {
            successRate = 0.77;
        }

        return speed * 221 * successRate;
    }

    public static void main(String[] args) {

        CarsAssemble car = new CarsAssemble();

        int speed = 6;

        double result = car.productionRatePerHour(speed);

        System.out.println("Velocidad: " + speed);
        System.out.println("Producción por hora: " + result);
    }
}


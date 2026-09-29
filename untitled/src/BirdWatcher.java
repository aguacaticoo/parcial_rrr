
import java.util.Arrays;

class BirdWatcher {

    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {

        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {

        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {

        int today = birdsPerDay[birdsPerDay.length - 1];

        System.out.println("today: " + today);

        return today;
    }

    public void incrementTodaysCount() {

        birdsPerDay[birdsPerDay.length - 1]++;

        System.out.println("count incrementado, ahora: "
                + birdsPerDay[birdsPerDay.length - 1]);
    }

    public boolean hasDayWithoutBirds() {

        for (int count : birdsPerDay) {

            if (count == 0) {

                System.out.println("hasDayWithoutBirds: true");

                return true;
            }
        }

        System.out.println("hasDayWithoutBirds: false");

        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {

        int total = 0;

        int limit = Math.min(numberOfDays, birdsPerDay.length);

        for (int i = 0; i < limit; i++) {

            total += birdsPerDay[i];
        }

        System.out.println("total primeros " + numberOfDays
                + " dias: " + total);

        return total;
    }

    public int getBusyDays() {

        int busyDays = 0;

        for (int count : birdsPerDay) {

            if (count >= 5) {

                busyDays++;
            }
        }

        System.out.println("busyDays: " + busyDays);

        return busyDays;
    }

    public static void main(String[] args) {

        int[] birds = BirdWatcher.getLastWeek();

        BirdWatcher watcher = new BirdWatcher(birds);

        System.out.println("Semana: " + Arrays.toString(birds));
        System.out.println();

        watcher.getToday();

        watcher.incrementTodaysCount();

        watcher.getToday();

        watcher.hasDayWithoutBirds();

        watcher.getCountForFirstDays(4);

        watcher.getBusyDays();
    }
}
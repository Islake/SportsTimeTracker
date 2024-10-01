import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SportsTimeTracker {
    private static class Activity {
        String name;
        int duration; // in minutes

        Activity(String name, int duration) {
            this.name = name;
            this.duration = duration;
        }
    }

    private List<Activity> activities = new ArrayList<>();

    public void logActivity(String name, int duration) {
        activities.add(new Activity(name, duration));
    }

    public void viewActivities() {
        if (activities.isEmpty()) {
            System.out.println("No activities logged.");
        } else {
            for (Activity activity : activities) {
                System.out.println("Activity: " + activity.name + ", Duration: " + activity.duration + " minutes");
            }
        }
    }

    public int calculateTotalTime() {
        int totalTime = 0;
        for (Activity activity : activities) {
            totalTime += activity.duration;
        }
        return totalTime;
    }

    public static void main(String[] args) {
        SportsTimeTracker tracker = new SportsTimeTracker();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Log Activity");
            System.out.println("2. View Activities");
            System.out.println("3. Calculate Total Time");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter activity name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter duration in minutes: ");
                    int duration = scanner.nextInt();
                    tracker.logActivity(name, duration);
                    break;
                case 2:
                    tracker.viewActivities();
                    break;
                case 3:
                    int totalTime = tracker.calculateTotalTime();
                    System.out.println("Total time spent on sports: " + totalTime + " minutes");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
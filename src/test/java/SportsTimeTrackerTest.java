import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SportsTimeTrackerTest {
    private SportsTimeTracker tracker;

    @Before
    public void setUp() {
        tracker = new SportsTimeTracker();
    }

    @Test
    public void testLogActivity() {
        tracker.logActivity("Running", 60);
        assertEquals(1, tracker.getActivities().size());
        assertEquals("Running", tracker.getActivities().get(0).getName());
        assertEquals(60, tracker.getActivities().get(0).getDuration());
    }

    @Test
    public void testViewActivities() {
        tracker.logActivity("Running", 60);
        tracker.logActivity("Swimming", 30);
        tracker.viewActivities();
        // This test will just ensure no exceptions are thrown during viewActivities
    }

    @Test
    public void testCalculateTotalTime() {
        tracker.logActivity("Running", 60);
        tracker.logActivity("Swimming", 30);
        assertEquals(90, tracker.calculateTotalTime());
    }
}
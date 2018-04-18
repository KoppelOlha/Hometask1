import org.testng.annotations.Test;

public class Extensions {
    private static String line;

    @Test
    public void text() {
        System.out.println("Summer");
        try {
            this.line.contains("Привет");
        } catch (NullPointerException e) {
            System.out.println("The Null object");
        }

    }
}
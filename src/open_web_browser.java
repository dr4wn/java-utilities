import java.awt.Desktop;
import java.io.IOException;

public class open_web_browser {
    public static void main(String[] args) throws IOException {
        // create Desktop object
        Desktop desktop = Desktop.getDesktop(); // get desktop object
        // open web browser
        var uri = java.net.URI.create("https://google.com");
        desktop.browse(uri); // browse to specified url 
    }
}

package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class SiteGeneratorTest {
   private static final SiteGenerator test = new SiteGenerator();

    @Test
    void createSite() {
        test.path = "data/";
        test.siteName = "testmethod.com";
        test.author = "Leonardo Herrera";

        File expected = new File("data/testmethod.com");
        File actual = test.createSite();

        assertEquals(expected, actual);
    }

    @Test
    void createJSFolder() {
        test.path = "data/";
        test.siteName = "testmethod.com";
        test.author = "Leonardo Herrera";

        File expected = new File("data/testmethod.com/js");
        File actual = test.createJSFolder();

        assertEquals(expected, actual);
    }

    @Test
    void createCSSFolder() {
        test.path = "data/";
        test.siteName = "testmethod.com";
        test.author = "Leonardo Herrera";

        File expected = new File("data/testmethod.com/css");
        File actual = test.createCSSFolder();

        assertEquals(expected, actual);
    }

    @Test
    void createHTML() throws IOException {
        test.path = "data/";
        test.siteName = "testmethod.com";
        test.author = "Leonardo Herrera";

        File expected = new File("data/testmethod.com/index.html");
        File actual = test.createHTML();

        assertEquals(expected, actual);
    }
}
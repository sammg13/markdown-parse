import static org.junit.Assert.*;
import java.sql.Array;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void testFile() throws IOException{
        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-page.html");
        assertEquals(expected, links);
    }
    @Test
    public void testFile2() throws IOException{
        Path fileName = Path.of("new-test-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, links);
    }
    @Test
    public void testFile3() throws IOException{
        Path fileName = Path.of("test3-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("https:something.com");
        assertEquals(expected, links);
    }
    @Test
    public void testFile4() throws IOException{
        Path fileName = Path.of("test4-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, links);
    }
    @Test
    public void testFile5() throws IOException{
        Path fileName = Path.of("test5-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, links);
    }
    @Test
    public void testFile6() throws IOException{
        Path fileName = Path.of("test6-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("page1.com");
        assertEquals(expected, links);
    }
}
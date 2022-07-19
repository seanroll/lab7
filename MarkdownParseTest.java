import static org.junit.Assert.*;

import java.beans.Transient;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;
public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getCorrectLinks1() throws IOException{
        String content = Files.readString(Path.of("test-file.md"));
        assertEquals(List.of("https://something.com", "some-thing.html"),MarkdownParse.getLinks(content));
    }

    @Test
    public void getCorrectLinks2() throws IOException{
        String content = Files.readString(Path.of("test-file2.md"));
        assertEquals(List.of("https://google.com", "some-thing.html"),MarkdownParse.getLinks(content));
    }

    @Test
    public void getCorrectLinks3() throws IOException{
        String content = Files.readString(Path.of("test-file3.md"));
        assertEquals(List.of("more text here"),MarkdownParse.getLinks(content));
    }

    @Test
    public void getCorrectLinks4() throws IOException{
        String content = Files.readString(Path.of("test-file4.md"));
        assertEquals(List.of(""),MarkdownParse.getLinks(content));
    }

    @Test
    public void getCorrectLinks5() throws IOException{
        String content = Files.readString(Path.of("test-file5.md"));
        assertEquals(List.of("page.com"),MarkdownParse.getLinks(content));
    }

    @Test
    public void getCorrectLinks6() throws IOException{
        String content = Files.readString(Path.of("test-file6.md"));
        assertEquals(List.of(""),MarkdownParse.getLinks(content));
    }

    @Test
    public void getCorrectLinks7() throws IOException{
        String content = Files.readString(Path.of("test-file.md7"));
        assertEquals(List.of(""),MarkdownParse.getLinks(content));
    }

    @Test
    public void getCorrectLinks8() throws IOException{
        String content = Files.readString(Path.of("test-file8.md"));
        assertEquals(List.of("a link on the first line"),MarkdownParse.getLinks(content));
    }

}
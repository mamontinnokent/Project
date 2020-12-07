import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.*;



//  2
//  <p><a href="http://www.quackit.com/html/tutorial/html_links.cfm">Example Link</a></p>
//  <div class="more-info"><a href="http://www.quackit.com/html/examples/html_links_examples.cfm">More Link Examples...</a></div>


public class Test {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        str = str.replaceAll(".*(<a.+?a>)", "");

        System.out.println(str);

    }
}
package baseline;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SiteGenerator {

    String siteName;
    String author;
    String path;

    public File createSite(){
        // use this method to create the website folder
        // create the folder by creating a file
        // the name of the folder should be the name of the website
        File site = new File(path+siteName);

        // create the directory
        site.mkdirs();
        return site;
    }

    public File createJSFolder(){
        // this method will create the JavaScript folder
        // create a new file called "/js"
        // add "/js" to the directory along with the name of the website
        File js = new File(path+siteName+"/js");

        js.mkdirs();
        return js;
    }

    public File createCSSFolder(){
        // this method will create the CSS folder
        // create new file called "/css"
        // add "/css" to the directory along with the name of the website
        File css = new File(path+siteName+"/css");

        css.mkdirs();
        return css;
    }

    public File createHTML() throws IOException {
        // this method creates the HTML file
        // store the name of the website in <title> and the author in <meta> tags
        // create new file called "/index.html"
        File html = new File(path+siteName+"/index.html");
        String htmlFile = "<title>" +siteName+ "</title>\n<meta>"+author+"</meta>";

        // use the file writer to create a new output file
        FileWriter output = new FileWriter(html);
        output.write(htmlFile);

        // close the output file
        output.close();
        return html;
    }
}

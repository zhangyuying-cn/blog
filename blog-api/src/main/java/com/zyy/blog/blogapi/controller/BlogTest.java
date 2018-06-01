package com.zyy.blog.blogapi.controller;

import org.pegdown.PegDownProcessor;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author zyy.
 */
public class BlogTest {
    

    public static void main(String[] args) throws IOException {

        System.out.println(get());
    }

    public static String get() throws IOException {
        //java.io.InputStream in = this.getClass().getResourceAsStream("markdown.md");
        String html = null;
        FileReader r = new FileReader("D:\\learn\\test.md");
        char[] cbuf = new char[1024];
        while (r.read(cbuf) != -1) {
            html = new String(cbuf);
        }

        PegDownProcessor pdp = new PegDownProcessor(Integer.MAX_VALUE);
        html = pdp.markdownToHtml(html);
        return html;
    }

}

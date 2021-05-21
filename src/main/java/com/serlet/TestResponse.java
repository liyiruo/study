package com.serlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

/**
 * @author liyiruo
 * @Description response 返回到页面
 * @Date 2021/5/21 上午11:21
 */
public class TestResponse extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = null;
        InputStream is = null;

        out = resp.getWriter();
        Properties config = new Properties();
        is = this.getClass().getClassLoader().getResourceAsStream("info.properties");
        config.load(is);
        String s = (String)config.get("");
        is.close();
        is=null;
        //弹出一个框
        out.print("<script type=\"text/javascript\">alert(\"这是alert的内容\")</script>");
        //打开一个网页
        out.print("<script type=\"text/javascript\">window.parent.document.location.href='"+s+"'</script>");

    }
}

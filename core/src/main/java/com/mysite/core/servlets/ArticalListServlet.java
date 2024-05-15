package com.mysite.core.servlets;

import com.mysite.core.services.Articalservice;
import org.apache.commons.net.nntp.Article;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.annotation.Resource;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;


@Component(service = Servlet.class)
@SlingServletPaths("/bin/mysite/ArticleServiceServlate")
public class ArticalListServlet extends SlingAllMethodsServlet {

    @Reference
     Articalservice articalservice;



    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {

        response.getWriter().write(articalservice.getArtical());
    }



}
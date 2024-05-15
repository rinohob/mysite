package com.mysite.core.servlets;


import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;

import org.apache.sling.api.resource.ModifiableValueMap;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.util.*;


@Component(service = Servlet.class)
@SlingServletPaths("/mysite/ArticleServiceServlate")
//@SlingServletResourceTypes(resourceTypes = "mysite/late")
public class ArticalsreiviceServlate extends SlingAllMethodsServlet {

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        ResourceResolver resolver = request.getResourceResolver();
        Resource userResource = resolver.getResource("/content/user");
        Iterator<Resource> children=userResource.listChildren();


        JsonArrayBuilder userJson=Json.createArrayBuilder();

        while(children.hasNext()){
            Resource User=children.next();
              ValueMap  prop =User.getValueMap();
              String FirstName=prop.get("FirstName", String.class);
            String LastName=prop.get("  LastName", String.class);
            String Email=prop.get("Email", String.class);


            JsonObjectBuilder  userObg= Json.createObjectBuilder();
            if(FirstName!=null){
                userObg.add("FirstName" ,FirstName);
            }
            if(LastName!=null){
                userObg.add("LastName" ,LastName);
            }
            if(Email!=null){
                userObg.add("Email" ,Email);
                userJson.add(userObg);
            }
        }
        response.getWriter().write(userJson.build().toString());
    }

    @Override
    protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        String UserName = request.getParameter("UserName");
        String FirstName = request.getParameter("FirstName");
        String LastName = request.getParameter("LastName");
        String Email = request.getParameter("Email");

        ResourceResolver resolver = request.getResourceResolver();
        Map<String, Object> prop = new HashMap<>();

        prop.put("FirstName", FirstName);
        prop.put("LastName", LastName);
        prop.put("email", Email);


        Resource userResource = resolver.getResource("/content/user");
        resolver.create(userResource, UserName, prop);

        response.getWriter().write("method excuted succesfully");
        resolver.commit();


    }
    @Override
    protected void doPut(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        String UserName = request.getParameter("UserName");
        String FirstName = request.getParameter("FirstName");
        String LastName = request.getParameter("LastName");
        String Email = request.getParameter("Email");


ResourceResolver resolver= request.getResourceResolver();
        Resource userResource = resolver.getResource("/content/user"+UserName);
if(userResource!=null){
    ModifiableValueMap mprop=userResource.adaptTo(ModifiableValueMap.class);
    if(FirstName!=null){
        mprop.put("FirstName",FirstName);
    }
}

        response.getWriter().write("dugectics");
        resolver.commit();


    }
}

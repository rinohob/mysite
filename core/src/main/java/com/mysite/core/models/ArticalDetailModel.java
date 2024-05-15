package com.mysite.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;
import java.util.Date;

@Model(adaptables = {Resource.class , SlingHttpServletRequest.class})
public class ArticalDetailModel {
    @ValueMapValue
    private  String title;

    @ValueMapValue
    private  String text;

    @ValueMapValue
    private  Date  Articalexp;

    @ValueMapValue
    private  String img;

    private  boolean Articalisexpierd = false;

    @PostConstruct
    public void init(){
        if(Articalexp!=null){
            Date today = new Date();
            if(Articalexp.compareTo(today)<0){
                Articalisexpierd = true;
            }
        }
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public boolean isArticalisexpierd() {
        return Articalisexpierd;
    }

    public Date getArticalexp() {
        return Articalexp;
    }

    public String getImg() {
        return img;
    }
}

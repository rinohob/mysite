package com.mysite.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;
import java.util.Date;

@Model(adaptables = {Resource.class, SlingHttpServletRequest.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
class ArticalModel{

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String desc;

    @ValueMapValue
    private String img;

    @ValueMapValue
    private Date Articalexp;

//    private Boolean status=false;


    @PostConstruct
    public void init(){
       if(Articalexp!=null){
           Date date= new Date();
           if(Articalexp.compareTo(date)<0);

       }
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getImg() {
        return img;
    }

    public Date getArticalexp() {
        return Articalexp;
    }

}

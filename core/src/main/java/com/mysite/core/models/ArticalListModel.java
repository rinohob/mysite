package com.mysite.core.models;

import com.mysite.core.services.Articalservice;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ArticalListModel {

    @ValueMapValue
    private boolean useServlate;

    public boolean isUseServlate() {
        return useServlate;
    }

    @OSGiService
    public Articalservice articalservice;

    String data;

    public String getData() {
        return articalservice.getArtical();
    }


}

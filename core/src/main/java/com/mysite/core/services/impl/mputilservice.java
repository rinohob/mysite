package com.mysite.core.services.impl;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.Map;

@Component(service = mputilservice.class)
public class mputilservice {

    @Reference
    ResourceResolverFactory factory;


    public ResourceResolver getResourceResolver() {
        ResourceResolver resolver = null;
        try{
            Map<String,Object> props =new HashedMap<>();
            props.put(ResourceResolverFactory.SUBSERVICE,"mpsubservice");
            resolver = factory.getServiceResourceResolver(props);
        } catch (LoginException e) {
            throw new RuntimeException(e);
        }
        return resolver;
    }

}

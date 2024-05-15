package com.mysite.core.services.impl;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition
public @interface ArticleConfigration {


    @AttributeDefinition(name = "rest api" , required = true)
    public String ArticalrestApi() default  "https://gorest.co.in/public/v2/posts";

}

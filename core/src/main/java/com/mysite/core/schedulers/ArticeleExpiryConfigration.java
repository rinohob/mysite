package com.mysite.core.schedulers;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition
public @interface  ArticeleExpiryConfigration {

  @AttributeDefinition(name ="schedular Cron Expression Value")
  public String cornExpression()  default "*/10 * * ? * *";

@AttributeDefinition(name= "Scheduler Name ")
    public String  schedulerName() default "article-expiry";

@AttributeDefinition(name= "Enable/ DAisabble Scheduler")
     public boolean enable () default true ;


     }

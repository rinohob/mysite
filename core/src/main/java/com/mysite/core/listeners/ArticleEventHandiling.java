package com.mysite.core.listeners;

import com.day.cq.replication.ReplicationAction;
import com.mysite.core.services.impl.mputilservice;
import org.apache.sling.api.resource.ModifiableValueMap;
import org.apache.sling.api.resource.PersistenceException;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = EventHandler.class,
        property = {
                EventConstants.EVENT_TOPIC + "=" + ReplicationAction.EVENT_TOPIC,
                EventConstants.EVENT_FILTER + "=(& (type=ACTIVATE) (paths=/content/mysite/us/en/*))"
        })

        public class ArticleEventHandiling implements EventHandler{
        private static final Logger log=LoggerFactory.getLogger(ArticleEventHandiling.class);
    @Reference
    mputilservice mputilservice;
    @Override
    public void handleEvent(Event event) {
        log.info("inside handle event method....");


        String[] paths = (String[]) event.getProperty("paths");
        try (ResourceResolver resolver = mputilservice.getResourceResolver()) {
            for (String path : paths) {
                Resource resource = resolver.getResource(path +"/jcr:content/root/container/container/articallist");
                ModifiableValueMap mprop = resource.adaptTo(ModifiableValueMap.class);
                mprop.put("pageIsActivated", "umesh reddy");
            }
            resolver.commit();
        } catch (PersistenceException e) {
            throw new RuntimeException(e);
        }
    }
}

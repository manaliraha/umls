package com.myapp.demo.config;

import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ws.rs.Path;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class JerseyConfig extends ResourceConfig {
    @Autowired
    private ApplicationContext appCtx;

    @PostConstruct
    public void setup() {
      final Map<String, Object> beans = appCtx.getBeansWithAnnotation(Path.class);
      for (final Object o : beans.values()) {
        register(o);
      }
      final Map<String, Object> serviceBeans = appCtx.getBeansWithAnnotation(Service.class);
      for (final Object o : serviceBeans.values()) {
        register(o);
      }
    }
  }



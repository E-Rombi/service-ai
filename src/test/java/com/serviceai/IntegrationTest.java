package com.serviceai;

import com.serviceai.config.AsyncSyncConfiguration;
import com.serviceai.config.EmbeddedMongo;
import com.serviceai.config.JacksonConfiguration;
import com.serviceai.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { ServiceAiApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@EmbeddedMongo
public @interface IntegrationTest {
}

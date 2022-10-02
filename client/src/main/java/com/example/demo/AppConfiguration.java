package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@RefreshScope
@ConfigurationProperties("app1")
@Configuration
public class AppConfiguration {
    private String property1;
    private String property2;

    public AppConfiguration() {
    }

    public String getProperty1() {
        return property1;
    }

    public void setProperty1(String property1) {
        this.property1 = property1;
    }

    public String getProperty2() {
        return property2;
    }

    public void setProperty2(String property2) {
        this.property2 = property2;
    }

    @Override
    public String toString() {
        return "AppConfiguration{" + "property1='" + property1 + '\'' + ", property2='" + property2 + '\'' + '}';
    }
}

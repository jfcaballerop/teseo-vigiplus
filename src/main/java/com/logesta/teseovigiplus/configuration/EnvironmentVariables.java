package com.logesta.teseovigiplus.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:env.properties")
@ConfigurationProperties("env.api.external.uri")
public class EnvironmentVariables {
    private String empresaSVC;
    private String driverSVC;

    public String getEmpresaSVC() {
        return empresaSVC;
    }

    public void setEmpresaSVC(String empresaSVC) {
        this.empresaSVC = empresaSVC;
    }
    
    public EnvironmentVariables(){
    }

    public String getDriverSVC() {
        return driverSVC;
    }

    public void setDriverSVC(String driverSVC) {
        this.driverSVC = driverSVC;
    }

}
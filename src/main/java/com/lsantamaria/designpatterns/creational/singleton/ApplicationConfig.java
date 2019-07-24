package com.lsantamaria.designpatterns.creational.singleton;

import lombok.EqualsAndHashCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@EqualsAndHashCode
public class ApplicationConfig {
  private Logger logger = LoggerFactory.getLogger(ApplicationConfig.class);
  private static ApplicationConfig applicationConfig;

  private ApplicationConfig() {
    loadDefaultLanguage();
    initDatasource();
  }

  private void initDatasource() {
    logger.info("Initializing datasource...");
  }

  private void loadDefaultLanguage() {
    logger.info("Loading default language...");
  }

  public static synchronized ApplicationConfig getInstance(){
    if(applicationConfig == null){
      applicationConfig = new ApplicationConfig();
    }
    return applicationConfig;
  }

}

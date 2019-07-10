package com.lsantamaria.designpatterns.behavioral.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CiscoRouter extends RouterTemplate {

  private static final String ROUTER_IP = "143.83.25.23";
  private Logger logger = LoggerFactory.getLogger(this.getClass());


  @Override
  public void mapToNAT(String src, String dst) throws IllegalStateException {
    logger
        .info("Mapping src {} to dst {} from router {}", src, dst, this.getClass().getSimpleName());
  }

  @Override
  public void replaceSourceAddress(HTTPPacket packet) {
    packet.setSrc(getRouterIP());
    logger.info("Replacing src address to router address {}", getRouterIP());
  }

  private String getRouterIP(){
    return ROUTER_IP;
  }
}

package com.lsantamaria.designpatterns.behavioral.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class RouterTemplate {

  private Logger logger = LoggerFactory.getLogger(this.getClass());

  /**
   * Reads the src IP address of the current HTTP packet.
   *
   * @param packet The HTTP packet.
   * @return the src IP address.
   */
  String readSourceAddress(HTTPPacket packet){
    logger.info("Reading src address: {}", packet.getSrc());
    return packet.getSrc();
  }

  /**
   * Reads the dst IP address of the current HTTP packet.
   *
   * @param packet The HTTP packet.
   * @return the dst IP address.
   */
  String readDestinationAddress(HTTPPacket packet){
    logger.info("Reading dst address :{}", packet.getDst());
    return packet.getDst();
  }


  /**
   * Maps the src/dst addresses to the NAT table.
   *
   * @param src the src address.
   * @param dst the dst address.
   *
   * @throws IllegalStateException if there is an exception mapping the addresses.
   */
  abstract void mapToNAT(String src, String dst) throws IllegalStateException;

  /**
   * Replaces the src address to the router's one in the HTTP packet.
   *
   * @param packet the HTTP packet
   */
  abstract void replaceSourceAddress(HTTPPacket packet);

  /**
   * Forwards the HTTP packet after modifying the IPs.
   *
   * @param packet the HTTP packet.
   */
  public void forwardPacket(HTTPPacket packet) {
    String ipSrc = readSourceAddress(packet);
    String ipDst = readDestinationAddress(packet);

    mapToNAT(ipSrc, ipDst);

    replaceSourceAddress(packet);

    logger.info("Sending the packet from src: {} to dst: {}", packet.getSrc(), packet.getDst());
  }
}

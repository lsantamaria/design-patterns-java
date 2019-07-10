package com.lsantamaria.designpatterns.behavioral.template;

/**
 * The template pattern goal is to avoid duplicated code in our application by providing a central
 * class where to define all the common operations. At the same time, it opens the door for adding
 * non-common operations by subclassing. This is achieved by creating an abstract class with the
 * common operations implemented and leaving abstract those operations that can vary so they can be
 * overriden.
 *
 * In this example we will show as an example the packet forwarding done by a router. All the
 * routers read the IP the same way but the NAT mapping and address replacement may vary depending
 * of the router brand. So the abstract class {@link RouterTemplate} will define all the
 * common/non-common operations and they will be triggered by just one public method.
 *
 * That way we can have all the logic of our process centralized in one place and allowing changes
 * to that by subclassing.
 */
public class TemplateProgram {

  public static void main(String[] args) {
    HTTPPacket packet = new HTTPPacket();
    packet.setSrc("192.168.0.101");
    packet.setDst("10.10.5.4");

    RouterTemplate routerTemplate = new CiscoRouter();
    routerTemplate.forwardPacket(packet);
  }
}

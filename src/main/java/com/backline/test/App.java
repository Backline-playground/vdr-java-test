package com.backline.test;

import ch.qos.logback.core.Context;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.jetty.http.HttpURI;
import org.eclipse.jetty.server.Server;

/**
 * Sample application using vulnerable dependencies from VDR report.
 * Used for testing OSV.dev fallback for fix version resolution.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("VDR Java Test Application");

        // Use Apache Commons Lang
        String result = StringUtils.capitalize("hello world");
        System.out.println("Capitalized: " + result);

        // Use Jetty HTTP
        HttpURI uri = HttpURI.from("http://example.com/test");
        System.out.println("URI path: " + uri.getPath());

        // Use Jetty Server (just reference)
        System.out.println("Jetty Server class: " + Server.class.getName());

        System.out.println("Application started successfully!");
    }
}

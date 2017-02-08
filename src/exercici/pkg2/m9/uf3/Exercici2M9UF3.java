
package exercici.pkg2.m9.uf3;

import java.net.MalformedURLException;
import java.net.URL;


public class Exercici2M9UF3 {


    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("www.google.es");
        
        System.out.println("Protocol: " + url.getProtocol());
        
        System.out.println("Autoritat: " + url.getAuthority());
        
        System.out.println("Host: " + url.getHost());
        
        System.out.println("Port: " + url.getPort());
        
        System.out.println("Path: " + url.getPath());
        
        System.out.println("Query: " + url.getQuery());
        
        System.out.println("Filename: " + url.getFile());
        
        System.out.println("Ref: " + url.getRef());
    }
    
}

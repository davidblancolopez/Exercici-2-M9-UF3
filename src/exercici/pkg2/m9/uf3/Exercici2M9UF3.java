package exercici.pkg2.m9.uf3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Exercici2M9UF3 {

    public static void main(String[] args) throws MalformedURLException, IOException {

        URL url = new URL("http:www.google.es");

        System.out.println("Protocol: " + url.getProtocol());

        System.out.println("Autoritat: " + url.getAuthority());

        System.out.println("Host: " + url.getHost());

        System.out.println("Port: " + url.getPort());

        System.out.println("Path: " + url.getPath());

        System.out.println("Query: " + url.getQuery());

        System.out.println("Filename: " + url.getFile());

        System.out.println("Ref: " + url.getRef());

        llegirURL();
    }

    public static void llegirURL() throws IOException {
        try {
            URL url = new URL("http://www.elpais.es");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()) );
            String linea;
            while ((linea = in.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (MalformedURLException mue) {
            System.out.println("URL no válida");
        } catch (IOException ioe) {
            System.out.println("Error en la comunicación");
        }
    }
    
    
    public void comunicacioURL(){
        
    }

}

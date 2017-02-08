package exercici.pkg2.m9.uf3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Exercici2M9UF3 {

    public static void main(String[] args) throws MalformedURLException, IOException {

      /**
       * EXERCICI 1
       */
      
//        URL url = new URL("http:www.google.es");
//
//        System.out.println("Protocol: " + url.getProtocol());
//
//        System.out.println("Autoritat: " + url.getAuthority());
//
//        System.out.println("Host: " + url.getHost());
//
//        System.out.println("Port: " + url.getPort());
//
//        System.out.println("Path: " + url.getPath());
//
//        System.out.println("Query: " + url.getQuery());
//
//        System.out.println("Filename: " + url.getFile());
//
//        System.out.println("Ref: " + url.getRef());
//
//        llegirURL();
//        
//        comunicacioURL();



    /**
    * EXERCICI 2
    */
    
    

    }
    
    
    
    
        /****************************************************************************************************************************
         * ***************************************************************************************************************************
         * ***************************************************************************************************************************
         * ************************************ EXERCICI 1  **************************************************************************
         * ***************************************************************************************************************************
         * ***************************************************************************************************************************
         * ***************************************************************************************************************************
         */

    public static void llegirURL() throws IOException {
        try {
            URL url = new URL("http://www.elpais.es");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
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

    public static void comunicacioURL() throws MalformedURLException {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introdueix la URL: ");
        String url = lector.next();

        try {
            URL url2 = new URL(url);

            URLConnection conexion = url2.openConnection();
            conexion.setDoOutput(true);
            conexion.connect();
            //Lectura i mostra de les capçaleres
            int i = 1;

            while (conexion.getHeaderFieldKey(i) != null) {
                System.out.println(conexion.getHeaderFieldKey(i) + 
                ":" + conexion.getHeaderField(i));
                i++;
            }

            //Lectura i mostra del contingut
            BufferedReader in = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
            String s
                    = in.readLine();
            while (s != null) {
                System.out.println(s);
                s
                        = in.readLine();
            }
        } catch (Exception e) {
            System.out.println("Fallo");
        }
    }

    
    
    /****************************************************************************************************************************
         * ***************************************************************************************************************************
         * ***************************************************************************************************************************
         * ************************************ EXERCICI 2  **************************************************************************
         * ***************************************************************************************************************************
         * ***************************************************************************************************************************
         * ***************************************************************************************************************************
         */
    
    
    
    
    
}

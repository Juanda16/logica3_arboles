package util;

import java.io.*;

import arbol.binario.listaligada.busqueda.avl.ArbolAVL;

import models.Contac;


public class FileTo {

    public static final String SEPARATOR = ";";
    public static final String QUOTE = "\"";
    public static final String COLON_SEPARATOR = ":";
    /**
     * @param filePath
     * @return MatrizEnTripleta
     * @throws IOException
     */

    public static ArbolAVL<Contac> agenda(String filePath) throws IOException {

        BufferedReader br = null;

        try {

            ArbolAVL<Contac> directorio = new ArbolAVL<Contac>();
            
            br = new BufferedReader(new FileReader(filePath));
            String line = br.readLine();

            while (null != line) {

                String[] fields = line.split(COLON_SEPARATOR);

                fields[0]=fields[0].replaceAll(" ","");

                Contac tempContac = new Contac();
                tempContac.setPhoneNumber(Long.parseLong(fields[0]));
                tempContac.setName(fields[1]);
                directorio.insertarDato(tempContac);
;

                line = br.readLine();

            }

            return directorio;
        } catch (Exception e) {
            System.out.println(e);
            return null;

        } finally {
            if (null != br) {
                br.close();
            }
        }

    }

    
}
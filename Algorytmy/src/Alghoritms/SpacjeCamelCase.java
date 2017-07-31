package Alghoritms;

import javax.xml.bind.SchemaOutputResolver;

public class SpacjeCamelCase extends AbstractAlgorithm {
    @Override
    public String getName() {
        return " Spacje Camel Case";
    }

    @Override
    public void runAlgorithm(String[] input) {

        String tablica[]= new String[input.length-1];

        for (int i = 1; i <input.length; i++) {
            tablica[i-1]=input[i];
        }

        String tablica2[] = new String [input.length-1];


        for (int i = tablica.length-1; i >= 0; i--) {
            System.out.println(tablica[i].toUpperCase());
        }

        }
    }


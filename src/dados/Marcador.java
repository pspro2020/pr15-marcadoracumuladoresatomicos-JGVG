package dados;

import java.util.concurrent.atomic.AtomicInteger;

public class Marcador {
    int n_uno = 0;
    int n_dos = 0;
    int n_tres = 0;
    int n_cuatro = 0;
    int n_cinco = 0;
    int n_seis = 0;

    @Override
    public String toString() {
        int result = n_uno+n_dos+n_tres+n_cuatro+n_cinco+n_seis;
        return "Número 1: " + n_uno + " veces" + "\n" +
                "Número 2: " + n_dos + " veces" + "\n" +
                "Número 3: " + n_tres + " veces" + "\n" +
                "Número 4: " + n_cuatro + " veces" + "\n" +
                "Número 5: " + n_cinco + " veces" + "\n" +
                "Número 6: " + n_seis + " veces" + "\n"+
                "Total de veces: "+n_uno+" + "+n_dos+" + "+n_tres+" + "+n_cuatro+" + "+n_cinco+" + "+n_seis+" = "+result;
    }
}

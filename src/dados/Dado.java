package dados;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;

public class Dado implements Runnable {
    Marcador marcador;
    public Dado(Marcador marcador) {
        this.marcador = marcador;
    }

    @Override
    public void run() {
        try {
            VarHandle varHandle1;
            VarHandle varHandle2;
            VarHandle varHandle3;
            VarHandle varHandle4;
            VarHandle varHandle5;
            VarHandle varHandle6;
            varHandle1 = MethodHandles.lookup().in(Marcador.class).findVarHandle(Marcador.class, "n_uno", int.class);
            varHandle2 = MethodHandles.lookup().in(Marcador.class).findVarHandle(Marcador.class, "n_dos", int.class);
            varHandle3 = MethodHandles.lookup().in(Marcador.class).findVarHandle(Marcador.class, "n_tres", int.class);
            varHandle4 = MethodHandles.lookup().in(Marcador.class).findVarHandle(Marcador.class, "n_cuatro", int.class);
            varHandle5 = MethodHandles.lookup().in(Marcador.class).findVarHandle(Marcador.class, "n_cinco", int.class);
            varHandle6 = MethodHandles.lookup().in(Marcador.class).findVarHandle(Marcador.class, "n_seis", int.class);

            for(int i=0; i<10000; i++){
                int valor_tirada = (int) (Math.random()*(1-7)+7);
                switch (valor_tirada) {
                    case 1 -> varHandle1.getAndAdd(marcador, 1);
                    case 2 -> varHandle2.getAndAdd(marcador, 1);
                    case 3 -> varHandle3.getAndAdd(marcador, 1);
                    case 4 -> varHandle4.getAndAdd(marcador, 1);
                    case 5 -> varHandle5.getAndAdd(marcador, 1);
                    case 6 -> varHandle6.getAndAdd(marcador, 1);
                }

            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}

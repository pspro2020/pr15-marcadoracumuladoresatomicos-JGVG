package dados;

public class Main {
    public static void main(String[] args) {
        Marcador marcador = new Marcador();
        Thread[] threads = new Thread[3];

        for(int i=0; i<3; i++){
            threads[i] = new Thread(new Dado(marcador));
            threads[i].start();
        }

    for(Thread thread: threads){
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
        System.out.println(marcador.toString());

    }
}

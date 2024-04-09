import java.util.LinkedList;
import java.util.Queue;

public class FilaRefeitorio {
    private Queue<Pessoa> fila;

    public FilaRefeitorio() {
        this.fila = new LinkedList<>();
    }

    public void entrarNaFila(Pessoa pessoa) {
        fila.add(pessoa);
    }

    public Pessoa sairDaFila() {
        if (!fila.isEmpty()) {
            return fila.poll();
        } else {
            System.out.println("A fila já está vazia.");
            return null;
        }
    }

    public void mostrarFila() {
        if (fila.isEmpty()) {
            System.out.println("A fila está vazia.");
        } else {
            for (Pessoa pessoa : fila) {
                System.out.println(pessoa);
            }
        }
    }
}

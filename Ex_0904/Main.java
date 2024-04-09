public class Main {
    public static void main(String[] args) {
        FilaRefeitorio fila = new FilaRefeitorio();

        Aluno aluno1 = new Aluno("João Silva", "123456", "Engenharia Civil");
        Professor professor1 = new Professor("Maria Oliveira", "7891011", "Doutora");
        TecnicoAdministrativo tecnico1 = new TecnicoAdministrativo("Carlos Pereira", "121314");

        fila.entrarNaFila(aluno1);
        fila.entrarNaFila(professor1);
        fila.entrarNaFila(tecnico1);

        System.out.println("Fila atual:");
        fila.mostrarFila();

        System.out.println("\nApós remover 1 pessoa da fila:");
        fila.sairDaFila();
        fila.mostrarFila();
    }
}

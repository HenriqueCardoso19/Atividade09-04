public class TecnicoAdministrativo extends Pessoa {
    private String numeroSiape;

    public TecnicoAdministrativo(String nome, String numeroSiape) {
        super(nome);
        this.numeroSiape = numeroSiape;
    }

    @Override
    public String toString() {
        return "Técnico Administrativo: " + nome + ", SIAPE: " + numeroSiape;
    }
}

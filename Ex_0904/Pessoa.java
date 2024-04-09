public abstract class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public abstract String toString();
}

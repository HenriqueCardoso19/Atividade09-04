public class Aluno extends Pessoa {
    private String numeroMatricula;
    private String curso;

    public Aluno(String nome, String numeroMatricula, String curso) {
        super(nome);
        this.numeroMatricula = numeroMatricula;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + ", Matrícula: " + numeroMatricula + ", Curso: " + curso;
    }
}

package classes;

public abstract class Pessoa {

    protected String nome;
    protected int idade;
    protected String dataNascimento;
    protected int RegistroGeral;
    protected int numeroCpf;
    protected String nomePai;
    protected String nomeMae;

/* metodo abstrato é o que fica na classse pai é obrigatorio para as classse filhas*/
    public abstract double salario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getRegistroGeral() {
        return RegistroGeral;
    }

    public void setRegistroGeral(int registroGeral) {
        RegistroGeral = registroGeral;
    }

    public int getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(int numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }



    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", RegistroGeral=" + RegistroGeral +
                ", numeroCpf=" + numeroCpf +
                ", nomePai='" + nomePai + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                '}';
    }
}

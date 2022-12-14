package classes;

import interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {

    private String registro;
    private String nivelCargo;
    private String experiencia;

    private String login;
    private String senha;

    public Secretario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Secretario() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getNivelCargo() {
        return nivelCargo;
    }

    public void setNivelCargo(String nivelCargo) {
        this.nivelCargo = nivelCargo;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public double salario() {
        return 0;
    }

    @Override
    public String toString() {
        return "Secretario{" +
                "registro='" + registro + '\'' +
                ", nivelCargo='" + nivelCargo + '\'' +
                ", experiencia='" + experiencia + '\'' +
                ", usuario='" + login + '\'' +
                ", senha='" + senha + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", RegistroGeral=" + RegistroGeral +
                ", numeroCpf=" + numeroCpf +
                ", nomePai='" + nomePai + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                '}';
    }

    /*metodo do contrato de autenticacao*/

    @Override
    public boolean autenticar() {
        return login.equals("admin") && senha.equals("admin");
    }

}

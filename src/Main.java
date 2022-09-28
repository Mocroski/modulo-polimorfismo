import classes.Secretario;
import classesauxiliares.FuncaoAutenticacao;
import interfaces.PermitirAcesso;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String login = JOptionPane.showInputDialog("informe o usuario");
        String senha = JOptionPane.showInputDialog("informe a senha");

        PermitirAcesso permitirAcesso = new Secretario(login, senha);

        if (new FuncaoAutenticacao(permitirAcesso).autenticar()) {  /*travar o contrato para autorizar somente quem realmente tem o contrato 100% legitimo*/

            JOptionPane.showMessageDialog(null, "bem vindo");
        } else {
            JOptionPane.showMessageDialog(null, "acesso nao permitido");
        }
    }
}

package classesauxiliares;

import interfaces.PermitirAcesso;

/*realmente e somente receber alguem que tenha o contrato da interface de permiracesso e chaamr o autenticar*/
public class FuncaoAutenticacao {

    private PermitirAcesso permitirAcesso;

    public boolean autenticar() {
        return permitirAcesso.autenticar(/*estava dando erro entao eu retirei os parametros String do permitir acesso*/);
    }

    public FuncaoAutenticacao(PermitirAcesso acesso) {
        this.permitirAcesso = acesso;

    }
}

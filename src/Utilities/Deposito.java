package Utilities;

import javax.swing.*;
import java.util.Date;

public class Deposito extends Pagamento {
    private String idDeposito = "";

    public Deposito(int valor_pag, String banco_pag, String agencia_pag, String conta_pag, String idDeposito, String data_pag, String forma_pag, int parcelas_pag) {
        super(valor_pag, banco_pag, agencia_pag, conta_pag, String.valueOf(data_pag), forma_pag, parcelas_pag);
        this.idDeposito = idDeposito;
    }

    public void exibirDadosDeposito(){
        JOptionPane.showMessageDialog(null,"Codigo do Deposito: " + this.getIdDeposito() +"\n" +
                                                                    "Banco: "   + this.getBanco_pag()          + "\n" +
                                                                    "Conta: "   + this.getConta_pag()          + "\n" +
                                                                    "Agencia: " + this.getAgencia_pag()        + "\n" +
                                                                    "Valor do Deposito: " + this.getValor_pag() + "\n"+
                                                                    "Depositado em: " + this.getData_pag());
    }
    public String getIdDeposito() {
        return idDeposito;
    }

    public void setIdDeposito(String idDeposito) {
        this.idDeposito = idDeposito;
    }
}

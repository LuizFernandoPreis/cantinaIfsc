package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utilities.Utilities;
import view.TBuscaBairro;
import view.TBuscaCliente;
import view.TCadastroBairro;
import view.TCadastroCliente;

public class ControllerCadastroCliente implements ActionListener {

    //Criando um objeto Global do tipo da tela que iremos controllar
    TCadastroCliente telaCadastroCliente;

    //Passando a tela que iremos controlar como parametro de invoca��o
    public ControllerCadastroCliente(TCadastroCliente telaCadastroCliente) {
        //Repassando o valor(tela) do par�metro para o objeto global
        this.telaCadastroCliente = telaCadastroCliente;

        //Adicionando ouvintes(Listeners) para escutar a��es nos bot�es da tela
        this.telaCadastroCliente.getjBNovo().addActionListener(this);
        this.telaCadastroCliente.getjBSair().addActionListener(this);
        this.telaCadastroCliente.getjBCancelar().addActionListener(this);
        this.telaCadastroCliente.getjBGravar().addActionListener(this);
        this.telaCadastroCliente.getjBBuscar().addActionListener(this);

        //Executando os m�todos da classe de utilit�rios
        //para ativar/desativar/limpar bot�es e componentes diversos na tela
        utilities.Utilities.ativaDesativa(true, this.telaCadastroCliente.getjPanBotoes());
        Utilities.limpaComponentes(false, this.telaCadastroCliente.getjPanDados());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroCliente.getjBNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroCliente.getjPanBotoes());
            Utilities.limpaComponentes(true, this.telaCadastroCliente.getjPanDados());

        } else if (e.getSource() == this.telaCadastroCliente.getjBCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCliente.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroCliente.getjPanDados());

        } else if (e.getSource() == this.telaCadastroCliente.getjBGravar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCliente.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroCliente.getjPanDados());

        } else if (e.getSource() == this.telaCadastroCliente.getjBBuscar()) {
            TBuscaCliente telaBuscaCliente = new TBuscaCliente(null, true);
            //Inserir o controller da busca d bairros
            telaBuscaCliente.setVisible(true);
            

        } else if (e.getSource() == this.telaCadastroCliente.getjBSair()) {
            this.telaCadastroCliente.dispose();

        }
    }

}

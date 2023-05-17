package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utilities.Utilities;
import view.TBuscaCliente;
import view.TBuscaFuncionario;
import view.TCadastroCliente;
import view.TCadastroFuncionario;

public class ControllerCadastroFuncionario implements ActionListener {

    //Criando um objeto Global do tipo da tela que iremos controllar
    TCadastroFuncionario telaCadastroFuncionario;

    //Passando a tela que iremos controlar como parametro de invoca��o
    public ControllerCadastroFuncionario(TCadastroFuncionario telaCadastroFuncionario) {
        //Repassando o valor(tela) do par�metro para o objeto global
        this.telaCadastroFuncionario = telaCadastroFuncionario;

        //Adicionando ouvintes(Listeners) para escutar a��es nos bot�es da tela
        this.telaCadastroFuncionario.getjBNovo().addActionListener(this);
        this.telaCadastroFuncionario.getjBSair().addActionListener(this);
        this.telaCadastroFuncionario.getjBCancelar().addActionListener(this);
        this.telaCadastroFuncionario.getjBGravar().addActionListener(this);
        this.telaCadastroFuncionario.getjBBuscar().addActionListener(this);

        //Executando os m�todos da classe de utilit�rios
        //para ativar/desativar/limpar bot�es e componentes diversos na tela
        utilities.Utilities.ativaDesativa(true, this.telaCadastroFuncionario.getjPanBotoes());
        Utilities.limpaComponentes(false, this.telaCadastroFuncionario.getjPanDados());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroFuncionario.getjBNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroFuncionario.getjPanBotoes());
            Utilities.limpaComponentes(true, this.telaCadastroFuncionario.getjPanDados());

        } else if (e.getSource() == this.telaCadastroFuncionario.getjBCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroFuncionario.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroFuncionario.getjPanDados());

        } else if (e.getSource() == this.telaCadastroFuncionario.getjBGravar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroFuncionario.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroFuncionario.getjPanDados());

        } else if (e.getSource() == this.telaCadastroFuncionario.getjBBuscar()) {
            TBuscaFuncionario telaBuscaFuncionario = new TBuscaFuncionario(null, true);
            //Inserir o controller da busca d bairros
            telaBuscaFuncionario.setVisible(true);
            

        } else if (e.getSource() == this.telaCadastroFuncionario.getjBSair()) {
            this.telaCadastroFuncionario.dispose();

        }
    }

}

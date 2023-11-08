package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;
import model.Carteirinha;
import service.CarteirinhaService;
import view.TBuscaCarteirinha;

public class ControllerBuscaCarteirinha implements ActionListener {

    TBuscaCarteirinha telaBuscaCarteirinha;

    public ControllerBuscaCarteirinha(TBuscaCarteirinha telaBuscaCarteirinha) {

        this.telaBuscaCarteirinha = telaBuscaCarteirinha;
        this.telaBuscaCarteirinha.getjButtonCarregar().addActionListener(this);
        this.telaBuscaCarteirinha.getjButtonFiltrar().addActionListener(this);
        this.telaBuscaCarteirinha.getjButtonSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaCarteirinha.getjButtonCarregar()) {
            controller.ControllerCadastroCarteirinha.codigo = (int) this.telaBuscaCarteirinha.getjTableDados()
                    .getValueAt(this.telaBuscaCarteirinha.getjTableDados().getSelectedRow(), 0);
            this.telaBuscaCarteirinha.dispose();

            return;
        }

        if (e.getSource() == this.telaBuscaCarteirinha.getjButtonFiltrar()) {
            List<Carteirinha> listaCarteirinha = new ArrayList<Carteirinha>();
            listaCarteirinha = CarteirinhaService.carregar();

            // Criar um objeto do tipo TableModel
            DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaCarteirinha.getjTableDados().getModel();

            tabela.setRowCount(0);

            for (Carteirinha carteirinhaAtual : listaCarteirinha) {
                tabela.addRow(new Object[] {
                        carteirinhaAtual.getId(),
                        carteirinhaAtual.getDataGeracao(),
                        carteirinhaAtual.getIdcliente(),
                        carteirinhaAtual.getDataCancelamento(),
                        carteirinhaAtual.getCodBarra(), });
            }

            return;
        }

        this.telaBuscaCarteirinha.dispose();
    }
}

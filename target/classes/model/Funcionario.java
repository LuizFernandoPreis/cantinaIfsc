/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Funcionario extends Pessoa {

    @Column(name = "cpf", length = 14, nullable = false)
    private String cpf;

    @Column(name = "rg", length = 12, nullable = false)
    private String rg;

    @Column(name = "usuario", length = 50, nullable = false)
    private String usuario;

    @Column(name = "senha", length = 50, nullable = false)
    private String senha;

    public Funcionario() {

    }

    public Funcionario(String cpf, String rg, String usuario, String senha, int id, String nome, String fone1, String fone2, String email, char status, String complementoEndereco, Endereco endereco) {
        super(id, nome, fone1, fone2, email, status, complementoEndereco, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "cpf=" + cpf + ", rg=" + rg + ", usuario=" + usuario + ", senha=" + senha + '}';
    }
    
    
}

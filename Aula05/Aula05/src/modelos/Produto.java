/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author alunofavip
 */
public class Produto {
    
    private int codigo;
    private String nome;
    private String descricao;
    private double precoCusto;
    private double precoVenda;
    
    private static int codigoAtual;

    public Produto(String nome, 
            String descricao, 
            double precoCusto, 
            double precoVenda) {
        
        this.codigo = ++codigoAtual;
        this.nome = nome;
        this.descricao = descricao;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    @Override
    public String toString() {
        StringBuilder relatorio = new StringBuilder();
        
        relatorio.append("codigo="+codigo);
        relatorio.append(",nome="+nome);
        relatorio.append(",descricao="+descricao);
        relatorio.append(",preco custo="+precoCusto);
        relatorio.append(",preco venda="+precoVenda);
        
        
        return relatorio.toString();
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
    
    
    
    
}

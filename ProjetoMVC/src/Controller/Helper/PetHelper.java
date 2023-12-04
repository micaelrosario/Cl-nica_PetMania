/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.DAO.ClienteDAO;
import Model.Dono;
import Model.Pet;
import View.AdicionarPet;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
        
public class PetHelper implements Serializable{
    private final AdicionarPet view;
    

    public PetHelper(AdicionarPet view) {
        this.view = view;
    }
    
    public Pet obterModelo() {
        String nome = view.getTf_nome().getText();
        String raca = view.getTf_raca().getText();
        String idade = view.getTf_idade().getText();

        // Obtém o Dono selecionado no JComboBox
        Dono donoSelecionado = (Dono) view.getCb_Dono().getSelectedItem();
        
        // Verificar se algum campo obrigatório está vazio ou nulo
        if (nome.isEmpty() || raca.isEmpty() || idade.isEmpty() || donoSelecionado == null) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos obrigatórios.");
            return null;  // Retorna null se há campos não preenchidos
        }
        
        // Cria e retorna um objeto Pet com os dados fornecidos
        return new Pet(nome, raca, idade, donoSelecionado);
    }

    
    public void setarModelo(Pet modelo){
        String nome = modelo.getNome();
        String raca = modelo.getRaca();
        String idade = modelo.getIdade();
        
        view.getTf_nome().setText(nome);
        view.getTf_raca().setText(raca);
        view.getTf_idade().setText(idade);
    }
    
    public void  limparTela(){
        view.getTf_nome().setText("");
        view.getTf_raca().setText("");
        view.getTf_idade().setText("");
    }

    public void preencherDonos() {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getCb_Dono().getModel();

        ClienteDAO clienteDAO = new ClienteDAO();
      
        clienteDAO.carregarClientes();
        ArrayList<Dono> donos = clienteDAO.obterClientes();

        // Limpar o combobox antes de adicionar os novos elementos
        comboBoxModel.removeAllElements();

        for (Dono dono : donos) {
            comboBoxModel.addElement(dono);
        }
    }

}

package br.com.cdb.bancodigital.service;

import br.com.cdb.bancodigital.dao.ClienteDAO;
import br.com.cdb.bancodigital.entity.Cliente;

//Adicionar regras de negócio, como validações, antes de salvar ou buscar clientes.
public class ClienteService {
    ClienteDAO clienteDAO = new ClienteDAO();

    // Método para adicionar um cliente com validações
    /**
     * Adiciona um cliente ao sistema após validar os dados.
     *
     * @param nome Nome do cliente.
     * @param cpf  CPF do cliente.
     * @return true se o cliente foi adicionado com sucesso, false caso contrário.
     */
    // É um construtor que recebe o nome e o cpf do cliente, valida os dados e adiciona o cliente ao banco de dados.
    public Cliente addCliente(String nome, String cpf) {
        if (!validarNome(nome) || !validarCPF(cpf)) {
            return null;
        }

        Cliente cliente = new Cliente(nome, cpf);
        clienteDAO.addCliente(cliente); // Gera o ID internamente
        return cliente;
    }


    private boolean validarCPF(String cpf) {
        return cpf != null && cpf.matches("\\d{11}"); // Exemplo de validação simples
    }

    private boolean validarNome(String nome) {
        return nome != null && !nome.trim().isEmpty() && nome.length() <= 50; // Exemplo de validação simples
    }
}

package br.com.cdb.bancodigital.service;

import br.com.cdb.bancodigital.dao.ClienteDAO;
import br.com.cdb.bancodigital.entity.Cliente;

//Adicionar regras de negócio, como validações, antes de salvar ou buscar clientes.
public class ClienteService {
    ClienteDAO clienteDAO;

    public boolean addCliente(String nome, String cpf) {
        if (!validarCPF(cpf)) {
            return false; // CPF inválido
        }
        if (!validarNome(nome)) {
            return false; // Nome inválido
        }
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setCpf(cpf);

        clienteDAO.addCliente(cliente);
        return false;
    }

    private boolean validarCPF(String cpf) {
        return cpf != null && cpf.matches("\\d{11}"); // Exemplo de validação simples
    }

    private boolean validarNome(String nome) {
        return nome != null && !nome.trim().isEmpty() && nome.length() <= 50; // Exemplo de validação simples
    }
}

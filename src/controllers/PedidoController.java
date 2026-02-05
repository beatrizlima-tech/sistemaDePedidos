package controllers;

import entities.Cliente;
import entities.Pedido;
import entities.Produto;
import enums.StatusPedido;
import interfaces.PedidoRepository;
import repositories.PedidoRepositoryTXT;
import repositories.PedidoRepositoryXML;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class PedidoController {

    private static int contadorPedido = 1;
    private static int contadorProduto = 1;

    // Método para realizar a exportação dos dados
    public void gerarPedido(){

        try{

            var pedido = new Pedido();

        pedido.setId(contadorPedido++);

        pedido.setData(LocalDate.now());
        pedido.setStatus(StatusPedido.ABERTO);

        var cliente = new Cliente();


        // Associando o cliente ao pedido
        pedido.setCliente(cliente);

        // Lista de produtos
            pedido.setProdutos(new ArrayList<Produto>());

        // Quantidade de produtos
        int qtdProdutos = Integer.parseInt((
            JOptionPane.showInputDialog("Quantos produtos deseja cadastrar?")
                ));

        for(int i=0; i< qtdProdutos; i++){

            var produto = new Produto();

            produto.setId(contadorProduto++);

            produto.setNome(
                    JOptionPane.showInputDialog("Nome do produto:")
                    );

            produto.setPreco(Double.parseDouble(
                    JOptionPane.showInputDialog("Preço do produto:")
            ));

            pedido.getProdutos().add(produto);

        }

        // POLIMORFISMO
            PedidoRepository repository;

        var opcao  = JOptionPane.showInputDialog(
                "Informe (1) TXT ou (2) XML:"
        );

       switch (opcao){

           case "1":
               repository = new PedidoRepositoryTXT();
               break;

           case "2":
               repository = new PedidoRepositoryXML();
               break;

           default:
               System.out.println("\nOPÇÃO INVÁLIDA");
               return;
       }

    // Exportar os dados
            repository.exportar(pedido);
            System.out.println("\nPEDIDO CADASTRADO COM SUCESSO!");

        }
        catch (Exception e){
            System.out.println("\nFALHA AO REALIZAR PEDIDO: " + e.getMessage());
        }

    }

}

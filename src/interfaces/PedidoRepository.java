package interfaces;

import entities.Pedido;

public interface PedidoRepository {

    void exportar(Pedido pedido) throws Exception;



}

package examen1.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

public class ListaPedidos {
    private List<Pedido> pedidos = new ArrayList<>();

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void actualizarPedido(int indice, Pedido pedido) {
        if (indice >= 0 && indice < pedidos.size()) {
            pedidos.set(indice, pedido);
        }
    }

    public void eliminarPedido(int indice) {
        if (indice >= 0 && indice < pedidos.size()) {
            pedidos.remove(indice);
        }
    }
}


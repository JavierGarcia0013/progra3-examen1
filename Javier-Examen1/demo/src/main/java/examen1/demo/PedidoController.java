package examen1.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    private ListaPedidos listaPedidos;

    @Autowired
    public PedidoController(ListaPedidos listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    @PostMapping
    public void agregarPedido(@RequestBody Pedido pedido) {
        listaPedidos.agregarPedido(pedido);
        System.out.println("Pedido agregado: " + pedido.getDescripcion());
    }

    @PutMapping("/{indice}")
    public void actualizarPedido(@PathVariable int indice, @RequestBody Pedido pedido) {
        listaPedidos.actualizarPedido(indice, pedido);
        System.out.println("Pedido actualizado: " + pedido.getDescripcion());
    }

    @DeleteMapping("/{indice}")
    public void eliminarPedido(@PathVariable int indice) {
        Pedido pedido = listaPedidos.getPedidos().get(indice);
        listaPedidos.eliminarPedido(indice);
        System.out.println("Pedido eliminado: " + pedido.getDescripcion());
    }

    @GetMapping
    public List<Pedido> listarPedidos() {
        List<Pedido> pedidos = listaPedidos.getPedidos();
        for (Pedido pedido : pedidos) {
            System.out.println("Pedido: " + pedido.getDescripcion());
        }
        return pedidos;
    }
}

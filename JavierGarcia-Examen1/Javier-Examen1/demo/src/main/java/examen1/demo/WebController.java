package examen1.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    private ListaPedidos listaPedidos;

    public WebController(ListaPedidos listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    @GetMapping("/pedidos/lista")
    public String mostrarListaPedidos(Model model) {
        model.addAttribute("pedidos", listaPedidos.getPedidos());
        return "lista_pedidos"; // Nombre de tu archivo HTML
    }
}




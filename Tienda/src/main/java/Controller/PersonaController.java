package Controller;

import entity.Pais;
import entity.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import service.IPaisService;
import service.IPersonaService;

public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    @Autowired
    private IPaisService paisService;

    //Model 
    @GetMapping("/persona")
    public String index(Model model) {
        List<Persona> listaPerona = personaService.getAllPersona();
        model.addAttribute("Titulo", "Tabla Persona");
        model.addAttribute("persona", listaPerona);
        return "personas";
    }

    @GetMapping("/personaN")
    public String CrearPersona(Model model) {
        List<Pais> listaPaises = paisService.listCountry();
        model.addAttribute("persona", new Persona());
        model.addAttribute("paises", listaPaises);
        return "crear";
    }
}

package cl.amisoft.causaapp.controller;

import cl.amisoft.causaapp.service.CausaService;
import cl.amisoft.causaapp.vo.CausaVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("causa")
public class CausaController {

    private final CausaService causaService;

    @Autowired
    public CausaController(CausaService causaService){
        this.causaService = causaService;
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public CausaVo obtenerTodosPorCausa(@PathVariable(name = "id") Long id){
        return causaService.obtener(id);
    }
}

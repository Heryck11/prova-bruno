package com.example.demo.resource;

import com.example.demo.dto.ItensPedidosDTO;
import com.example.demo.interfaces.IResource;
import com.example.demo.service.ItensPedidosService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping
@RestController (value = "/api/vi/ItensPedido")
public class ItensPedidosResource implements IResource <ItensPedidosDTO, Integer> {

    @Autowired
    private ItensPedidosService itensPedidosService;

    /**
     * Este metodo cria um itens pedido
     * @param entity
     * @return
     */
    @Override
    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )

    public ItensPedidosDTO creat(@RequestBody ItensPedidosDTO entity) {
        log.info("ItensPedidosResource::creat");
        return null;
    }

    /**
     * Este metodo visuliza itens pedido
     * @param id
     * @return
     */
    @Override
    @GetMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ItensPedidosDTO get(Integer id) {
        log.info("ItensPedidosResource::get(id)");
        return null;
    }

    /**
     * Este metodo lista itens pedido
     * @return
     */
    @Override
    @GetMapping ( produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<ItensPedidosDTO> get() {
        log.info("PedidoResource::get()");
        return List.of();
    }

    /**
     * Este metodo altera itens pedido
     * @param id
     * @param entity
     * @return
     */
    @Override
    @PutMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ItensPedidosDTO updat(@PathVariable Integer id,
                             @RequestBody ItensPedidosDTO entity) {
        log.info("PedidoResource::updat(id, entity");
        return null;
    }

    /**
     * Este metodo deleta itens pedido
     * @param id
     */
    @Override
    @DeleteMapping (value = "/{id}")
    public void delete(Integer id) {
        log.info("PedidoResource::delete(id)");
    }
}

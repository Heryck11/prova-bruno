package com.example.demo.resource;

import com.example.demo.dto.PedidoDTO;
import com.example.demo.dto.interfaces.IResource;
import com.example.demo.dto.service.PedidoService;
import com.example.demo.service.PedidoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping (value = "/api/v1/Pedido")
public class PedidoResource implements IResource <PedidoDTO, Integer> {

    @Autowired
    PedidoService pedidoService;

    /**
     * Este metodo cria um pedido
     * @param entity
     * @return
     */
    @Override
    @PostMapping (
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )

    public PedidoDTO creat(@RequestBody PedidoDTO entity) {
        log.info("PedidoResource::creat");
        return null;
    }

    /**
     * Este metodo visualiza o pedido
     * @param id
     * @return
     */
    @Override
    @GetMapping (
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public PedidoDTO get(Integer id) {
        log.info("PedidoResource::get(id)");
        return null;
    }

    /**
     * Este metodo lista um produto
     * @return
     */
    @Override
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<PedidoDTO> get() {
        log.info("PedidoResource::get()");
        return List.of();
    }

    /**
     * Este metodo altera um pedido
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
    public PedidoDTO updat(@PathVariable Integer id,
                        @RequestBody PedidoDTO entity) {
        log.info("PedidoResource::updat(id, entity");
        return null;
    }

    /**
     * Este metodo deleta um pedido
     * @param id
     */
    @Override
    @DeleteMapping (value = "/{id}")
    public void delete(@PathVariable Integer id) {
        log.info("PedidoResource::delete(id)");

    }
}

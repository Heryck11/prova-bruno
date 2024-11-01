package com.example.demo.service;

import com.example.demo.dto.PedidoDTO;
import com.example.demo.interfaces.IService;
import com.example.demo.repository.PedidoRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class PedidoService implements IService<PedidoDTO, Integer>{

    private static final Logger log = LoggerFactory.getLogger(PedidoService.class);
    @Autowired
    private PedidoRepository pedidoRepository;

    /**
     * Este metodo cria um pedido
     * @param entity
     * @return
     */

    @Override
    public PedidoDTO create(PedidoDTO entity) {
        log.info("PedidoService::create");
        return null;
    }

    /**
     * Este metodo visualiza o pedido
     * @param id
     * @return
     */

    @Override
    public PedidoDTO read(Integer id) {
        log.info("PedidoService::read(id)");
        return null;
    }

    /**
     * Este metodo lista um produto
     *
     * @return
     */

    @Override
    public List<PedidoDTO> read() {
        log.info("PedidoService::read()");
        return List.of();
    }

    /**
     * Este metodo altera um pedido
     * @param id
     * @param entity
     * @return
     */
    @Override
    public PedidoDTO update(Integer id, PedidoDTO entity) {
        log.info("PedidoService::update(id, entity");
        return null;
    }

    /**
     * Este metodo deleta um pedido
     * @param id
     */
    @Override
    public void delete(Integer id) {
        log.info("PedidoService::(Delete(id)");

    }
}

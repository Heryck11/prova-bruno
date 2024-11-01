package com.example.demo.service;

import com.example.demo.dto.ItensPedidosDTO;
import com.example.demo.interfaces.IService;
import com.example.demo.repository.ItensRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ItensPedidosService implements IService<ItensPedidosDTO, Integer>{

    final ItensRepository ItensRepository;

    public ItensPedidosService(ItensRepository ItensRepository) {
        this.ItensRepository = this.ItensRepository;
    }

    /**
     * Esse metodo é para cadastrar os itens pedido
     *
     * @param entity
     * @return
     */

    @Override
    public ItensPedidosDTO create(ItensPedidosDTO entity) {
        log.info("ItensPedidosService::create");
        return null;
    }

    /**
     * Esse metodo exibe somente uma lista de items
     * @param id
     * @return
     */
    @Override
    public ItensPedidosDTO read(Integer id) {
        log.info("ItensPedidosService::read(id)");
        return null;
    }

    @Override
    public T creat(T entity) {
        return null;
    }

    @Override
    public T read(N id) {
        return null;
    }

    /**
     * Esse metodo exibe todas os itenspedidos
     * @return
     */
    @Override
    public List<ItensPedidosDTO> read() {
        log.info("ItensPedidosService::read()");
        return List.of();
    }

    @Override
    public T update(N id, T entity) {
        return null;
    }

    @Override
    public void delete(N id) {

    }

    /**
     * Esse metodo atualiza a lista
     * @param id
     * @param entity
     * @return
     */
    @Override
    public ItensPedidosDTO update(Integer id, ItensPedidosDTO entity) {
        log.info("ItensPedido::update(id,entity");
        return null;
    }

    /**
     * Esse metodo deleta um itenspedido
     * @param id
     */
    @Override
    public void delete(Integer id) {
        log.info("ItensPedido::delete(id)");

    }
}

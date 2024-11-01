package com.example.demo.service;

import com.example.demo.dto.ProdutosDTO;
import com.example.demo.interfaces.IService;
import com.example.demo.repository.ProdutoRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ProdutoService implements IService<ProdutosDTO, Integer>{

    private static final Logger log = LoggerFactory.getLogger(ProdutoService.class);
    @Autowired
    private ProdutoRepository produtoRepository;

    /**
     * Este metodo cria um produto
     * @param entity
     * @return
     */

    @Override
    public ProdutosDTO craete(ProdutosDTO entity) {
        log.info("ProdutoService::create");
        return null;
    }

    /**
     * Este metodo visualiza o produto
     * @param id
     * @return
     */

    @Override
    public ProdutosDTO read(Integer id) {
        log.info("ProdutoService::read(id)");
        return null;
    }

    /**
     * Este metodo altera um produto
     * @param id
     * @param entity
     * @return
     */

    @Override
    public ProdutosDTO update(Integer id, ProdutosDTO entity) {
        log.info("ProdutoService::update(id, entity)");
        return null;
    }

    /**
     * Este metodo deleta um produto
     * @param id
     * @return
     */
    @Override
    public void delete(Integer id) {
        log.info("ProdutoService::Delete(id)");
    }
}

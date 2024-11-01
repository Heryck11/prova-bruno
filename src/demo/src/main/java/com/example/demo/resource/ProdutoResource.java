package com.example.demo.resource;

import com.example.demo.dto.ProdutosDTO;
import com.example.demo.interfaces.IResource;
import com.example.demo.service.ProdutoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/produto")
public class ProdutoResource implements IResource <ProdutosDTO, Integer> {


    final ProdutoService produtoService;

    public ProdutoResource( ProdutoService produtoService){
        this.produtoService = produtoService;
    }

    /**
     * Este metodo cria um produto
     * @param entity
     * @return
     */
    @Override
    @PostMapping (
            consumes ={MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ProdutosDTO creat(@RequestBody ProdutosDTO entity) {
        log.info("ProdutoResource::creat");
        return null;
    }

    /**
     * Este metodo visualiza o produto
     * @param id
     * @return
     */
    @Override
    @GetMapping (
            value ="/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ProdutosDTO get(@PathVariable Integer id) {
        log.info("ProdutoResource::get(id)");
        return null;
    }

    /**
     * Este metodo lista um produto
     * @return
     */
    @Override
    @GetMapping (produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<ProdutosDTO> get() {
        log.info("ProdutoResource::get()");
        return List.of();
    }

    /**
     * Este metodo altera um produto
     * @param id
     * @param entity
     * @return
     */
    @Override
    @PutMapping (
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ProdutosDTO updat(@PathVariable Integer id,
                         @RequestBody ProdutosDTO entity) {
        log.info("ProdutoResource::update(id, entity)");
        return null;
    }

    /**
     * Este metodo deleta um produto
     * @param id
     */
    @Override
    @DeleteMapping (value = "/{id}")
    public void delete(@PathVariable Integer id) {
        log.info("ProdutoResource::delete(id)");

    }
}
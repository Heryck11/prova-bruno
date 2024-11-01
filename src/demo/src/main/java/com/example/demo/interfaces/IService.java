package com.example.demo.interfaces;

import com.example.demo.dto.ItensPedidosDTO;

import java.util.List;

/**
 *
 * @param <T> - Dto
 * @param <N> - Integer
 */

public interface IService<I, I1 extends Number> {

    ItensPedidosDTO create(ItensPedidosDTO entity);

    ItensPedidosDTO read(Integer id);

    public T creat(T entity);

    public T read(N id);

    public List<T> read();

    public T update(N id, T entity);

    public void delete(N id);
}

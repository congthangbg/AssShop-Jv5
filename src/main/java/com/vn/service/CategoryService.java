package com.vn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.vn.domain.Category;

public interface CategoryService {

	Category getById(Integer id);

	void deleteAll();

	void deleteAll(Iterable<? extends Category> entities);

	void deleteAllInBatch();

	void deleteAllById(Iterable<? extends Integer> ids);

	void delete(Category entity);

	void deleteAllByIdInBatch(Iterable<Integer> ids);

	void deleteById(Integer id);

	long count();

	void deleteAllInBatch(Iterable<Category> entities);

	<S extends Category> boolean exists(Example<S> example);

	<S extends Category> long count(Example<S> example);

	<S extends Category> List<S> saveAllAndFlush(Iterable<S> entities);

	boolean existsById(Integer id);

	Category saveAndFlush(Category entity);

	void flush();

	List<Category> saveAll(List<Category> entities);

	Optional<Category> findById(Integer id);

	List<Category> findAllById(Iterable<Integer> ids);

	List<Category> findAll(Sort sort);

	List<Category> findAll();

	Page<Category> findAll(Pageable pageable);

	Category save(Category entity);

	List<Category> findByNameContaining(String name);

	Page<Category> findByNameContaining(String name, Pageable pageable);

}

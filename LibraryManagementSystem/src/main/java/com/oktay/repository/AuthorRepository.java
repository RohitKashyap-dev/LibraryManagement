package com.oktay.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.oktay.models.Author;

/**
 * @author oktay
 *
 */
@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer>{

}

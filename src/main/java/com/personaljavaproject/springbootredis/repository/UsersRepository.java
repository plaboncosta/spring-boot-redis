package com.personaljavaproject.springbootredis.repository;

import com.personaljavaproject.springbootredis.model.UsersModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends CrudRepository<UsersModel, Integer> {
    List<UsersModel> findAll();
}

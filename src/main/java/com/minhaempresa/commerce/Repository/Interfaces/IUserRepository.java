package com.minhaempresa.commerce.Repository.Interfaces;

import com.minhaempresa.commerce.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<User,Integer> {
}

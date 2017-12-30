package com.demboyz.carservice.repository;

import com.demboyz.carservice.model.Info;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

public interface InfoRepository extends CrudRepository<Info, Long> {

}

package com.rock.report.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.rock.report.entity.User;

@Repository
public interface ReportRepository extends CrudRepository<User, Integer>  {

}
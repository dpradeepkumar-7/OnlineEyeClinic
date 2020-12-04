package com.cg.onlineeyeclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.onlineeyeclinic.model.Tests;

@Repository(value =  "testRepository")
public interface ITestRepository extends JpaRepository<Tests, Integer> {

}


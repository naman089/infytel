package com.infosys.infytel.plan.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.infytel.plan.entity.Plan;

public interface PlanRepository extends JpaRepository<Plan, Integer> {
	
	List<Plan> findAll();
	

}

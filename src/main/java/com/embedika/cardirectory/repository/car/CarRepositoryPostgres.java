package com.embedika.cardirectory.repository.car;

import com.embedika.cardirectory.domain.Car;
import com.embedika.cardirectory.repository.CarRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepositoryPostgres extends JpaRepository<Car, Integer>, JpaSpecificationExecutor<Car>, CarRepository {
}

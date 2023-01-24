package com.embedika.cardirectory.filter.car;

import com.embedika.cardirectory.domain.Car;

import io.micrometer.common.util.StringUtils;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class CarFilter implements Specification<Car> {

    private String licensePlate;

    private String brand;

    private String yearManufacture;


    @Override
    public Predicate toPredicate(Root<Car> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
        List<Predicate> predicates = new ArrayList<>();
        if (StringUtils.isNotBlank(licensePlate)) {
            predicates.add(cb.equal(root.get("licensePlate"), licensePlate));
        }
        if (StringUtils.isNotBlank(brand)) {
            predicates.add(cb.equal(root.get("brand"), brand));
        }
        if (StringUtils.isNotBlank(yearManufacture)) {
            predicates.add(cb.equal(root.get("yearManufacture"), yearManufacture));
        }
        return predicates.size() == 0 ? null : cb.and(predicates.toArray(new Predicate[predicates.size()]));
    }
}

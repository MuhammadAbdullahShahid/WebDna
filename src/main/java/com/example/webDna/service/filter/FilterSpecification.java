package com.example.webDna.service.filter;

import com.example.webDna.entity.vo.transactionLog.TrancLogReq;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class FilterSpecification <T>{

    public Specification<T> getSpecification(TrancLogReq trancLogReq){
        return new Specification<T>() {
            @Override
            public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.equal(root.get(trancLogReq.getColumn()),trancLogReq.getValue());
            }
        };
    }
}

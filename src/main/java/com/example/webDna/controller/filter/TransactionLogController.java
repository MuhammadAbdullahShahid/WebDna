package com.example.webDna.controller.filter;

import com.example.webDna.entity.entities.transaction.TransactionLog;
import com.example.webDna.entity.vo.transactionLog.SearchReq;
import com.example.webDna.entity.vo.transactionLog.TrancLogReq;
import com.example.webDna.repository.TransactionLogRepository;
import com.example.webDna.service.filter.FilterSpecification;
import com.example.webDna.util.response.Response;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/auth/transactionLog")
@RestController
@Controller
public class TransactionLogController {

    @Autowired
    TransactionLogRepository transactionLogRepository;

    @Autowired
    private FilterSpecification<TransactionLog> filterSpecification;

//    @PostMapping("/filter")
//    public List<TransactionLog> getTransactionLog(){
//
//        Specification<TransactionLog> specification = new Specification<>() {
//            @Override
//            public Predicate toPredicate(Root<TransactionLog> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
//                return criteriaBuilder.equal(root.get("CTMATMID"),"1102041000012");
//            }
//        };
//        List<TransactionLog> transactionLogList = transactionLogRepository.findAll(specification);
//
//        return transactionLogList;
//    }

    @PostMapping("/filtering")
    public List<TransactionLog> getTransactionLog(@RequestBody TrancLogReq searchReq){

        Specification<TransactionLog> specification = filterSpecification.getSpecification(searchReq);
        return transactionLogRepository.findAll(specification);
    }


}

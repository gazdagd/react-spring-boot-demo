package com.gazdag.reactdemo.repository;

import com.gazdag.reactdemo.domain.Stock;
import org.springframework.data.repository.CrudRepository;

//@CrossOrigin
public interface StockRepository extends CrudRepository<Stock, Long> {
}

package com.gazdag.reactdemo.bootstrap;

import com.gazdag.reactdemo.domain.Stock;
import com.gazdag.reactdemo.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private StockRepository stockRepository;

    @Override
    public void run(String... args) throws Exception {
        stockRepository.save(Stock.builder().symbol("CAT").name("Caterpillar").currentRate(123.2).build());
        stockRepository.save(Stock.builder().symbol("JNJ").name("Jonson & Jonson").currentRate(138.65).build());
        stockRepository.save(Stock.builder().symbol("IBM").name("IBM").currentRate(119.88).build());
    }
}

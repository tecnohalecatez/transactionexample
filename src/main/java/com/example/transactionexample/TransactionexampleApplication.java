package com.example.transactionexample;

import com.example.transactionexample.model.Account;
import com.example.transactionexample.repository.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class TransactionexampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransactionexampleApplication.class, args);
    }


    @Bean
    CommandLineRunner init (AccountRepository accountRepository){
        return args -> {
            accountRepository.save(new Account("Cuenta A", new BigDecimal("5000")));
            accountRepository.save(new Account("Cuenta B", new BigDecimal("3000")));
        };
    }

}

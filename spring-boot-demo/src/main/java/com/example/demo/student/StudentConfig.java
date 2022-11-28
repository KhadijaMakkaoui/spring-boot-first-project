package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student khadija = new Student(
                    1L,
                    "Khadija",
                    "khadija@gmail.com",
                    LocalDate.of(2000, Month.APRIL, 5)

            );
            Student lamya = new Student(
                    2L,
                    "Lamya",
                    "lamya@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 5)
            );
            repository.saveAll(
                    List.of(khadija,lamya)
            );
        };
    }
}

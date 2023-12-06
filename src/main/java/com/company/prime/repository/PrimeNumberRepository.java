package com.company.prime.repository;

import com.company.prime.repository.model.PrimeNumber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrimeNumberRepository extends JpaRepository<PrimeNumber, String> {}

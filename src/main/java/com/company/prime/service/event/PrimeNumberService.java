package com.company.prime.service.event;

import com.company.prime.repository.PrimeNumberRepository;
import com.company.prime.repository.model.PrimeNumber;
import java.math.BigInteger;
import java.util.List;
import java.util.Random;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PrimeNumberService {
  private final PrimeNumberRepository primeNumberRepository;

  public BigInteger generatePrimeNumber() {
    BigInteger probablePrime = BigInteger.probablePrime(1_000, new Random());
    PrimeNumber prime = primeNumberRepository.save(PrimeNumber.builder().primeNumber(probablePrime).build());
    return prime.getPrimeNumber();
  }

  public List<PrimeNumber> findLastGeneratedPrimes() {
    Sort createdOn = Sort.by(Sort.Order.desc("createdAt"));
    PageRequest pageRequest = PageRequest.of(0, 10, createdOn);
    return primeNumberRepository.findAll(pageRequest).getContent();
  }
}

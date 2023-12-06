package com.company.prime.endpoint.rest.controller;

import com.company.prime.service.event.PrimeNumberService;
import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class GeneratePrimeNumberController {
  private final PrimeNumberService primeNumberService;

  @GetMapping("/new-prime")
  public String generateNewPrime() {
    BigInteger prime = primeNumberService.generatePrimeNumber();
    return prime.toString();
  }

  @GetMapping("/generated-primes")
  public List<String> generatedPrimes() {
    return primeNumberService.findLastGeneratedPrimes().stream()
        .map(primeNumbers -> primeNumbers.getPrimeNumber().toString())
        .collect(Collectors.toList());
  }
}

package com.company.prime.endpoint.rest.controller;

import com.company.prime.service.event.PrimeNumberService;
import java.math.BigInteger;
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
}

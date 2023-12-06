package com.company.prime.service.event;

import java.math.BigInteger;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class PrimeNumberService {
  public BigInteger generatePrimeNumber() {
    int bitLength = 1_000;
    return BigInteger.probablePrime(bitLength, new Random());
  }
}

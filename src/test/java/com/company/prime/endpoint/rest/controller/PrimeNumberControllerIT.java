package com.company.prime.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.company.prime.conf.FacadeIT;
import java.math.BigInteger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PrimeNumberControllerIT extends FacadeIT {
  @Autowired GeneratePrimeNumberController generatePrimeNumberController;

  @Test
  void new_prime_ok() {
    BigInteger actual = generatePrimeNumberController.generateNewPrime();

    int certainty = (int) (99.99 * 100);
    assertTrue(actual.isProbablePrime(certainty));
  }
}

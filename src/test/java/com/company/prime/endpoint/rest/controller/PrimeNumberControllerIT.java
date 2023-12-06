package com.company.prime.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.company.prime.conf.FacadeIT;
import java.math.BigInteger;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PrimeNumberControllerIT extends FacadeIT {
  @Autowired GeneratePrimeNumberController generatePrimeNumberController;
  @Test
  void new_prime_ok() {
    BigInteger response = new BigInteger(generatePrimeNumberController.generateNewPrime());
    Assertions.assertTrue(response.isProbablePrime(100));
  }

  @Test
  public void get_last_10_inserted_values_ok() {
    for (int i = 0; i < 12; i++) {
      generatePrimeNumberController.generateNewPrime();
    }
    List<String> last10InsertedPrime = generatePrimeNumberController.generatedPrimes();
    Assertions.assertEquals(10, last10InsertedPrime.size());
  }


}

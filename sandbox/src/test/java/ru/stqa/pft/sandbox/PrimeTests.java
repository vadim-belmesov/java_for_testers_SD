package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeTests {
  @Test(enabled = false)
  public void testPrimes(){
    Assert.assertTrue(Primes.isPrime(Integer.MAX_VALUE));
  }

  @Test (enabled = false)
  public void testNonePrimes(){
    Assert.assertFalse(Primes.isPrime(Integer.MAX_VALUE - 2));
  }

  @Test
  public void testPrimesFast(){
    Assert.assertTrue(Primes.isPrimeFast(Integer.MAX_VALUE));
  }
}

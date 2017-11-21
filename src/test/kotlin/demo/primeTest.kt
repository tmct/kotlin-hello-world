package demo

import io.kotlintest.matchers.shouldEqual
import io.kotlintest.specs.StringSpec
import org.apache.commons.math3.primes.Primes

class StuffTest : StringSpec() {
    init {
        "next prime after 114 should be 127" {
            val nextPrime = Primes.nextPrime(114)
            nextPrime shouldEqual 127
        }
    }
}
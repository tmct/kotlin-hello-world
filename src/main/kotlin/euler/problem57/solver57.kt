package euler.problem57

import java.math.BigInteger

/**
 * Counts expansions of root 2 with the numerator having an extra digit to the denominator
 */
fun countExpansionsWithExtraNumeratorDigit(maxExpansionIndex: Int): Int {
    var expansion = Pair(BigInteger.valueOf(3), BigInteger.valueOf(2))
    var count = 0
    for (i in 1..maxExpansionIndex) {
        if (expansion.hasNumeratorWithExtraDigit()) {
            count++
        }
        expansion = getNextExpansion(expansion)
    }
    return count
}

private fun Pair<BigInteger, BigInteger>.hasNumeratorWithExtraDigit(): Boolean {
    return this.first.toString().length > this.second.toString().length
}

fun getNextExpansion(expansion: Pair<BigInteger, BigInteger>): Pair<BigInteger, BigInteger> {
    val numerator = expansion.first
    val denominator = expansion.second
    val numeratorMultiple = numerator + denominator * BigInteger.valueOf(2)
    val denominatorMultiple = numerator + denominator
    val gcd = gcd(numeratorMultiple, denominatorMultiple)
    return Pair(numeratorMultiple / gcd, denominatorMultiple / gcd)
}

fun gcd(a: BigInteger, b: BigInteger): BigInteger {
    return sortedGcd(a.max(b)!!, a.min(b)!!)
}

tailrec fun sortedGcd(a: BigInteger, b: BigInteger): BigInteger {
    if (b == BigInteger.ZERO) return a
    return sortedGcd(b, a % b)
}

package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FractionTest {

    private Fraction fraction;
    @BeforeEach
    void before() {
        this.fraction = new Fraction(10,5);
    }

    @Test
    void testFractionIntInt() {
        assertEquals(10, this.fraction.getNumerator());
        assertEquals(5, this.fraction.getDenominator());
    }

    @Test
    void testFraction(){
        this.fraction = new Fraction();
        assertEquals(1, this.fraction.getNumerator());
        assertEquals(1, this.fraction.getDenominator());
    }

    @Test
    void testDecimal(){
        assertEquals(2.0 , this.fraction.decimal());
    }

    @Test
    void testIsProper(){
        fraction = new Fraction(7,9);
        assertTrue(this.fraction.isProper());
    }

    @Test
    void testIsImproper(){
        fraction = new Fraction(10,5);
        assertTrue(this.fraction.isImproper());
    }

    @Test
    void testIsEquivalent(){
        Fraction fraction = new Fraction(6,3);
        assertTrue(this.fraction.isEquivalent(fraction));
    }

    @Test
    void testAdd(){
        Fraction add = this.fraction.add(new Fraction(3,3));
        Fraction result = new Fraction(3,1);
        assertEquals( add.getNumerator(), result.getNumerator());
        assertEquals( add.getDenominator(), result.getDenominator());
    }

    @Test
    void testMultiply(){
        Fraction multiply = this.fraction.multiply(new Fraction(1,3));
        Fraction result = new Fraction(10,15);
        assertEquals( multiply.getNumerator(), result.getNumerator());
        assertEquals( multiply.getDenominator(), result.getDenominator());
    }

    @Test
    void testDivide(){
        Fraction divide = this.fraction.divide(new Fraction(1,2));
        Fraction result = new Fraction(20,5);
        assertEquals( divide.getNumerator(), result.getNumerator());
        assertEquals( divide.getDenominator(), result.getDenominator());
    }
}

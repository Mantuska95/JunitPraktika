package eu.codeacademy.javaua2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.BankAccount;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    private static BankAccount bankAccount;

    @BeforeEach
    void setup() {
        bankAccount = new BankAccount();
    }

    @Test
    void checkIfBalanceIsZero() {
        assertEquals(bankAccount.getBalance(), 0);
    }

    @Test
    void checkDeposit() {
        bankAccount.deposit(1000);
        assertEquals(bankAccount.getBalance(), 1000);
    }

    @Test
    void CheckWithDraw() {
        bankAccount.deposit(1000);
        bankAccount.withDraw(100);
        assertEquals(bankAccount.getBalance(), 900);
    }
}

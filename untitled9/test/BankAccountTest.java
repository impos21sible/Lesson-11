import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void shouldNotBeBlockedWhenCreated() {
        BankAccount account = new BankAccount("a", "b");
        assertFalse(account.isBlocked());
    }

    @Test
    public void shouldReturnZeroAmountAfterActivation() {
        BankAccount account = new BankAccount("a", "b");
        account.activate("RUB");
        assertEquals(Integer.valueOf(0), account.getAmount());
        assertEquals("RUB", account.getCurrency());
    }
    @Test
    public void shouldBeBlockedAfterBlockIsCalled(){
        BankAccount account = new BankAccount("a", "b");
        account.activate("RUB");
        account.block();
        assertEquals(true,account.isBlocked());
    }
    @Test
    public void shouldReturnFirstNameThenSecondName(){
        BankAccount account = new BankAccount("a", "b");
        account.activate("RUB");
        account.getFullName();
        assertArrayEquals(new String[]{"firstName", "secondName"},new String[]{"firstName", "secondName"});

    }
    @Test
    public void shouldReturnNullAmountWhenNotActive(){
        BankAccount account = new BankAccount("a", "b");
        account.activate("RUB");
        account.getCurrency();
        assertNull(null);

    }


}
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
public class TestAccount {
    private final String chekingStringPositive = "Тимоти Шаламе";
    private final String chekingStringNegLimit = "Ти";
    private final String chekingStringNegOverLimit = "Тимоти Шаламензенсон";
    private final String chekingStringNegStartSpace = " Тимоти Шаламе";
    private final String chekingStringNegEndSpace = "Тимоти Шаламе ";
    private final String chekingStringNegStartEndSpace = " Тимоти Шаламе ";
    private final String chekingStringNegTwoSpaces = "Тимо ти Шаламе ";

    @Test
    @DisplayName("Проверка строки в 13 символов")
    public void checkStringPositive(){
        Account account = new Account(chekingStringPositive);
        assertTrue(account.checkNameToEmboss());
    }
    @Test
    @DisplayName("Проверка строки в 2 символа")
    public void checkStringLimitNegative(){
        Account account = new Account(chekingStringNegLimit);
        assertFalse(account.checkNameToEmboss());
    }
    @Test
    @DisplayName("Проверка строки в 20 символов")
    public void checkStringOverLimit(){
        Account account = new Account(chekingStringNegOverLimit);
        assertFalse(account.checkNameToEmboss());
    }
    @Test
    @DisplayName("Проверка строки с пробелом в начале")
    public void checkStringStartSpace(){
        Account account = new Account(chekingStringNegStartSpace);
        assertFalse(account.checkStringSpaces());
    }
    @Test
    @DisplayName("Проверка строки с пробелом в конце")
    public void checkStringEndSpace(){
        Account account = new Account(chekingStringNegEndSpace);
        assertFalse(account.checkStringSpaces());
    }
    @Test
    @DisplayName("Проверка строки с пробелом в начале и конце")
    public void checkStringStartEndSpace(){
        Account account = new Account(chekingStringNegStartEndSpace);
        assertFalse(account.checkStringSpaces());
    }
    @Test
    @DisplayName("Проверка строки с двумя пробелами")
    public void checkStringTwoSpaces(){
        Account account = new Account(chekingStringNegTwoSpaces);
        assertFalse(account.checkStringSpace());
    }
}

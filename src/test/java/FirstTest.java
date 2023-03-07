import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.Callable;

public class FirstTest {
    @Test
    void name() {
        LocalDate parseDate = LocalDate.parse("28.04.2021", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDateTime ppppppp = parseDate.atStartOfDay();
        int i = hashCode();
        Class<? extends FirstTest> hgf = getClass();
        LocalDate parse = LocalDate.parse("IIIII");
    }

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {

    }

    @BeforeAll
    static void beforeAll() {

    }

    @AfterAll
    static void afterAll() {

    }
}

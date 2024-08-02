import com.example.Feline;
import com.example.Felines;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Spy
    Felines felines = new Feline();
    @InjectMocks
    Lion lion;
    {
        try {
            lion = new Lion("Самец",felines);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void getKittensTest() {
        lion.getKittens();
        Mockito.verify(felines, Mockito.times(1)).getKittens();
    }

    @Test
    public void getExceptionTest() {
        try {
            Lion lionExp = new Lion("Тест",felines);
        } catch (Exception ex) {
            String expMessage = ex.getMessage();
            assertEquals(expMessage,"Используйте допустимые значения пола животного - самей или самка");
        }
    }

    @Test
    public void getFoodTest() throws Exception {
        lion.getFood();
        Mockito.verify(felines, Mockito.times(1)).eatMeat();
    }
}

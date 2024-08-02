import com.example.Feline;
import com.example.Felines;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    Feline feline = new Feline();

    @Test
    public void eatMeatTest() throws Exception {
        feline.eatMeat();
       Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void getFamilyTest() {
        String family = feline.getFamily();
        String familyCheck = "Кошачьи";
        assertEquals(family,familyCheck);
    }

    @Test
    public void getKittensWithoutParTest() {
        int kittens = feline.getKittens();
        int kittensCheck=1;
        assertEquals(kittens,kittensCheck);
    }

    @Test
    public void getKittensWithParTest() {
        int countKittensCheck = 4;
        int countKittens = feline.getKittens(countKittensCheck);
        assertEquals(countKittensCheck,countKittens);
    }
}

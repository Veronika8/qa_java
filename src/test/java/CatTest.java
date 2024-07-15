import com.example.Animal;
import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Spy
    Predator predator;
    Feline feline=new Feline();
    @InjectMocks
    Cat cat = new Cat(feline);

    @Test
    public  void getSoundTest() {

        String sound = cat.getSound();
        String soundCheck="Мяу";
        assertEquals(sound,soundCheck);
    }

    @Test
    public void getFoodTest() throws Exception {
        cat.getFood();
        Mockito.verify(predator,Mockito.times(1)).eatMeat();
    }
}

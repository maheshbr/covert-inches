import org.junit.Test;

import java.math.RoundingMode;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


/**
 * Created by maheshbr on 02/04/15.
 */
public class ConverterTest {

    @Test
    public void shouldConvertInchesToCentimeter(){
        Converter conv = new Converter();
        assertThat(conv.convertInchesToCentimeter(12), is( equalTo(30.48)));
    }

    @Test
    public void shouldConvertInchesToMM(){
        Converter conv = new Converter();
        assertThat(conv.convertInchesToMM(12), is( equalTo(())));
    }

    @Test
    public void shouldConvertInchesToMeter(){
        Converter conv = new Converter();
        assertThat(conv.convertInchesToMeter(12), is( equalTo()));
    }
}

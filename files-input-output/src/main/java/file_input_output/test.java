package file_input_output;

import java.math.BigDecimal;

/**
 * Created by Andrey on 9/30/2015.
 */
public class test {

    public static void main(String[] args) {
        double num = 234.33469;
        BigDecimal bd = BigDecimal.valueOf(num).setScale(0, BigDecimal.ROUND_CEILING);
        System.out.println(bd);
    }


}

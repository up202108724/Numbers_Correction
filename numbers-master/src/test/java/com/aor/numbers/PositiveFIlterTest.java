package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class PositiveFIlterTest {
    @Test

    void accept(){
        PositiveFilter filter= new PositiveFilter();
        List<Integer> tobefiltered =Arrays.asList(1,2,3,10,1000,Integer.MAX_VALUE);
        List<Integer> tonotbefiltered =Arrays.asList(0, -1,-2,-3,-10,-1000 ,Integer.MIN_VALUE);
        for (Integer i : tobefiltered){
            Assertions.assertEquals(true, filter.accept(i));

        }
        for (Integer j : tonotbefiltered){
            Assertions.assertEquals(false, filter.accept(j));

        }
    }
}

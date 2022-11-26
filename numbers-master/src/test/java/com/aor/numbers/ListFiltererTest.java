package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

public class ListFiltererTest {
    @Test

    void filter(){
        GenericListFilterer filter= Mockito.mock(GenericListFilterer.class);
        Mockito.when(filter.accept(1)).thenReturn(true);
        Mockito.when(filter.accept(2)).thenReturn(false);
        Mockito.when(filter.accept(3)).thenReturn(true);
        Mockito.when(filter.accept(2)).thenReturn(false);
        Mockito.when(filter.accept(5)).thenReturn(true);

        ListFilterer filterer= new ListFilterer(filter);
        Assertions.assertEquals(Arrays.asList(1,3,5), filterer.filter(Arrays.asList(1,2,3,4,5)));
    }

}

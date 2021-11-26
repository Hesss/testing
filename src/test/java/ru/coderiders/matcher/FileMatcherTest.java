package ru.coderiders.matcher;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


public class FileMatcherTest {

    @Test
    public void isFileNotExistThenIllegalArgumentException() {
        File file = mock(File.class);
        FileMatcher fileMatcher = mock(FileMatcher.class);
        when(file.exists()).thenReturn(false);
        assertThrowsExactly(IllegalArgumentException.class, () -> fileMatcher.match(file));
    }

    @Test
    public void isFileNullThenNullPointerException(){
        File file = null;
        FileMatcher fileMatcher = mock(FileMatcher.class);
        when(fileMatcher.match(file)).thenCallRealMethod();
        assertThrowsExactly(NullPointerException.class,() -> fileMatcher.match(file));
    }
    
}

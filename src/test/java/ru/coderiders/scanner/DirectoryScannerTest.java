package ru.coderiders.scanner;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.coderiders.matcher.FileMatcher;
import ru.coderiders.matcher.PictureMatcher;

import java.io.File;
import java.nio.file.Path;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


public class DirectoryScannerTest {

    public static Path directory;
    public static FileMatcher matcher;

    @BeforeAll
    public void before() {
        directory = mock(Path.class);
        matcher = mock(FileMatcher.class);
    }

    @Test
    public void isScanThrowsIllegalArgumentExceptionWhenDirectoryNotExist(){
        File file = new File("");
        when(directory.toFile()).thenReturn(file);
        when(file.exists()).thenReturn(false);
        DirectoryScanner directoryScanner = new DirectoryScanner(directory,matcher,false);
        assertThrowsExactly(IllegalArgumentException.class, () -> directoryScanner.scan());
    }

    @Test
    public void isScanThrowsIllegalArgumentExceptionWhenArgumentNotDirectory(){
        DirectoryScanner directoryScanner = new DirectoryScanner(directory,matcher,false);
        File file = new File("picture.png");
        when(directory.toFile()).thenReturn(file);
        when(file.isFile()).thenReturn(true);
        assertThrowsExactly(IllegalArgumentException.class, () -> directoryScanner.scan());
    }

}

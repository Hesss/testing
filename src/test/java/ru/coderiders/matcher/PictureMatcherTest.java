package ru.coderiders.matcher;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;


public class PictureMatcherTest {

    @Test
    public void isExtensionsHaveTrueFormat() {
        PictureMatcher matcher = new PictureMatcher();
        Set<String> extensions = matcher.getExtensions();
        assertTrue(extensions.contains(".png"));
        assertTrue(extensions.contains(".jpg"));
        assertTrue(extensions.contains(".jpeg"));
        assertEquals(3, extensions.size());
    }

}

package ru.coderiders.matcher;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;


public class PdfMatcherTest {

    @Test
    public void isExtensionsHaveTrueFormat() {
        PdfMatcher matcher = new PdfMatcher();
        Set<String> extensions = matcher.getExtensions();
        assertTrue(extensions.contains(".pdf"));
        assertEquals(1, extensions.size());
    }

}

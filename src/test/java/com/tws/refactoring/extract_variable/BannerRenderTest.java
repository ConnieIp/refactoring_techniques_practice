package com.tws.refactoring.extract_variable;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BannerRenderTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void should_pass_condition(){
        BannerRender bannerRender= new BannerRender();
        bannerRender.renderBanner("MAC","IE");
        String expected="pass the if condition";
        assertEquals(expected,outContent.toString());
    }

    @Test
    public void should_not_pass_condition_for_browser(){
        BannerRender bannerRender= new BannerRender();
        bannerRender.renderBanner("MAC","Firefox");
        String expected="";
        assertEquals(expected,outContent.toString());
    }

    @Test
    public void should_not_pass_condition_for_platform(){
        BannerRender bannerRender= new BannerRender();
        bannerRender.renderBanner("Windows","IE");
        String expected="";
        assertEquals(expected,outContent.toString());
    }
}

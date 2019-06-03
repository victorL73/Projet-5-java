package fr.exia.BoulderDash.view;

import org.junit.BeforeClass;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class ViewTest {

    private static Frame frame;


    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        frame = new Frame();
    }

    @Test
    public void keyCodeToUserOrder() {
    }

    @Test
    public void run() {

        assertFalse( frame.isVisible());

    }

    @Test
    public void setController() {
    }
}
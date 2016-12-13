package com.example.user.supersmashbro;
import org.junit.*;
import org.junit.Before;
import static org.junit.Assert.*;


/**
 * Created by user on 12/12/2016.
 */
public class PlayerTest {
    Player player;

    @Before
    public void before(){
        player = new Player("Kirby", "Royal Pink", 3);
    }

    @Test
    public void canGetName(){
        assertEquals("Kirby", player.getName());
    }

    @Test
    public void canGetNickname(){
        assertEquals("Royal Pink", player.getNickname());
    }

    @Test
    public void canGetRanking() {
        assertEquals(3, player.getRanking());
    }

    @Test
    public void testBroName(){
        assertEquals("Yoshi", player.broName());
    }

    @Test
    public void testBroNickname(){
        assertEquals("Green Bubblegum", player.broNickname());
    }

    @Test
    public void testBroRanking(){
        assertEquals(5, player.broRanking());
    }

}


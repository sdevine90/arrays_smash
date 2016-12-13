package com.example.user.supersmashbro;
import org.junit.Before;
import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.*;


/**
 * Created by user on 12/12/2016.
 */
public class BroTest {
    Bro bro;
    Player player;


    @Before
    public void before() {
        player =("Yoshi", "Green Bubblegum", 5);
        bro = new Player(new ArrayList<Bro>());
    }


    @Test
    public void addPlayerTest(){
        bro.addPlayer(player);
        assertEquals("Yoshi", player.get());
    }
}


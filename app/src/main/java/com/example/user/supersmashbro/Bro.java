package com.example.user.supersmashbro;
import java.util.ArrayList;

/**
 * Created by user on 12/12/2016.
 */


public class Bro {
    private ArrayList<Player> bros;

    public Bro() {
        this.bros = new ArrayList<Player>();

    }

    public void addPlayer(Player player){
        bros.add(player);
    }

}
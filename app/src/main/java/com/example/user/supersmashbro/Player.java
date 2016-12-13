package com.example.user.supersmashbro;

/**
 * Created by user on 12/12/2016.
 */
public class Player {
    private String name;
    private String nickname;
    private int ranking;

    public Player(String name, String nickname, int ranking){
        this.name = name;
        this.nickname = nickname;
        this.ranking = ranking;
    }

    public String getName(){
        return name;
    }

    public String getNickname(){
        return nickname;
    }

    public int getRanking(){
        return ranking;
    }

    public String broName(){
        return this.name = "Yoshi";

    }

    public String broNickname(){
        return this.nickname = "Green Bubblegum";
    }

    public int broRanking(){
        return this.ranking = 5;
    }
}

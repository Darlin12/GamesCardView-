package com.example.gamesapp;

public class GameModal {

    private String gameTitle;
    private int gameImage;

    public GameModal(String gameTitle, int gameImage) {
        this.gameTitle = gameTitle;
        this.gameImage = gameImage;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public int getGameImage() {
        return gameImage;
    }

    public void setGameImage(int gameImage) {
        this.gameImage = gameImage;
    }
}

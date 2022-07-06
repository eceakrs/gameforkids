package com.example.gameforkids;

public class Game {
    //Member variables representing the title and information about the sport
    private String title;
    private String info;
    private String instruction;
    private String videoId;
    private final int imageResource;

    /**
     * Constructor for the Sport data model
     * @param title The name if the sport.
     * @param info Information about the sport.
* @param instruction
     * @param videoId
     * @param imageResource

     */
    Game(String title, String info, String instruction, String videoId,  int imageResource) {
        this.title = title;
        this.info = info;
        this.instruction = instruction;
        this.imageResource = imageResource;
        this.videoId = videoId;
    }


      /**
     * Gets the title of the game
     * @return The title of the game.
     */
    String getTitle() {
        return title;
    }
    /**
     * Gets the info about the game
     * @return The info about the game.
     */
    String getInfo() {
        return info;
    }
    /**
     * Gets the instruction about the game
     * @return The info about the game.
     */
    String getInstruction(){
        return instruction;
    }
    /**
     * Gets the instruction about the game
     * @return The video id about the game.
     */
    String getVideoId(){
        return videoId;
    }




    public int getImageResource() {
        return imageResource;
    }


}
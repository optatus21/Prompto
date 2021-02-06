package app.prompt;

import app.data.PromptDb; // to return values from query

public class Prompt {
    private int promptId;
    private String promptTitle;
    private int promptGenre;
    
    // empty constructor
    Prompt() {
    
    }
    
    // basic constructor
    Prompt(int id, String title, int genre) {
        this.promptId = id;
        this.promptTitle = title;
        this.promptGenre = genre;
    }
    
    // returns a prompt to the sender
    public Prompt getPrompt() {
        // TODO
        // gets random prompt from the database
        return (new Prompt());
    }
}

package com.example;

/**
 * Created by jessicatracy on 11/12/16.
 */
public class FlashCard {
    String question;
    Answer answer;
    String hint;

    public FlashCard() {
    }

    public FlashCard(String question, Answer answer, String hint) {
        this.question = question;
        this.answer = answer;
        this.hint = hint;
    }

    //Getters and Setters
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }
}

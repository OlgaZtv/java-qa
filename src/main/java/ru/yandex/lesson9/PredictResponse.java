package ru.yandex.lesson9;

import java.util.List;

// POJO, DTO, VIEW
public class PredictResponse {

    private Boolean endOfWord;
    private Long pos;
    private List<String> text;

    public Integer code;

    public String message;

    public Boolean getEndOfWord() {
        return endOfWord;
    }

    public void setEndOfWord(Boolean endOfWord) {
        this.endOfWord = endOfWord;
    }

    public Long getPos() {
        return pos;
    }

    public void setPos(Long pos) {
        this.pos = pos;
    }

    public List<String> getText() {
        return text;
    }

    public void setText(List<String> text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "PredictResponse{" +
                "endOfWord=" + endOfWord +
                ", pos=" + pos +
                ", text=" + text +
                '}';
    }
}

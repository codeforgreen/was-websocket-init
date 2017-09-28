package ro.vborcea.was.ws.controller;

public class Content {

    private String content;
    public Content(final String s) {
        this.content = s;
    }

    public String getContent() {
        return content;
    }

    public void setContent(final String content) {
        this.content = content;
    }
}

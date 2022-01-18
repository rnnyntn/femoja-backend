package de.rnnyntn.femoja.rest.math.dto;

public class MathSheetDto {
    private final long id;
    private final String content;

    public MathSheetDto(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

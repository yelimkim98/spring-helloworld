package wooteco.helloworld.jdbc.relation;

import org.springframework.data.annotation.Id;

public class Comment {
    private String content;

    public Comment() {
    }

    public Comment(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

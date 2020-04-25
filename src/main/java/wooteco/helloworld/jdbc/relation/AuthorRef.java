package wooteco.helloworld.jdbc.relation;

import org.springframework.data.relational.core.mapping.Table;

@Table("article_author")
public class AuthorRef {
    private Long author;

    public AuthorRef() {
    }

    public AuthorRef(Author author) {
        this.author = author.getId();
    }
}

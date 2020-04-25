package wooteco.helloworld.jdbc.relation;

import org.springframework.data.annotation.Id;

import java.util.HashSet;
import java.util.Set;

public class Article {
    @Id
    private Long id;
    private String title;
    private String content;
    private AuthorRef author;
    private Set<Comment> comments = new HashSet<>();

    public Article() {
    }

    public Article(String title, String content, Author author) {
        this.title = title;
        this.content = content;
        this.author = new AuthorRef(author);
    }

    public void addComments(Comment comment) {
        comments.add(comment);
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public AuthorRef getAuthor() {
        return author;
    }

    public Set<Comment> getComments() {
        return comments;
    }
}


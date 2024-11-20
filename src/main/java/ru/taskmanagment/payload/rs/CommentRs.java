package ru.taskmanagment.payload.rs;

import lombok.Data;
import ru.taskmanagment.entity.Comment;

@Data
public class CommentRs {
    private Long id;
    private Long userId;
    private String userName;
    private Long taskId;
    private String content;
    private String createdAt;

    public static CommentRs toCommentRs(Comment comment) {
        CommentRs commentRs = new CommentRs();
        commentRs.setId(commentRs.getId());
        commentRs.setContent(comment.getContent());
        commentRs.setTaskId(comment.getTaskId());
        return commentRs;
    }

    public Comment toComment() {
        Comment comment = new Comment();
        comment.setId(getId());
        comment.setContent(getContent());
        comment.setTaskId(getTaskId());
        comment.setUserId(getUserId());
        return comment;
    }



}
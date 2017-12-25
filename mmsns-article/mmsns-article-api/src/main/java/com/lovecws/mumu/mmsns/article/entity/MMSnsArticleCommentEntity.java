package com.lovecws.mumu.mmsns.article.entity;

import com.lovecws.mumu.core.entity.PersistentEntity;

import java.util.Date;

/**
 * @author babymm
 * @version 1.0-SNAPSHOT
 * @Description: 文章评论
 * @date 2017-12-18 16:26:
 * mb_article_comment
 */
public class MMSnsArticleCommentEntity extends PersistentEntity {

    private int commentId;//评论id
    private String commentStatus;//评论状态
    private Date commentDate;//评论时间

    private String commentType;//评论类型 comment、reply
    private String commentContent;
    private String commentImg;

    private int articleId;//文章id
    private int replyCommentId;//如果是回复 则是回复的评论id

    private int commentUserId;//评论用户id

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public String getCommentType() {
        return commentType;
    }

    public void setCommentType(String commentType) {
        this.commentType = commentType;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCommentImg() {
        return commentImg;
    }

    public void setCommentImg(String commentImg) {
        this.commentImg = commentImg;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public int getReplyCommentId() {
        return replyCommentId;
    }

    public void setReplyCommentId(int replyCommentId) {
        this.replyCommentId = replyCommentId;
    }

    public int getCommentUserId() {
        return commentUserId;
    }

    public void setCommentUserId(int commentUserId) {
        this.commentUserId = commentUserId;
    }

    private String userName;
    private String individuation;
    private String avator;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIndividuation() {
        return individuation;
    }

    public void setIndividuation(String individuation) {
        this.individuation = individuation;
    }

    public String getAvator() {
        return avator;
    }

    public void setAvator(String avator) {
        this.avator = avator;
    }
}

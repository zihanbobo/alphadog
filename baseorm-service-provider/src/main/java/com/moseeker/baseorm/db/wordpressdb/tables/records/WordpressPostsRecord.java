/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.wordpressdb.tables.records;


import com.moseeker.baseorm.db.wordpressdb.tables.WordpressPosts;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WordpressPostsRecord extends UpdatableRecordImpl<WordpressPostsRecord> {

    private static final long serialVersionUID = 2097621253;

    /**
     * Setter for <code>wordpressdb.wordpress_posts.ID</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_posts.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_posts.post_author</code>.
     */
    public void setPostAuthor(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_posts.post_author</code>.
     */
    public Long getPostAuthor() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_posts.post_date</code>.
     */
    public void setPostDate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_posts.post_date</code>.
     */
    public Timestamp getPostDate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_posts.post_date_gmt</code>.
     */
    public void setPostDateGmt(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_posts.post_date_gmt</code>.
     */
    public Timestamp getPostDateGmt() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_posts.post_content</code>.
     */
    public void setPostContent(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_posts.post_content</code>.
     */
    public String getPostContent() {
        return (String) get(4);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_posts.post_title</code>.
     */
    public void setPostTitle(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_posts.post_title</code>.
     */
    public String getPostTitle() {
        return (String) get(5);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_posts.post_excerpt</code>.
     */
    public void setPostExcerpt(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_posts.post_excerpt</code>.
     */
    public String getPostExcerpt() {
        return (String) get(6);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_posts.post_status</code>.
     */
    public void setPostStatus(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_posts.post_status</code>.
     */
    public String getPostStatus() {
        return (String) get(7);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_posts.comment_status</code>.
     */
    public void setCommentStatus(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_posts.comment_status</code>.
     */
    public String getCommentStatus() {
        return (String) get(8);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_posts.ping_status</code>.
     */
    public void setPingStatus(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_posts.ping_status</code>.
     */
    public String getPingStatus() {
        return (String) get(9);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_posts.post_password</code>.
     */
    public void setPostPassword(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_posts.post_password</code>.
     */
    public String getPostPassword() {
        return (String) get(10);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_posts.post_name</code>.
     */
    public void setPostName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_posts.post_name</code>.
     */
    public String getPostName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_posts.to_ping</code>.
     */
    public void setToPing(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_posts.to_ping</code>.
     */
    public String getToPing() {
        return (String) get(12);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_posts.pinged</code>.
     */
    public void setPinged(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_posts.pinged</code>.
     */
    public String getPinged() {
        return (String) get(13);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_posts.post_modified</code>.
     */
    public void setPostModified(Timestamp value) {
        set(14, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_posts.post_modified</code>.
     */
    public Timestamp getPostModified() {
        return (Timestamp) get(14);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_posts.post_modified_gmt</code>.
     */
    public void setPostModifiedGmt(Timestamp value) {
        set(15, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_posts.post_modified_gmt</code>.
     */
    public Timestamp getPostModifiedGmt() {
        return (Timestamp) get(15);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_posts.post_content_filtered</code>.
     */
    public void setPostContentFiltered(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_posts.post_content_filtered</code>.
     */
    public String getPostContentFiltered() {
        return (String) get(16);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_posts.post_parent</code>.
     */
    public void setPostParent(Long value) {
        set(17, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_posts.post_parent</code>.
     */
    public Long getPostParent() {
        return (Long) get(17);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_posts.guid</code>.
     */
    public void setGuid(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_posts.guid</code>.
     */
    public String getGuid() {
        return (String) get(18);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_posts.menu_order</code>.
     */
    public void setMenuOrder(Integer value) {
        set(19, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_posts.menu_order</code>.
     */
    public Integer getMenuOrder() {
        return (Integer) get(19);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_posts.post_type</code>.
     */
    public void setPostType(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_posts.post_type</code>.
     */
    public String getPostType() {
        return (String) get(20);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_posts.post_mime_type</code>.
     */
    public void setPostMimeType(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_posts.post_mime_type</code>.
     */
    public String getPostMimeType() {
        return (String) get(21);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_posts.comment_count</code>.
     */
    public void setCommentCount(Long value) {
        set(22, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_posts.comment_count</code>.
     */
    public Long getCommentCount() {
        return (Long) get(22);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WordpressPostsRecord
     */
    public WordpressPostsRecord() {
        super(WordpressPosts.WORDPRESS_POSTS);
    }

    /**
     * Create a detached, initialised WordpressPostsRecord
     */
    public WordpressPostsRecord(Long id, Long postAuthor, Timestamp postDate, Timestamp postDateGmt, String postContent, String postTitle, String postExcerpt, String postStatus, String commentStatus, String pingStatus, String postPassword, String postName, String toPing, String pinged, Timestamp postModified, Timestamp postModifiedGmt, String postContentFiltered, Long postParent, String guid, Integer menuOrder, String postType, String postMimeType, Long commentCount) {
        super(WordpressPosts.WORDPRESS_POSTS);

        set(0, id);
        set(1, postAuthor);
        set(2, postDate);
        set(3, postDateGmt);
        set(4, postContent);
        set(5, postTitle);
        set(6, postExcerpt);
        set(7, postStatus);
        set(8, commentStatus);
        set(9, pingStatus);
        set(10, postPassword);
        set(11, postName);
        set(12, toPing);
        set(13, pinged);
        set(14, postModified);
        set(15, postModifiedGmt);
        set(16, postContentFiltered);
        set(17, postParent);
        set(18, guid);
        set(19, menuOrder);
        set(20, postType);
        set(21, postMimeType);
        set(22, commentCount);
    }
}

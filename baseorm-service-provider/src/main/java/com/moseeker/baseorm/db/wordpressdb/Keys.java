/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.wordpressdb;


import com.moseeker.baseorm.db.wordpressdb.tables.WordpressCommentmeta;
import com.moseeker.baseorm.db.wordpressdb.tables.WordpressComments;
import com.moseeker.baseorm.db.wordpressdb.tables.WordpressLinks;
import com.moseeker.baseorm.db.wordpressdb.tables.WordpressOptions;
import com.moseeker.baseorm.db.wordpressdb.tables.WordpressPostmeta;
import com.moseeker.baseorm.db.wordpressdb.tables.WordpressPosts;
import com.moseeker.baseorm.db.wordpressdb.tables.WordpressTermRelationships;
import com.moseeker.baseorm.db.wordpressdb.tables.WordpressTermTaxonomy;
import com.moseeker.baseorm.db.wordpressdb.tables.WordpressTermmeta;
import com.moseeker.baseorm.db.wordpressdb.tables.WordpressTerms;
import com.moseeker.baseorm.db.wordpressdb.tables.WordpressUserPost;
import com.moseeker.baseorm.db.wordpressdb.tables.WordpressUsermeta;
import com.moseeker.baseorm.db.wordpressdb.tables.WordpressUsers;
import com.moseeker.baseorm.db.wordpressdb.tables.records.WordpressCommentmetaRecord;
import com.moseeker.baseorm.db.wordpressdb.tables.records.WordpressCommentsRecord;
import com.moseeker.baseorm.db.wordpressdb.tables.records.WordpressLinksRecord;
import com.moseeker.baseorm.db.wordpressdb.tables.records.WordpressOptionsRecord;
import com.moseeker.baseorm.db.wordpressdb.tables.records.WordpressPostmetaRecord;
import com.moseeker.baseorm.db.wordpressdb.tables.records.WordpressPostsRecord;
import com.moseeker.baseorm.db.wordpressdb.tables.records.WordpressTermRelationshipsRecord;
import com.moseeker.baseorm.db.wordpressdb.tables.records.WordpressTermTaxonomyRecord;
import com.moseeker.baseorm.db.wordpressdb.tables.records.WordpressTermmetaRecord;
import com.moseeker.baseorm.db.wordpressdb.tables.records.WordpressTermsRecord;
import com.moseeker.baseorm.db.wordpressdb.tables.records.WordpressUserPostRecord;
import com.moseeker.baseorm.db.wordpressdb.tables.records.WordpressUsermetaRecord;
import com.moseeker.baseorm.db.wordpressdb.tables.records.WordpressUsersRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>wordpressdb</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<WordpressCommentmetaRecord, Long> IDENTITY_WORDPRESS_COMMENTMETA = Identities0.IDENTITY_WORDPRESS_COMMENTMETA;
    public static final Identity<WordpressCommentsRecord, Long> IDENTITY_WORDPRESS_COMMENTS = Identities0.IDENTITY_WORDPRESS_COMMENTS;
    public static final Identity<WordpressLinksRecord, Long> IDENTITY_WORDPRESS_LINKS = Identities0.IDENTITY_WORDPRESS_LINKS;
    public static final Identity<WordpressOptionsRecord, Long> IDENTITY_WORDPRESS_OPTIONS = Identities0.IDENTITY_WORDPRESS_OPTIONS;
    public static final Identity<WordpressPostmetaRecord, Long> IDENTITY_WORDPRESS_POSTMETA = Identities0.IDENTITY_WORDPRESS_POSTMETA;
    public static final Identity<WordpressPostsRecord, Long> IDENTITY_WORDPRESS_POSTS = Identities0.IDENTITY_WORDPRESS_POSTS;
    public static final Identity<WordpressTermmetaRecord, Long> IDENTITY_WORDPRESS_TERMMETA = Identities0.IDENTITY_WORDPRESS_TERMMETA;
    public static final Identity<WordpressTermsRecord, Long> IDENTITY_WORDPRESS_TERMS = Identities0.IDENTITY_WORDPRESS_TERMS;
    public static final Identity<WordpressTermTaxonomyRecord, Long> IDENTITY_WORDPRESS_TERM_TAXONOMY = Identities0.IDENTITY_WORDPRESS_TERM_TAXONOMY;
    public static final Identity<WordpressUsermetaRecord, Long> IDENTITY_WORDPRESS_USERMETA = Identities0.IDENTITY_WORDPRESS_USERMETA;
    public static final Identity<WordpressUsersRecord, Long> IDENTITY_WORDPRESS_USERS = Identities0.IDENTITY_WORDPRESS_USERS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<WordpressCommentmetaRecord> KEY_WORDPRESS_COMMENTMETA_PRIMARY = UniqueKeys0.KEY_WORDPRESS_COMMENTMETA_PRIMARY;
    public static final UniqueKey<WordpressCommentsRecord> KEY_WORDPRESS_COMMENTS_PRIMARY = UniqueKeys0.KEY_WORDPRESS_COMMENTS_PRIMARY;
    public static final UniqueKey<WordpressLinksRecord> KEY_WORDPRESS_LINKS_PRIMARY = UniqueKeys0.KEY_WORDPRESS_LINKS_PRIMARY;
    public static final UniqueKey<WordpressOptionsRecord> KEY_WORDPRESS_OPTIONS_PRIMARY = UniqueKeys0.KEY_WORDPRESS_OPTIONS_PRIMARY;
    public static final UniqueKey<WordpressOptionsRecord> KEY_WORDPRESS_OPTIONS_OPTION_NAME = UniqueKeys0.KEY_WORDPRESS_OPTIONS_OPTION_NAME;
    public static final UniqueKey<WordpressPostmetaRecord> KEY_WORDPRESS_POSTMETA_PRIMARY = UniqueKeys0.KEY_WORDPRESS_POSTMETA_PRIMARY;
    public static final UniqueKey<WordpressPostsRecord> KEY_WORDPRESS_POSTS_PRIMARY = UniqueKeys0.KEY_WORDPRESS_POSTS_PRIMARY;
    public static final UniqueKey<WordpressTermmetaRecord> KEY_WORDPRESS_TERMMETA_PRIMARY = UniqueKeys0.KEY_WORDPRESS_TERMMETA_PRIMARY;
    public static final UniqueKey<WordpressTermsRecord> KEY_WORDPRESS_TERMS_PRIMARY = UniqueKeys0.KEY_WORDPRESS_TERMS_PRIMARY;
    public static final UniqueKey<WordpressTermRelationshipsRecord> KEY_WORDPRESS_TERM_RELATIONSHIPS_PRIMARY = UniqueKeys0.KEY_WORDPRESS_TERM_RELATIONSHIPS_PRIMARY;
    public static final UniqueKey<WordpressTermTaxonomyRecord> KEY_WORDPRESS_TERM_TAXONOMY_PRIMARY = UniqueKeys0.KEY_WORDPRESS_TERM_TAXONOMY_PRIMARY;
    public static final UniqueKey<WordpressTermTaxonomyRecord> KEY_WORDPRESS_TERM_TAXONOMY_TERM_ID_TAXONOMY = UniqueKeys0.KEY_WORDPRESS_TERM_TAXONOMY_TERM_ID_TAXONOMY;
    public static final UniqueKey<WordpressUsermetaRecord> KEY_WORDPRESS_USERMETA_PRIMARY = UniqueKeys0.KEY_WORDPRESS_USERMETA_PRIMARY;
    public static final UniqueKey<WordpressUsersRecord> KEY_WORDPRESS_USERS_PRIMARY = UniqueKeys0.KEY_WORDPRESS_USERS_PRIMARY;
    public static final UniqueKey<WordpressUserPostRecord> KEY_WORDPRESS_USER_POST_PRIMARY = UniqueKeys0.KEY_WORDPRESS_USER_POST_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<WordpressCommentmetaRecord, Long> IDENTITY_WORDPRESS_COMMENTMETA = createIdentity(WordpressCommentmeta.WORDPRESS_COMMENTMETA, WordpressCommentmeta.WORDPRESS_COMMENTMETA.META_ID);
        public static Identity<WordpressCommentsRecord, Long> IDENTITY_WORDPRESS_COMMENTS = createIdentity(WordpressComments.WORDPRESS_COMMENTS, WordpressComments.WORDPRESS_COMMENTS.COMMENT_ID);
        public static Identity<WordpressLinksRecord, Long> IDENTITY_WORDPRESS_LINKS = createIdentity(WordpressLinks.WORDPRESS_LINKS, WordpressLinks.WORDPRESS_LINKS.LINK_ID);
        public static Identity<WordpressOptionsRecord, Long> IDENTITY_WORDPRESS_OPTIONS = createIdentity(WordpressOptions.WORDPRESS_OPTIONS, WordpressOptions.WORDPRESS_OPTIONS.OPTION_ID);
        public static Identity<WordpressPostmetaRecord, Long> IDENTITY_WORDPRESS_POSTMETA = createIdentity(WordpressPostmeta.WORDPRESS_POSTMETA, WordpressPostmeta.WORDPRESS_POSTMETA.META_ID);
        public static Identity<WordpressPostsRecord, Long> IDENTITY_WORDPRESS_POSTS = createIdentity(WordpressPosts.WORDPRESS_POSTS, WordpressPosts.WORDPRESS_POSTS.ID);
        public static Identity<WordpressTermmetaRecord, Long> IDENTITY_WORDPRESS_TERMMETA = createIdentity(WordpressTermmeta.WORDPRESS_TERMMETA, WordpressTermmeta.WORDPRESS_TERMMETA.META_ID);
        public static Identity<WordpressTermsRecord, Long> IDENTITY_WORDPRESS_TERMS = createIdentity(WordpressTerms.WORDPRESS_TERMS, WordpressTerms.WORDPRESS_TERMS.TERM_ID);
        public static Identity<WordpressTermTaxonomyRecord, Long> IDENTITY_WORDPRESS_TERM_TAXONOMY = createIdentity(WordpressTermTaxonomy.WORDPRESS_TERM_TAXONOMY, WordpressTermTaxonomy.WORDPRESS_TERM_TAXONOMY.TERM_TAXONOMY_ID);
        public static Identity<WordpressUsermetaRecord, Long> IDENTITY_WORDPRESS_USERMETA = createIdentity(WordpressUsermeta.WORDPRESS_USERMETA, WordpressUsermeta.WORDPRESS_USERMETA.UMETA_ID);
        public static Identity<WordpressUsersRecord, Long> IDENTITY_WORDPRESS_USERS = createIdentity(WordpressUsers.WORDPRESS_USERS, WordpressUsers.WORDPRESS_USERS.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<WordpressCommentmetaRecord> KEY_WORDPRESS_COMMENTMETA_PRIMARY = createUniqueKey(WordpressCommentmeta.WORDPRESS_COMMENTMETA, "KEY_wordpress_commentmeta_PRIMARY", WordpressCommentmeta.WORDPRESS_COMMENTMETA.META_ID);
        public static final UniqueKey<WordpressCommentsRecord> KEY_WORDPRESS_COMMENTS_PRIMARY = createUniqueKey(WordpressComments.WORDPRESS_COMMENTS, "KEY_wordpress_comments_PRIMARY", WordpressComments.WORDPRESS_COMMENTS.COMMENT_ID);
        public static final UniqueKey<WordpressLinksRecord> KEY_WORDPRESS_LINKS_PRIMARY = createUniqueKey(WordpressLinks.WORDPRESS_LINKS, "KEY_wordpress_links_PRIMARY", WordpressLinks.WORDPRESS_LINKS.LINK_ID);
        public static final UniqueKey<WordpressOptionsRecord> KEY_WORDPRESS_OPTIONS_PRIMARY = createUniqueKey(WordpressOptions.WORDPRESS_OPTIONS, "KEY_wordpress_options_PRIMARY", WordpressOptions.WORDPRESS_OPTIONS.OPTION_ID);
        public static final UniqueKey<WordpressOptionsRecord> KEY_WORDPRESS_OPTIONS_OPTION_NAME = createUniqueKey(WordpressOptions.WORDPRESS_OPTIONS, "KEY_wordpress_options_option_name", WordpressOptions.WORDPRESS_OPTIONS.OPTION_NAME);
        public static final UniqueKey<WordpressPostmetaRecord> KEY_WORDPRESS_POSTMETA_PRIMARY = createUniqueKey(WordpressPostmeta.WORDPRESS_POSTMETA, "KEY_wordpress_postmeta_PRIMARY", WordpressPostmeta.WORDPRESS_POSTMETA.META_ID);
        public static final UniqueKey<WordpressPostsRecord> KEY_WORDPRESS_POSTS_PRIMARY = createUniqueKey(WordpressPosts.WORDPRESS_POSTS, "KEY_wordpress_posts_PRIMARY", WordpressPosts.WORDPRESS_POSTS.ID);
        public static final UniqueKey<WordpressTermmetaRecord> KEY_WORDPRESS_TERMMETA_PRIMARY = createUniqueKey(WordpressTermmeta.WORDPRESS_TERMMETA, "KEY_wordpress_termmeta_PRIMARY", WordpressTermmeta.WORDPRESS_TERMMETA.META_ID);
        public static final UniqueKey<WordpressTermsRecord> KEY_WORDPRESS_TERMS_PRIMARY = createUniqueKey(WordpressTerms.WORDPRESS_TERMS, "KEY_wordpress_terms_PRIMARY", WordpressTerms.WORDPRESS_TERMS.TERM_ID);
        public static final UniqueKey<WordpressTermRelationshipsRecord> KEY_WORDPRESS_TERM_RELATIONSHIPS_PRIMARY = createUniqueKey(WordpressTermRelationships.WORDPRESS_TERM_RELATIONSHIPS, "KEY_wordpress_term_relationships_PRIMARY", WordpressTermRelationships.WORDPRESS_TERM_RELATIONSHIPS.OBJECT_ID, WordpressTermRelationships.WORDPRESS_TERM_RELATIONSHIPS.TERM_TAXONOMY_ID);
        public static final UniqueKey<WordpressTermTaxonomyRecord> KEY_WORDPRESS_TERM_TAXONOMY_PRIMARY = createUniqueKey(WordpressTermTaxonomy.WORDPRESS_TERM_TAXONOMY, "KEY_wordpress_term_taxonomy_PRIMARY", WordpressTermTaxonomy.WORDPRESS_TERM_TAXONOMY.TERM_TAXONOMY_ID);
        public static final UniqueKey<WordpressTermTaxonomyRecord> KEY_WORDPRESS_TERM_TAXONOMY_TERM_ID_TAXONOMY = createUniqueKey(WordpressTermTaxonomy.WORDPRESS_TERM_TAXONOMY, "KEY_wordpress_term_taxonomy_term_id_taxonomy", WordpressTermTaxonomy.WORDPRESS_TERM_TAXONOMY.TERM_ID, WordpressTermTaxonomy.WORDPRESS_TERM_TAXONOMY.TAXONOMY);
        public static final UniqueKey<WordpressUsermetaRecord> KEY_WORDPRESS_USERMETA_PRIMARY = createUniqueKey(WordpressUsermeta.WORDPRESS_USERMETA, "KEY_wordpress_usermeta_PRIMARY", WordpressUsermeta.WORDPRESS_USERMETA.UMETA_ID);
        public static final UniqueKey<WordpressUsersRecord> KEY_WORDPRESS_USERS_PRIMARY = createUniqueKey(WordpressUsers.WORDPRESS_USERS, "KEY_wordpress_users_PRIMARY", WordpressUsers.WORDPRESS_USERS.ID);
        public static final UniqueKey<WordpressUserPostRecord> KEY_WORDPRESS_USER_POST_PRIMARY = createUniqueKey(WordpressUserPost.WORDPRESS_USER_POST, "KEY_wordpress_user_post_PRIMARY", WordpressUserPost.WORDPRESS_USER_POST.USER_ID, WordpressUserPost.WORDPRESS_USER_POST.OBJECT_ID);
    }
}

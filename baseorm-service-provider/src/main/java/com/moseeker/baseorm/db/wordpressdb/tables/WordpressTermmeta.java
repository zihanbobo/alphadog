/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.wordpressdb.tables;


import com.moseeker.baseorm.db.wordpressdb.Keys;
import com.moseeker.baseorm.db.wordpressdb.Wordpressdb;
import com.moseeker.baseorm.db.wordpressdb.tables.records.WordpressTermmetaRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class WordpressTermmeta extends TableImpl<WordpressTermmetaRecord> {

    private static final long serialVersionUID = 237534595;

    /**
     * The reference instance of <code>wordpressdb.wordpress_termmeta</code>
     */
    public static final WordpressTermmeta WORDPRESS_TERMMETA = new WordpressTermmeta();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WordpressTermmetaRecord> getRecordType() {
        return WordpressTermmetaRecord.class;
    }

    /**
     * The column <code>wordpressdb.wordpress_termmeta.meta_id</code>.
     */
    public final TableField<WordpressTermmetaRecord, Long> META_ID = createField("meta_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>wordpressdb.wordpress_termmeta.term_id</code>.
     */
    public final TableField<WordpressTermmetaRecord, Long> TERM_ID = createField("term_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>wordpressdb.wordpress_termmeta.meta_key</code>.
     */
    public final TableField<WordpressTermmetaRecord, String> META_KEY = createField("meta_key", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>wordpressdb.wordpress_termmeta.meta_value</code>.
     */
    public final TableField<WordpressTermmetaRecord, String> META_VALUE = createField("meta_value", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>wordpressdb.wordpress_termmeta</code> table reference
     */
    public WordpressTermmeta() {
        this("wordpress_termmeta", null);
    }

    /**
     * Create an aliased <code>wordpressdb.wordpress_termmeta</code> table reference
     */
    public WordpressTermmeta(String alias) {
        this(alias, WORDPRESS_TERMMETA);
    }

    private WordpressTermmeta(String alias, Table<WordpressTermmetaRecord> aliased) {
        this(alias, aliased, null);
    }

    private WordpressTermmeta(String alias, Table<WordpressTermmetaRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Wordpressdb.WORDPRESSDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<WordpressTermmetaRecord, Long> getIdentity() {
        return Keys.IDENTITY_WORDPRESS_TERMMETA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<WordpressTermmetaRecord> getPrimaryKey() {
        return Keys.KEY_WORDPRESS_TERMMETA_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<WordpressTermmetaRecord>> getKeys() {
        return Arrays.<UniqueKey<WordpressTermmetaRecord>>asList(Keys.KEY_WORDPRESS_TERMMETA_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordpressTermmeta as(String alias) {
        return new WordpressTermmeta(alias, this);
    }

    /**
     * Rename this table
     */
    public WordpressTermmeta rename(String name) {
        return new WordpressTermmeta(name, null);
    }
}

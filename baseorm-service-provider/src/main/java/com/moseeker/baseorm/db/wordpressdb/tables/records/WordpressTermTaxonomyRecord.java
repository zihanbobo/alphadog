/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.wordpressdb.tables.records;


import com.moseeker.baseorm.db.wordpressdb.tables.WordpressTermTaxonomy;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WordpressTermTaxonomyRecord extends UpdatableRecordImpl<WordpressTermTaxonomyRecord> implements Record6<Long, Long, String, String, Long, Long> {

    private static final long serialVersionUID = 1468550265;

    /**
     * Setter for <code>wordpressdb.wordpress_term_taxonomy.term_taxonomy_id</code>.
     */
    public void setTermTaxonomyId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_term_taxonomy.term_taxonomy_id</code>.
     */
    public Long getTermTaxonomyId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_term_taxonomy.term_id</code>.
     */
    public void setTermId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_term_taxonomy.term_id</code>.
     */
    public Long getTermId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_term_taxonomy.taxonomy</code>.
     */
    public void setTaxonomy(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_term_taxonomy.taxonomy</code>.
     */
    public String getTaxonomy() {
        return (String) get(2);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_term_taxonomy.description</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_term_taxonomy.description</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_term_taxonomy.parent</code>.
     */
    public void setParent(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_term_taxonomy.parent</code>.
     */
    public Long getParent() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_term_taxonomy.count</code>.
     */
    public void setCount(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_term_taxonomy.count</code>.
     */
    public Long getCount() {
        return (Long) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Long, String, String, Long, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Long, String, String, Long, Long> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return WordpressTermTaxonomy.WORDPRESS_TERM_TAXONOMY.TERM_TAXONOMY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return WordpressTermTaxonomy.WORDPRESS_TERM_TAXONOMY.TERM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return WordpressTermTaxonomy.WORDPRESS_TERM_TAXONOMY.TAXONOMY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return WordpressTermTaxonomy.WORDPRESS_TERM_TAXONOMY.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return WordpressTermTaxonomy.WORDPRESS_TERM_TAXONOMY.PARENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return WordpressTermTaxonomy.WORDPRESS_TERM_TAXONOMY.COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getTermTaxonomyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getTermId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTaxonomy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getParent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordpressTermTaxonomyRecord value1(Long value) {
        setTermTaxonomyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordpressTermTaxonomyRecord value2(Long value) {
        setTermId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordpressTermTaxonomyRecord value3(String value) {
        setTaxonomy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordpressTermTaxonomyRecord value4(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordpressTermTaxonomyRecord value5(Long value) {
        setParent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordpressTermTaxonomyRecord value6(Long value) {
        setCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordpressTermTaxonomyRecord values(Long value1, Long value2, String value3, String value4, Long value5, Long value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WordpressTermTaxonomyRecord
     */
    public WordpressTermTaxonomyRecord() {
        super(WordpressTermTaxonomy.WORDPRESS_TERM_TAXONOMY);
    }

    /**
     * Create a detached, initialised WordpressTermTaxonomyRecord
     */
    public WordpressTermTaxonomyRecord(Long termTaxonomyId, Long termId, String taxonomy, String description, Long parent, Long count) {
        super(WordpressTermTaxonomy.WORDPRESS_TERM_TAXONOMY);

        set(0, termTaxonomyId);
        set(1, termId);
        set(2, taxonomy);
        set(3, description);
        set(4, parent);
        set(5, count);
    }
}

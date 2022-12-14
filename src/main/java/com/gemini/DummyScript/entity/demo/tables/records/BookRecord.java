/*
 * This file is generated by jOOQ.
 */
package com.gemini.DummyScript.entity.demo.tables.records;


import com.gemini.DummyScript.entity.demo.tables.Book;

import java.beans.ConstructorProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(
    name = "BOOK",
    schema = "DEMO",
    uniqueConstraints = {
        @UniqueConstraint(name = "CONSTRAINT_1", columnNames = { "ID" })
    }
)
public class BookRecord extends UpdatableRecordImpl<BookRecord> implements Record5<Integer, Integer, String, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DEMO.BOOK.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>DEMO.BOOK.ID</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, precision = 7)
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>DEMO.BOOK.AUTHOR_ID</code>.
     */
    public void setAuthorId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>DEMO.BOOK.AUTHOR_ID</code>.
     */
    @Column(name = "AUTHOR_ID", nullable = false, precision = 7)
    @NotNull
    public Integer getAuthorId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>DEMO.BOOK.TITLE</code>.
     */
    public void setTitle(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>DEMO.BOOK.TITLE</code>.
     */
    @Column(name = "TITLE", nullable = false, length = 400)
    @NotNull
    @Size(max = 400)
    public String getTitle() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DEMO.BOOK.PUBLISHED_IN</code>.
     */
    public void setPublishedIn(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>DEMO.BOOK.PUBLISHED_IN</code>.
     */
    @Column(name = "PUBLISHED_IN", nullable = false, precision = 7)
    @NotNull
    public Integer getPublishedIn() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>DEMO.BOOK.LANGUAGE_ID</code>.
     */
    public void setLanguageId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>DEMO.BOOK.LANGUAGE_ID</code>.
     */
    @Column(name = "LANGUAGE_ID", nullable = false, precision = 7)
    @NotNull
    public Integer getLanguageId() {
        return (Integer) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, String, Integer, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, Integer, String, Integer, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Book.BOOK.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Book.BOOK.AUTHOR_ID;
    }

    @Override
    public Field<String> field3() {
        return Book.BOOK.TITLE;
    }

    @Override
    public Field<Integer> field4() {
        return Book.BOOK.PUBLISHED_IN;
    }

    @Override
    public Field<Integer> field5() {
        return Book.BOOK.LANGUAGE_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getAuthorId();
    }

    @Override
    public String component3() {
        return getTitle();
    }

    @Override
    public Integer component4() {
        return getPublishedIn();
    }

    @Override
    public Integer component5() {
        return getLanguageId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getAuthorId();
    }

    @Override
    public String value3() {
        return getTitle();
    }

    @Override
    public Integer value4() {
        return getPublishedIn();
    }

    @Override
    public Integer value5() {
        return getLanguageId();
    }

    @Override
    public BookRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public BookRecord value2(Integer value) {
        setAuthorId(value);
        return this;
    }

    @Override
    public BookRecord value3(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public BookRecord value4(Integer value) {
        setPublishedIn(value);
        return this;
    }

    @Override
    public BookRecord value5(Integer value) {
        setLanguageId(value);
        return this;
    }

    @Override
    public BookRecord values(Integer value1, Integer value2, String value3, Integer value4, Integer value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BookRecord
     */
    public BookRecord() {
        super(Book.BOOK);
    }

    /**
     * Create a detached, initialised BookRecord
     */
    @ConstructorProperties({ "Id", "AuthorId", "Title", "PublishedIn", "LanguageId" })
    public BookRecord(Integer Id, Integer AuthorId, String Title, Integer PublishedIn, Integer LanguageId) {
        super(Book.BOOK);

        setId(Id);
        setAuthorId(AuthorId);
        setTitle(Title);
        setPublishedIn(PublishedIn);
        setLanguageId(LanguageId);
    }
}

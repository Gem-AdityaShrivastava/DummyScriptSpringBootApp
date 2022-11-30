/*
 * This file is generated by jOOQ.
 */
package com.gemini.DummyScript.entity.demo.tables.daos;


import com.gemini.DummyScript.entity.demo.tables.Book;
import com.gemini.DummyScript.entity.demo.tables.records.BookRecord;

import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import org.jooq.impl.DefaultConfiguration;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class BookDao extends DAOImpl<BookRecord, com.gemini.DummyScript.entity.demo.tables.pojos.Book, Integer> {

    /**
     * Create a new BookDao without any configuration
     */
    public BookDao() {
        super(Book.BOOK, com.gemini.DummyScript.entity.demo.tables.pojos.Book.class);
    }

    /**
     * Create a new BookDao with an attached configuration
     */
    @Autowired
    public BookDao(Configuration configuration) {
        super(Book.BOOK, com.gemini.DummyScript.entity.demo.tables.pojos.Book.class, configuration);
    }

    @Override
    public Integer getId(com.gemini.DummyScript.entity.demo.tables.pojos.Book object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.gemini.DummyScript.entity.demo.tables.pojos.Book> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Book.BOOK.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<com.gemini.DummyScript.entity.demo.tables.pojos.Book> fetchById(Integer... values) {
        return fetch(Book.BOOK.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public com.gemini.DummyScript.entity.demo.tables.pojos.Book fetchOneById(Integer value) {
        return fetchOne(Book.BOOK.ID, value);
    }

    /**
     * Fetch records that have <code>AUTHOR_ID BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.gemini.DummyScript.entity.demo.tables.pojos.Book> fetchRangeOfAuthorId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Book.BOOK.AUTHOR_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>AUTHOR_ID IN (values)</code>
     */
    public List<com.gemini.DummyScript.entity.demo.tables.pojos.Book> fetchByAuthorId(Integer... values) {
        return fetch(Book.BOOK.AUTHOR_ID, values);
    }

    /**
     * Fetch records that have <code>TITLE BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.gemini.DummyScript.entity.demo.tables.pojos.Book> fetchRangeOfTitle(String lowerInclusive, String upperInclusive) {
        return fetchRange(Book.BOOK.TITLE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>TITLE IN (values)</code>
     */
    public List<com.gemini.DummyScript.entity.demo.tables.pojos.Book> fetchByTitle(String... values) {
        return fetch(Book.BOOK.TITLE, values);
    }

    /**
     * Fetch records that have <code>PUBLISHED_IN BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.gemini.DummyScript.entity.demo.tables.pojos.Book> fetchRangeOfPublishedIn(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Book.BOOK.PUBLISHED_IN, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>PUBLISHED_IN IN (values)</code>
     */
    public List<com.gemini.DummyScript.entity.demo.tables.pojos.Book> fetchByPublishedIn(Integer... values) {
        return fetch(Book.BOOK.PUBLISHED_IN, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE_ID BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.gemini.DummyScript.entity.demo.tables.pojos.Book> fetchRangeOfLanguageId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Book.BOOK.LANGUAGE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>LANGUAGE_ID IN (values)</code>
     */
    public List<com.gemini.DummyScript.entity.demo.tables.pojos.Book> fetchByLanguageId(Integer... values) {
        return fetch(Book.BOOK.LANGUAGE_ID, values);
    }

    /**
     * Created custom fetchRecord Method
     */
    public com.gemini.DummyScript.entity.demo.tables.pojos.Book fetchRecord(Integer Id){
            return this.ctx().selectFrom(Book.BOOK).where(Book.BOOK.ID.eq(Id)).fetchOneInto(com.gemini.DummyScript.entity.demo.tables.pojos.Book.class);
            }

            /**
             * Created custom Insert records Method
             */
            public com.gemini.DummyScript.entity.demo.tables.pojos.Book insertRecord(com.gemini.DummyScript.entity.demo.tables.pojos.Book classObject) {
                BookRecord record=this.ctx().newRecord(Book.BOOK);
                record.setAuthorId(classObject.getAuthorId());
                record.setTitle(classObject.getTitle());
                record.setPublishedIn(classObject.getPublishedIn());
                record.setLanguageId(classObject.getLanguageId());
                record.store();
                com.gemini.DummyScript.entity.demo.tables.pojos.Book result=record.into(com.gemini.DummyScript.entity.demo.tables.pojos.Book.class);
                return result;
            }

            /**
             * Created custom Delete record Method
             */
            public int deleteRecord(Integer Id){
                int result=this.ctx().deleteFrom(Book.BOOK).where(Book.BOOK.ID.eq(Id)).execute();
                return result;
            }

            /**
             * Created custom Update record Method
             */
            public int updateRecord(com.gemini.DummyScript.entity.demo.tables.pojos.Book classObject){
                int result=this.ctx().update(Book.BOOK)
                .set(Book.BOOK.AUTHOR_ID,classObject.getAuthorId())
                .set(Book.BOOK.TITLE,classObject.getTitle())
                .set(Book.BOOK.PUBLISHED_IN,classObject.getPublishedIn())
                .set(Book.BOOK.LANGUAGE_ID,classObject.getLanguageId())
                .where(Book.BOOK.ID.eq(classObject.getId())).execute();
                return result;
            }
        }
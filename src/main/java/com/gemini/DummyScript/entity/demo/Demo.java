/*
 * This file is generated by jOOQ.
 */
package com.gemini.DummyScript.entity.demo;


import com.gemini.DummyScript.entity.DefaultCatalog;
import com.gemini.DummyScript.entity.demo.tables.Author;
import com.gemini.DummyScript.entity.demo.tables.Book;
import com.gemini.DummyScript.entity.demo.tables.Language;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Demo extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>DEMO</code>
     */
    public static final Demo DEMO = new Demo();

    /**
     * The table <code>DEMO.AUTHOR</code>.
     */
    public final Author AUTHOR = Author.AUTHOR;

    /**
     * The table <code>DEMO.BOOK</code>.
     */
    public final Book BOOK = Book.BOOK;

    /**
     * The table <code>DEMO.LANGUAGE</code>.
     */
    public final Language LANGUAGE = Language.LANGUAGE;

    /**
     * No further instances allowed
     */
    private Demo() {
        super("DEMO", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Author.AUTHOR,
            Book.BOOK,
            Language.LANGUAGE);
    }
}

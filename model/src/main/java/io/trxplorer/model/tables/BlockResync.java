/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model.tables;


import io.trxplorer.model.Keys;
import io.trxplorer.model.Tmp;
import io.trxplorer.model.tables.records.BlockResyncRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BlockResync extends TableImpl<BlockResyncRecord> {

    private static final long serialVersionUID = 894796200;

    /**
     * The reference instance of <code>tmp.block_resync</code>
     */
    public static final BlockResync BLOCK_RESYNC = new BlockResync();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BlockResyncRecord> getRecordType() {
        return BlockResyncRecord.class;
    }

    /**
     * The column <code>tmp.block_resync.num</code>.
     */
    public final TableField<BlockResyncRecord, ULong> NUM = createField("num", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>tmp.block_resync</code> table reference
     */
    public BlockResync() {
        this("block_resync", null);
    }

    /**
     * Create an aliased <code>tmp.block_resync</code> table reference
     */
    public BlockResync(String alias) {
        this(alias, BLOCK_RESYNC);
    }

    private BlockResync(String alias, Table<BlockResyncRecord> aliased) {
        this(alias, aliased, null);
    }

    private BlockResync(String alias, Table<BlockResyncRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Tmp.TMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BlockResyncRecord> getPrimaryKey() {
        return Keys.KEY_BLOCK_RESYNC_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BlockResyncRecord>> getKeys() {
        return Arrays.<UniqueKey<BlockResyncRecord>>asList(Keys.KEY_BLOCK_RESYNC_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockResync as(String alias) {
        return new BlockResync(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BlockResync rename(String name) {
        return new BlockResync(name, null);
    }
}

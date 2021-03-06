/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model.tables;


import io.trxplorer.model.Keys;
import io.trxplorer.model.Tmp;
import io.trxplorer.model.tables.records.SyncBlockRecord;

import java.sql.Timestamp;
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
public class SyncBlock extends TableImpl<SyncBlockRecord> {

    private static final long serialVersionUID = -1361247681;

    /**
     * The reference instance of <code>tmp.sync_block</code>
     */
    public static final SyncBlock SYNC_BLOCK = new SyncBlock();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SyncBlockRecord> getRecordType() {
        return SyncBlockRecord.class;
    }

    /**
     * The column <code>tmp.sync_block.id</code>.
     */
    public final TableField<SyncBlockRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>tmp.sync_block.block_num</code>.
     */
    public final TableField<SyncBlockRecord, ULong> BLOCK_NUM = createField("block_num", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>tmp.sync_block.date_start</code>.
     */
    public final TableField<SyncBlockRecord, Timestamp> DATE_START = createField("date_start", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>tmp.sync_block.date_end</code>.
     */
    public final TableField<SyncBlockRecord, Timestamp> DATE_END = createField("date_end", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>tmp.sync_block.date_locked</code>.
     */
    public final TableField<SyncBlockRecord, Timestamp> DATE_LOCKED = createField("date_locked", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>tmp.sync_block.node_id</code>.
     */
    public final TableField<SyncBlockRecord, Integer> NODE_ID = createField("node_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>tmp.sync_block</code> table reference
     */
    public SyncBlock() {
        this("sync_block", null);
    }

    /**
     * Create an aliased <code>tmp.sync_block</code> table reference
     */
    public SyncBlock(String alias) {
        this(alias, SYNC_BLOCK);
    }

    private SyncBlock(String alias, Table<SyncBlockRecord> aliased) {
        this(alias, aliased, null);
    }

    private SyncBlock(String alias, Table<SyncBlockRecord> aliased, Field<?>[] parameters) {
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
    public Identity<SyncBlockRecord, ULong> getIdentity() {
        return Keys.IDENTITY_SYNC_BLOCK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SyncBlockRecord> getPrimaryKey() {
        return Keys.KEY_SYNC_BLOCK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SyncBlockRecord>> getKeys() {
        return Arrays.<UniqueKey<SyncBlockRecord>>asList(Keys.KEY_SYNC_BLOCK_PRIMARY, Keys.KEY_SYNC_BLOCK_BLOCK_NUM_UNIQUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncBlock as(String alias) {
        return new SyncBlock(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SyncBlock rename(String name) {
        return new SyncBlock(name, null);
    }
}

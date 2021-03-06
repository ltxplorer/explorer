/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model.tables;


import io.trxplorer.model.Keys;
import io.trxplorer.model.Tmp;
import io.trxplorer.model.tables.records.SyncAccountRecord;

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
public class SyncAccount extends TableImpl<SyncAccountRecord> {

    private static final long serialVersionUID = 460348196;

    /**
     * The reference instance of <code>tmp.sync_account</code>
     */
    public static final SyncAccount SYNC_ACCOUNT = new SyncAccount();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SyncAccountRecord> getRecordType() {
        return SyncAccountRecord.class;
    }

    /**
     * The column <code>tmp.sync_account.id</code>.
     */
    public final TableField<SyncAccountRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>tmp.sync_account.address</code>.
     */
    public final TableField<SyncAccountRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(164).nullable(false), this, "");

    /**
     * The column <code>tmp.sync_account.date_created</code>.
     */
    public final TableField<SyncAccountRecord, Timestamp> DATE_CREATED = createField("date_created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>tmp.sync_account.date_locked</code>.
     */
    public final TableField<SyncAccountRecord, Timestamp> DATE_LOCKED = createField("date_locked", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>tmp.sync_account.origin</code>.
     */
    public final TableField<SyncAccountRecord, String> ORIGIN = createField("origin", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * The column <code>tmp.sync_account.tx_timestamp</code>.
     */
    public final TableField<SyncAccountRecord, Timestamp> TX_TIMESTAMP = createField("tx_timestamp", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>tmp.sync_account</code> table reference
     */
    public SyncAccount() {
        this("sync_account", null);
    }

    /**
     * Create an aliased <code>tmp.sync_account</code> table reference
     */
    public SyncAccount(String alias) {
        this(alias, SYNC_ACCOUNT);
    }

    private SyncAccount(String alias, Table<SyncAccountRecord> aliased) {
        this(alias, aliased, null);
    }

    private SyncAccount(String alias, Table<SyncAccountRecord> aliased, Field<?>[] parameters) {
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
    public Identity<SyncAccountRecord, ULong> getIdentity() {
        return Keys.IDENTITY_SYNC_ACCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SyncAccountRecord> getPrimaryKey() {
        return Keys.KEY_SYNC_ACCOUNT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SyncAccountRecord>> getKeys() {
        return Arrays.<UniqueKey<SyncAccountRecord>>asList(Keys.KEY_SYNC_ACCOUNT_PRIMARY, Keys.KEY_SYNC_ACCOUNT_ADDRESS_UNIQUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncAccount as(String alias) {
        return new SyncAccount(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SyncAccount rename(String name) {
        return new SyncAccount(name, null);
    }
}

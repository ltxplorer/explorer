/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model.tables;


import io.trxplorer.model.Keys;
import io.trxplorer.model.Tmp;
import io.trxplorer.model.tables.records.MarketRecord;

import java.math.BigDecimal;
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
import org.jooq.types.UInteger;


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
public class Market extends TableImpl<MarketRecord> {

    private static final long serialVersionUID = 749072403;

    /**
     * The reference instance of <code>tmp.market</code>
     */
    public static final Market MARKET = new Market();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MarketRecord> getRecordType() {
        return MarketRecord.class;
    }

    /**
     * The column <code>tmp.market.id</code>.
     */
    public final TableField<MarketRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>tmp.market.source</code>.
     */
    public final TableField<MarketRecord, String> SOURCE = createField("source", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

    /**
     * The column <code>tmp.market.pair</code>.
     */
    public final TableField<MarketRecord, String> PAIR = createField("pair", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

    /**
     * The column <code>tmp.market.volume_24h</code>.
     */
    public final TableField<MarketRecord, UInteger> VOLUME_24H = createField("volume_24h", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>tmp.market.price</code>.
     */
    public final TableField<MarketRecord, BigDecimal> PRICE = createField("price", org.jooq.impl.SQLDataType.DECIMAL.precision(7, 7).nullable(false), this, "");

    /**
     * The column <code>tmp.market.day</code>.
     */
    public final TableField<MarketRecord, Integer> DAY = createField("day", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>tmp.market.month</code>.
     */
    public final TableField<MarketRecord, Integer> MONTH = createField("month", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>tmp.market.year</code>.
     */
    public final TableField<MarketRecord, Integer> YEAR = createField("year", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>tmp.market.last_update</code>.
     */
    public final TableField<MarketRecord, Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>tmp.market</code> table reference
     */
    public Market() {
        this("market", null);
    }

    /**
     * Create an aliased <code>tmp.market</code> table reference
     */
    public Market(String alias) {
        this(alias, MARKET);
    }

    private Market(String alias, Table<MarketRecord> aliased) {
        this(alias, aliased, null);
    }

    private Market(String alias, Table<MarketRecord> aliased, Field<?>[] parameters) {
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
    public Identity<MarketRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_MARKET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MarketRecord> getPrimaryKey() {
        return Keys.KEY_MARKET_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MarketRecord>> getKeys() {
        return Arrays.<UniqueKey<MarketRecord>>asList(Keys.KEY_MARKET_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Market as(String alias) {
        return new Market(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Market rename(String name) {
        return new Market(name, null);
    }
}

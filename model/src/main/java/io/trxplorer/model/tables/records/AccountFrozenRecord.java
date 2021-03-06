/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model.tables.records;


import io.trxplorer.model.tables.AccountFrozen;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;
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
public class AccountFrozenRecord extends UpdatableRecordImpl<AccountFrozenRecord> implements Record4<ULong, Long, Timestamp, ULong> {

    private static final long serialVersionUID = -1725212828;

    /**
     * Setter for <code>tmp.account_frozen.id</code>.
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>tmp.account_frozen.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>tmp.account_frozen.balance</code>.
     */
    public void setBalance(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>tmp.account_frozen.balance</code>.
     */
    public Long getBalance() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>tmp.account_frozen.expire_time</code>.
     */
    public void setExpireTime(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>tmp.account_frozen.expire_time</code>.
     */
    public Timestamp getExpireTime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>tmp.account_frozen.account_id</code>.
     */
    public void setAccountId(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>tmp.account_frozen.account_id</code>.
     */
    public ULong getAccountId() {
        return (ULong) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<ULong, Long, Timestamp, ULong> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<ULong, Long, Timestamp, ULong> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return AccountFrozen.ACCOUNT_FROZEN.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return AccountFrozen.ACCOUNT_FROZEN.BALANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return AccountFrozen.ACCOUNT_FROZEN.EXPIRE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return AccountFrozen.ACCOUNT_FROZEN.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getBalance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getExpireTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value4() {
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountFrozenRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountFrozenRecord value2(Long value) {
        setBalance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountFrozenRecord value3(Timestamp value) {
        setExpireTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountFrozenRecord value4(ULong value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountFrozenRecord values(ULong value1, Long value2, Timestamp value3, ULong value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AccountFrozenRecord
     */
    public AccountFrozenRecord() {
        super(AccountFrozen.ACCOUNT_FROZEN);
    }

    /**
     * Create a detached, initialised AccountFrozenRecord
     */
    public AccountFrozenRecord(ULong id, Long balance, Timestamp expireTime, ULong accountId) {
        super(AccountFrozen.ACCOUNT_FROZEN);

        set(0, id);
        set(1, balance);
        set(2, expireTime);
        set(3, accountId);
    }
}

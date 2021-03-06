/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model.tables.records;


import io.trxplorer.model.tables.Account;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
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
public class AccountRecord extends UpdatableRecordImpl<AccountRecord> implements Record11<ULong, String, Byte, String, Long, ULong, Timestamp, Timestamp, Long, UByte, UByte> {

    private static final long serialVersionUID = 27569628;

    /**
     * Setter for <code>tmp.account.id</code>.
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>tmp.account.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>tmp.account.account_name</code>.
     */
    public void setAccountName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>tmp.account.account_name</code>.
     */
    public String getAccountName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>tmp.account.type</code>.
     */
    public void setType(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>tmp.account.type</code>.
     */
    public Byte getType() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>tmp.account.address</code>.
     */
    public void setAddress(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>tmp.account.address</code>.
     */
    public String getAddress() {
        return (String) get(3);
    }

    /**
     * Setter for <code>tmp.account.balance</code>.
     */
    public void setBalance(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>tmp.account.balance</code>.
     */
    public Long getBalance() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>tmp.account.allowance</code>.
     */
    public void setAllowance(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>tmp.account.allowance</code>.
     */
    public ULong getAllowance() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>tmp.account.latest_withdaw_time</code>.
     */
    public void setLatestWithdawTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>tmp.account.latest_withdaw_time</code>.
     */
    public Timestamp getLatestWithdawTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>tmp.account.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>tmp.account.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>tmp.account.bandwidth</code>.
     */
    public void setBandwidth(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>tmp.account.bandwidth</code>.
     */
    public Long getBandwidth() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>tmp.account.is_witness</code>.
     */
    public void setIsWitness(UByte value) {
        set(9, value);
    }

    /**
     * Getter for <code>tmp.account.is_witness</code>.
     */
    public UByte getIsWitness() {
        return (UByte) get(9);
    }

    /**
     * Setter for <code>tmp.account.is_committee</code>.
     */
    public void setIsCommittee(UByte value) {
        set(10, value);
    }

    /**
     * Getter for <code>tmp.account.is_committee</code>.
     */
    public UByte getIsCommittee() {
        return (UByte) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<ULong, String, Byte, String, Long, ULong, Timestamp, Timestamp, Long, UByte, UByte> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<ULong, String, Byte, String, Long, ULong, Timestamp, Timestamp, Long, UByte, UByte> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return Account.ACCOUNT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Account.ACCOUNT.ACCOUNT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return Account.ACCOUNT.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Account.ACCOUNT.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return Account.ACCOUNT.BALANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field6() {
        return Account.ACCOUNT.ALLOWANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Account.ACCOUNT.LATEST_WITHDAW_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Account.ACCOUNT.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return Account.ACCOUNT.BANDWIDTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field10() {
        return Account.ACCOUNT.IS_WITNESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field11() {
        return Account.ACCOUNT.IS_COMMITTEE;
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
    public String value2() {
        return getAccountName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getBalance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value6() {
        return getAllowance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getLatestWithdawTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getBandwidth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value10() {
        return getIsWitness();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value11() {
        return getIsCommittee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value2(String value) {
        setAccountName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value3(Byte value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value4(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value5(Long value) {
        setBalance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value6(ULong value) {
        setAllowance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value7(Timestamp value) {
        setLatestWithdawTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value8(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value9(Long value) {
        setBandwidth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value10(UByte value) {
        setIsWitness(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value11(UByte value) {
        setIsCommittee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord values(ULong value1, String value2, Byte value3, String value4, Long value5, ULong value6, Timestamp value7, Timestamp value8, Long value9, UByte value10, UByte value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AccountRecord
     */
    public AccountRecord() {
        super(Account.ACCOUNT);
    }

    /**
     * Create a detached, initialised AccountRecord
     */
    public AccountRecord(ULong id, String accountName, Byte type, String address, Long balance, ULong allowance, Timestamp latestWithdawTime, Timestamp createTime, Long bandwidth, UByte isWitness, UByte isCommittee) {
        super(Account.ACCOUNT);

        set(0, id);
        set(1, accountName);
        set(2, type);
        set(3, address);
        set(4, balance);
        set(5, allowance);
        set(6, latestWithdawTime);
        set(7, createTime);
        set(8, bandwidth);
        set(9, isWitness);
        set(10, isCommittee);
    }
}

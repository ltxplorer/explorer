/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model.tables.records;


import io.trxplorer.model.tables.TransactionResult;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class TransactionResultRecord extends UpdatableRecordImpl<TransactionResultRecord> implements Record4<ULong, ULong, UByte, ULong> {

    private static final long serialVersionUID = -2111591548;

    /**
     * Setter for <code>tmp.transaction_result.id</code>.
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>tmp.transaction_result.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>tmp.transaction_result.fee</code>.
     */
    public void setFee(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>tmp.transaction_result.fee</code>.
     */
    public ULong getFee() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>tmp.transaction_result.code</code>.
     */
    public void setCode(UByte value) {
        set(2, value);
    }

    /**
     * Getter for <code>tmp.transaction_result.code</code>.
     */
    public UByte getCode() {
        return (UByte) get(2);
    }

    /**
     * Setter for <code>tmp.transaction_result.transaction_id</code>.
     */
    public void setTransactionId(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>tmp.transaction_result.transaction_id</code>.
     */
    public ULong getTransactionId() {
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
    public Row4<ULong, ULong, UByte, ULong> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<ULong, ULong, UByte, ULong> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return TransactionResult.TRANSACTION_RESULT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field2() {
        return TransactionResult.TRANSACTION_RESULT.FEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field3() {
        return TransactionResult.TRANSACTION_RESULT.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return TransactionResult.TRANSACTION_RESULT.TRANSACTION_ID;
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
    public ULong value2() {
        return getFee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value3() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value4() {
        return getTransactionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionResultRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionResultRecord value2(ULong value) {
        setFee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionResultRecord value3(UByte value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionResultRecord value4(ULong value) {
        setTransactionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionResultRecord values(ULong value1, ULong value2, UByte value3, ULong value4) {
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
     * Create a detached TransactionResultRecord
     */
    public TransactionResultRecord() {
        super(TransactionResult.TRANSACTION_RESULT);
    }

    /**
     * Create a detached, initialised TransactionResultRecord
     */
    public TransactionResultRecord(ULong id, ULong fee, UByte code, ULong transactionId) {
        super(TransactionResult.TRANSACTION_RESULT);

        set(0, id);
        set(1, fee);
        set(2, code);
        set(3, transactionId);
    }
}

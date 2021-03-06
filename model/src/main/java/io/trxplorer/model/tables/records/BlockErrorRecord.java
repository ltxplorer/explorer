/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model.tables.records;


import io.trxplorer.model.tables.BlockError;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class BlockErrorRecord extends UpdatableRecordImpl<BlockErrorRecord> implements Record3<ULong, ULong, String> {

    private static final long serialVersionUID = 244841995;

    /**
     * Setter for <code>tmp.block_error.id</code>.
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>tmp.block_error.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>tmp.block_error.block</code>.
     */
    public void setBlock(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>tmp.block_error.block</code>.
     */
    public ULong getBlock() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>tmp.block_error.error</code>.
     */
    public void setError(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>tmp.block_error.error</code>.
     */
    public String getError() {
        return (String) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<ULong, ULong, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<ULong, ULong, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return BlockError.BLOCK_ERROR.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field2() {
        return BlockError.BLOCK_ERROR.BLOCK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return BlockError.BLOCK_ERROR.ERROR;
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
        return getBlock();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getError();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockErrorRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockErrorRecord value2(ULong value) {
        setBlock(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockErrorRecord value3(String value) {
        setError(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockErrorRecord values(ULong value1, ULong value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BlockErrorRecord
     */
    public BlockErrorRecord() {
        super(BlockError.BLOCK_ERROR);
    }

    /**
     * Create a detached, initialised BlockErrorRecord
     */
    public BlockErrorRecord(ULong id, ULong block, String error) {
        super(BlockError.BLOCK_ERROR);

        set(0, id);
        set(1, block);
        set(2, error);
    }
}

/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model.tables.records;


import io.trxplorer.model.tables.VotingRoundVote;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;
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
public class VotingRoundVoteRecord extends UpdatableRecordImpl<VotingRoundVoteRecord> implements Record6<ULong, UInteger, String, String, Long, Timestamp> {

    private static final long serialVersionUID = 1917193853;

    /**
     * Setter for <code>tmp.voting_round_vote.id</code>.
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>tmp.voting_round_vote.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>tmp.voting_round_vote.voting_round_id</code>.
     */
    public void setVotingRoundId(UInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>tmp.voting_round_vote.voting_round_id</code>.
     */
    public UInteger getVotingRoundId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>tmp.voting_round_vote.owner_address</code>.
     */
    public void setOwnerAddress(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>tmp.voting_round_vote.owner_address</code>.
     */
    public String getOwnerAddress() {
        return (String) get(2);
    }

    /**
     * Setter for <code>tmp.voting_round_vote.vote_address</code>.
     */
    public void setVoteAddress(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>tmp.voting_round_vote.vote_address</code>.
     */
    public String getVoteAddress() {
        return (String) get(3);
    }

    /**
     * Setter for <code>tmp.voting_round_vote.vote_count</code>.
     */
    public void setVoteCount(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>tmp.voting_round_vote.vote_count</code>.
     */
    public Long getVoteCount() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>tmp.voting_round_vote.timestamp</code>.
     */
    public void setTimestamp(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>tmp.voting_round_vote.timestamp</code>.
     */
    public Timestamp getTimestamp() {
        return (Timestamp) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<ULong, UInteger, String, String, Long, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<ULong, UInteger, String, String, Long, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return VotingRoundVote.VOTING_ROUND_VOTE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field2() {
        return VotingRoundVote.VOTING_ROUND_VOTE.VOTING_ROUND_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return VotingRoundVote.VOTING_ROUND_VOTE.OWNER_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return VotingRoundVote.VOTING_ROUND_VOTE.VOTE_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return VotingRoundVote.VOTING_ROUND_VOTE.VOTE_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return VotingRoundVote.VOTING_ROUND_VOTE.TIMESTAMP;
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
    public UInteger value2() {
        return getVotingRoundId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getOwnerAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getVoteAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getVoteCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VotingRoundVoteRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VotingRoundVoteRecord value2(UInteger value) {
        setVotingRoundId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VotingRoundVoteRecord value3(String value) {
        setOwnerAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VotingRoundVoteRecord value4(String value) {
        setVoteAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VotingRoundVoteRecord value5(Long value) {
        setVoteCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VotingRoundVoteRecord value6(Timestamp value) {
        setTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VotingRoundVoteRecord values(ULong value1, UInteger value2, String value3, String value4, Long value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VotingRoundVoteRecord
     */
    public VotingRoundVoteRecord() {
        super(VotingRoundVote.VOTING_ROUND_VOTE);
    }

    /**
     * Create a detached, initialised VotingRoundVoteRecord
     */
    public VotingRoundVoteRecord(ULong id, UInteger votingRoundId, String ownerAddress, String voteAddress, Long voteCount, Timestamp timestamp) {
        super(VotingRoundVote.VOTING_ROUND_VOTE);

        set(0, id);
        set(1, votingRoundId);
        set(2, ownerAddress);
        set(3, voteAddress);
        set(4, voteCount);
        set(5, timestamp);
    }
}

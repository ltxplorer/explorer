/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model.tables;


import io.trxplorer.model.Keys;
import io.trxplorer.model.Tmp;
import io.trxplorer.model.tables.records.VotingRoundVoteRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
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
public class VotingRoundVote extends TableImpl<VotingRoundVoteRecord> {

    private static final long serialVersionUID = 1053730231;

    /**
     * The reference instance of <code>tmp.voting_round_vote</code>
     */
    public static final VotingRoundVote VOTING_ROUND_VOTE = new VotingRoundVote();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VotingRoundVoteRecord> getRecordType() {
        return VotingRoundVoteRecord.class;
    }

    /**
     * The column <code>tmp.voting_round_vote.id</code>.
     */
    public final TableField<VotingRoundVoteRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>tmp.voting_round_vote.voting_round_id</code>.
     */
    public final TableField<VotingRoundVoteRecord, UInteger> VOTING_ROUND_ID = createField("voting_round_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>tmp.voting_round_vote.owner_address</code>.
     */
    public final TableField<VotingRoundVoteRecord, String> OWNER_ADDRESS = createField("owner_address", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

    /**
     * The column <code>tmp.voting_round_vote.vote_address</code>.
     */
    public final TableField<VotingRoundVoteRecord, String> VOTE_ADDRESS = createField("vote_address", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

    /**
     * The column <code>tmp.voting_round_vote.vote_count</code>.
     */
    public final TableField<VotingRoundVoteRecord, Long> VOTE_COUNT = createField("vote_count", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>tmp.voting_round_vote.timestamp</code>.
     */
    public final TableField<VotingRoundVoteRecord, Timestamp> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>tmp.voting_round_vote</code> table reference
     */
    public VotingRoundVote() {
        this("voting_round_vote", null);
    }

    /**
     * Create an aliased <code>tmp.voting_round_vote</code> table reference
     */
    public VotingRoundVote(String alias) {
        this(alias, VOTING_ROUND_VOTE);
    }

    private VotingRoundVote(String alias, Table<VotingRoundVoteRecord> aliased) {
        this(alias, aliased, null);
    }

    private VotingRoundVote(String alias, Table<VotingRoundVoteRecord> aliased, Field<?>[] parameters) {
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
    public Identity<VotingRoundVoteRecord, ULong> getIdentity() {
        return Keys.IDENTITY_VOTING_ROUND_VOTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<VotingRoundVoteRecord> getPrimaryKey() {
        return Keys.KEY_VOTING_ROUND_VOTE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<VotingRoundVoteRecord>> getKeys() {
        return Arrays.<UniqueKey<VotingRoundVoteRecord>>asList(Keys.KEY_VOTING_ROUND_VOTE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<VotingRoundVoteRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<VotingRoundVoteRecord, ?>>asList(Keys.FK_VOTING_ROUND_VOTE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VotingRoundVote as(String alias) {
        return new VotingRoundVote(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VotingRoundVote rename(String name) {
        return new VotingRoundVote(name, null);
    }
}

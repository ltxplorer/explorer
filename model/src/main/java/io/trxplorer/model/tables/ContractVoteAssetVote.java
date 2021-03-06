/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model.tables;


import io.trxplorer.model.Keys;
import io.trxplorer.model.Tmp;
import io.trxplorer.model.tables.records.ContractVoteAssetVoteRecord;

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
public class ContractVoteAssetVote extends TableImpl<ContractVoteAssetVoteRecord> {

    private static final long serialVersionUID = 349102409;

    /**
     * The reference instance of <code>tmp.contract_vote_asset_vote</code>
     */
    public static final ContractVoteAssetVote CONTRACT_VOTE_ASSET_VOTE = new ContractVoteAssetVote();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ContractVoteAssetVoteRecord> getRecordType() {
        return ContractVoteAssetVoteRecord.class;
    }

    /**
     * The column <code>tmp.contract_vote_asset_vote.id</code>.
     */
    public final TableField<ContractVoteAssetVoteRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>tmp.contract_vote_asset_vote.owner_id</code>.
     */
    public final TableField<ContractVoteAssetVoteRecord, ULong> OWNER_ID = createField("owner_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>tmp.contract_vote_asset_vote.owner_address</code>.
     */
    public final TableField<ContractVoteAssetVoteRecord, String> OWNER_ADDRESS = createField("owner_address", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

    /**
     * The column <code>tmp.contract_vote_asset_vote.vote_asset_id</code>.
     */
    public final TableField<ContractVoteAssetVoteRecord, ULong> VOTE_ASSET_ID = createField("vote_asset_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>tmp.contract_vote_asset_vote</code> table reference
     */
    public ContractVoteAssetVote() {
        this("contract_vote_asset_vote", null);
    }

    /**
     * Create an aliased <code>tmp.contract_vote_asset_vote</code> table reference
     */
    public ContractVoteAssetVote(String alias) {
        this(alias, CONTRACT_VOTE_ASSET_VOTE);
    }

    private ContractVoteAssetVote(String alias, Table<ContractVoteAssetVoteRecord> aliased) {
        this(alias, aliased, null);
    }

    private ContractVoteAssetVote(String alias, Table<ContractVoteAssetVoteRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ContractVoteAssetVoteRecord, ULong> getIdentity() {
        return Keys.IDENTITY_CONTRACT_VOTE_ASSET_VOTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ContractVoteAssetVoteRecord> getPrimaryKey() {
        return Keys.KEY_CONTRACT_VOTE_ASSET_VOTE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ContractVoteAssetVoteRecord>> getKeys() {
        return Arrays.<UniqueKey<ContractVoteAssetVoteRecord>>asList(Keys.KEY_CONTRACT_VOTE_ASSET_VOTE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ContractVoteAssetVoteRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ContractVoteAssetVoteRecord, ?>>asList(Keys.FK_CONTRACT_VOTE_ASSET_VOTE_OWNER_ID, Keys.FK_CONTRACT_VOTE_ASSET_VOTE_VA_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractVoteAssetVote as(String alias) {
        return new ContractVoteAssetVote(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ContractVoteAssetVote rename(String name) {
        return new ContractVoteAssetVote(name, null);
    }
}

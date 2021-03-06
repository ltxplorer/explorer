/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model.tables.daos;


import io.trxplorer.model.tables.ContractAssetIssue;
import io.trxplorer.model.tables.records.ContractAssetIssueRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
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
public class ContractAssetIssueDao extends DAOImpl<ContractAssetIssueRecord, io.trxplorer.model.tables.pojos.ContractAssetIssue, ULong> {

    /**
     * Create a new ContractAssetIssueDao without any configuration
     */
    public ContractAssetIssueDao() {
        super(ContractAssetIssue.CONTRACT_ASSET_ISSUE, io.trxplorer.model.tables.pojos.ContractAssetIssue.class);
    }

    /**
     * Create a new ContractAssetIssueDao with an attached configuration
     */
    public ContractAssetIssueDao(Configuration configuration) {
        super(ContractAssetIssue.CONTRACT_ASSET_ISSUE, io.trxplorer.model.tables.pojos.ContractAssetIssue.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ULong getId(io.trxplorer.model.tables.pojos.ContractAssetIssue object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.ContractAssetIssue> fetchById(ULong... values) {
        return fetch(ContractAssetIssue.CONTRACT_ASSET_ISSUE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public io.trxplorer.model.tables.pojos.ContractAssetIssue fetchOneById(ULong value) {
        return fetchOne(ContractAssetIssue.CONTRACT_ASSET_ISSUE.ID, value);
    }

    /**
     * Fetch records that have <code>owner_id IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.ContractAssetIssue> fetchByOwnerId(ULong... values) {
        return fetch(ContractAssetIssue.CONTRACT_ASSET_ISSUE.OWNER_ID, values);
    }

    /**
     * Fetch records that have <code>owner_address IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.ContractAssetIssue> fetchByOwnerAddress(String... values) {
        return fetch(ContractAssetIssue.CONTRACT_ASSET_ISSUE.OWNER_ADDRESS, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.ContractAssetIssue> fetchByName(String... values) {
        return fetch(ContractAssetIssue.CONTRACT_ASSET_ISSUE.NAME, values);
    }

    /**
     * Fetch records that have <code>total_supply IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.ContractAssetIssue> fetchByTotalSupply(ULong... values) {
        return fetch(ContractAssetIssue.CONTRACT_ASSET_ISSUE.TOTAL_SUPPLY, values);
    }

    /**
     * Fetch records that have <code>trx_num IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.ContractAssetIssue> fetchByTrxNum(UInteger... values) {
        return fetch(ContractAssetIssue.CONTRACT_ASSET_ISSUE.TRX_NUM, values);
    }

    /**
     * Fetch records that have <code>num IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.ContractAssetIssue> fetchByNum(UInteger... values) {
        return fetch(ContractAssetIssue.CONTRACT_ASSET_ISSUE.NUM, values);
    }

    /**
     * Fetch records that have <code>start_time IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.ContractAssetIssue> fetchByStartTime(Timestamp... values) {
        return fetch(ContractAssetIssue.CONTRACT_ASSET_ISSUE.START_TIME, values);
    }

    /**
     * Fetch records that have <code>end_time IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.ContractAssetIssue> fetchByEndTime(Timestamp... values) {
        return fetch(ContractAssetIssue.CONTRACT_ASSET_ISSUE.END_TIME, values);
    }

    /**
     * Fetch records that have <code>decay_ratio IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.ContractAssetIssue> fetchByDecayRatio(UInteger... values) {
        return fetch(ContractAssetIssue.CONTRACT_ASSET_ISSUE.DECAY_RATIO, values);
    }

    /**
     * Fetch records that have <code>vote_score IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.ContractAssetIssue> fetchByVoteScore(Integer... values) {
        return fetch(ContractAssetIssue.CONTRACT_ASSET_ISSUE.VOTE_SCORE, values);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.ContractAssetIssue> fetchByDescription(String... values) {
        return fetch(ContractAssetIssue.CONTRACT_ASSET_ISSUE.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>url IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.ContractAssetIssue> fetchByUrl(String... values) {
        return fetch(ContractAssetIssue.CONTRACT_ASSET_ISSUE.URL, values);
    }

    /**
     * Fetch records that have <code>transaction_id IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.ContractAssetIssue> fetchByTransactionId(ULong... values) {
        return fetch(ContractAssetIssue.CONTRACT_ASSET_ISSUE.TRANSACTION_ID, values);
    }

    /**
     * Fetch records that have <code>abbr IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.ContractAssetIssue> fetchByAbbr(String... values) {
        return fetch(ContractAssetIssue.CONTRACT_ASSET_ISSUE.ABBR, values);
    }
}

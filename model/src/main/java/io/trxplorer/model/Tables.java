/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model;


import io.trxplorer.model.tables.Account;
import io.trxplorer.model.tables.AccountAsset;
import io.trxplorer.model.tables.AccountFrozen;
import io.trxplorer.model.tables.AccountVote;
import io.trxplorer.model.tables.Block;
import io.trxplorer.model.tables.BlockError;
import io.trxplorer.model.tables.BlockResync;
import io.trxplorer.model.tables.ChartDaily;
import io.trxplorer.model.tables.ContractAccountCreate;
import io.trxplorer.model.tables.ContractAccountUpdate;
import io.trxplorer.model.tables.ContractAssetIssue;
import io.trxplorer.model.tables.ContractDeploy;
import io.trxplorer.model.tables.ContractFreezeBalance;
import io.trxplorer.model.tables.ContractParticipateAssetIssue;
import io.trxplorer.model.tables.ContractTransfer;
import io.trxplorer.model.tables.ContractTransferAsset;
import io.trxplorer.model.tables.ContractUnfreezeBalance;
import io.trxplorer.model.tables.ContractVoteAsset;
import io.trxplorer.model.tables.ContractVoteAssetVote;
import io.trxplorer.model.tables.ContractVoteWitness;
import io.trxplorer.model.tables.ContractVoteWitnessMview;
import io.trxplorer.model.tables.ContractVoteWitnessVote;
import io.trxplorer.model.tables.ContractWithdrawBalance;
import io.trxplorer.model.tables.ContractWitnessCreate;
import io.trxplorer.model.tables.ContractWitnessUpdate;
import io.trxplorer.model.tables.Market;
import io.trxplorer.model.tables.Node;
import io.trxplorer.model.tables.SchemaVersion;
import io.trxplorer.model.tables.SyncAccount;
import io.trxplorer.model.tables.SyncBlock;
import io.trxplorer.model.tables.SyncNode;
import io.trxplorer.model.tables.Transaction;
import io.trxplorer.model.tables.TransactionResult;
import io.trxplorer.model.tables.Transfer;
import io.trxplorer.model.tables.VoteLive;
import io.trxplorer.model.tables.VotingRound;
import io.trxplorer.model.tables.VotingRoundStats;
import io.trxplorer.model.tables.VotingRoundVote;
import io.trxplorer.model.tables.VotingRoundVoteLost;
import io.trxplorer.model.tables.Witness;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in tmp
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>tmp.account</code>.
     */
    public static final Account ACCOUNT = io.trxplorer.model.tables.Account.ACCOUNT;

    /**
     * The table <code>tmp.account_asset</code>.
     */
    public static final AccountAsset ACCOUNT_ASSET = io.trxplorer.model.tables.AccountAsset.ACCOUNT_ASSET;

    /**
     * The table <code>tmp.account_frozen</code>.
     */
    public static final AccountFrozen ACCOUNT_FROZEN = io.trxplorer.model.tables.AccountFrozen.ACCOUNT_FROZEN;

    /**
     * The table <code>tmp.account_vote</code>.
     */
    public static final AccountVote ACCOUNT_VOTE = io.trxplorer.model.tables.AccountVote.ACCOUNT_VOTE;

    /**
     * The table <code>tmp.block</code>.
     */
    public static final Block BLOCK = io.trxplorer.model.tables.Block.BLOCK;

    /**
     * The table <code>tmp.block_error</code>.
     */
    public static final BlockError BLOCK_ERROR = io.trxplorer.model.tables.BlockError.BLOCK_ERROR;

    /**
     * The table <code>tmp.block_resync</code>.
     */
    public static final BlockResync BLOCK_RESYNC = io.trxplorer.model.tables.BlockResync.BLOCK_RESYNC;

    /**
     * The table <code>tmp.chart_daily</code>.
     */
    public static final ChartDaily CHART_DAILY = io.trxplorer.model.tables.ChartDaily.CHART_DAILY;

    /**
     * The table <code>tmp.contract_account_create</code>.
     */
    public static final ContractAccountCreate CONTRACT_ACCOUNT_CREATE = io.trxplorer.model.tables.ContractAccountCreate.CONTRACT_ACCOUNT_CREATE;

    /**
     * The table <code>tmp.contract_account_update</code>.
     */
    public static final ContractAccountUpdate CONTRACT_ACCOUNT_UPDATE = io.trxplorer.model.tables.ContractAccountUpdate.CONTRACT_ACCOUNT_UPDATE;

    /**
     * The table <code>tmp.contract_asset_issue</code>.
     */
    public static final ContractAssetIssue CONTRACT_ASSET_ISSUE = io.trxplorer.model.tables.ContractAssetIssue.CONTRACT_ASSET_ISSUE;

    /**
     * The table <code>tmp.contract_deploy</code>.
     */
    public static final ContractDeploy CONTRACT_DEPLOY = io.trxplorer.model.tables.ContractDeploy.CONTRACT_DEPLOY;

    /**
     * The table <code>tmp.contract_freeze_balance</code>.
     */
    public static final ContractFreezeBalance CONTRACT_FREEZE_BALANCE = io.trxplorer.model.tables.ContractFreezeBalance.CONTRACT_FREEZE_BALANCE;

    /**
     * The table <code>tmp.contract_participate_asset_issue</code>.
     */
    public static final ContractParticipateAssetIssue CONTRACT_PARTICIPATE_ASSET_ISSUE = io.trxplorer.model.tables.ContractParticipateAssetIssue.CONTRACT_PARTICIPATE_ASSET_ISSUE;

    /**
     * The table <code>tmp.contract_transfer</code>.
     */
    public static final ContractTransfer CONTRACT_TRANSFER = io.trxplorer.model.tables.ContractTransfer.CONTRACT_TRANSFER;

    /**
     * The table <code>tmp.contract_transfer_asset</code>.
     */
    public static final ContractTransferAsset CONTRACT_TRANSFER_ASSET = io.trxplorer.model.tables.ContractTransferAsset.CONTRACT_TRANSFER_ASSET;

    /**
     * The table <code>tmp.contract_unfreeze_balance</code>.
     */
    public static final ContractUnfreezeBalance CONTRACT_UNFREEZE_BALANCE = io.trxplorer.model.tables.ContractUnfreezeBalance.CONTRACT_UNFREEZE_BALANCE;

    /**
     * The table <code>tmp.contract_vote_asset</code>.
     */
    public static final ContractVoteAsset CONTRACT_VOTE_ASSET = io.trxplorer.model.tables.ContractVoteAsset.CONTRACT_VOTE_ASSET;

    /**
     * The table <code>tmp.contract_vote_asset_vote</code>.
     */
    public static final ContractVoteAssetVote CONTRACT_VOTE_ASSET_VOTE = io.trxplorer.model.tables.ContractVoteAssetVote.CONTRACT_VOTE_ASSET_VOTE;

    /**
     * The table <code>tmp.contract_vote_witness</code>.
     */
    public static final ContractVoteWitness CONTRACT_VOTE_WITNESS = io.trxplorer.model.tables.ContractVoteWitness.CONTRACT_VOTE_WITNESS;

    /**
     * The table <code>tmp.contract_vote_witness_mview</code>.
     */
    public static final ContractVoteWitnessMview CONTRACT_VOTE_WITNESS_MVIEW = io.trxplorer.model.tables.ContractVoteWitnessMview.CONTRACT_VOTE_WITNESS_MVIEW;

    /**
     * The table <code>tmp.contract_vote_witness_vote</code>.
     */
    public static final ContractVoteWitnessVote CONTRACT_VOTE_WITNESS_VOTE = io.trxplorer.model.tables.ContractVoteWitnessVote.CONTRACT_VOTE_WITNESS_VOTE;

    /**
     * The table <code>tmp.contract_withdraw_balance</code>.
     */
    public static final ContractWithdrawBalance CONTRACT_WITHDRAW_BALANCE = io.trxplorer.model.tables.ContractWithdrawBalance.CONTRACT_WITHDRAW_BALANCE;

    /**
     * The table <code>tmp.contract_witness_create</code>.
     */
    public static final ContractWitnessCreate CONTRACT_WITNESS_CREATE = io.trxplorer.model.tables.ContractWitnessCreate.CONTRACT_WITNESS_CREATE;

    /**
     * The table <code>tmp.contract_witness_update</code>.
     */
    public static final ContractWitnessUpdate CONTRACT_WITNESS_UPDATE = io.trxplorer.model.tables.ContractWitnessUpdate.CONTRACT_WITNESS_UPDATE;

    /**
     * The table <code>tmp.market</code>.
     */
    public static final Market MARKET = io.trxplorer.model.tables.Market.MARKET;

    /**
     * The table <code>tmp.node</code>.
     */
    public static final Node NODE = io.trxplorer.model.tables.Node.NODE;

    /**
     * The table <code>tmp.schema_version</code>.
     */
    public static final SchemaVersion SCHEMA_VERSION = io.trxplorer.model.tables.SchemaVersion.SCHEMA_VERSION;

    /**
     * The table <code>tmp.sync_account</code>.
     */
    public static final SyncAccount SYNC_ACCOUNT = io.trxplorer.model.tables.SyncAccount.SYNC_ACCOUNT;

    /**
     * The table <code>tmp.sync_block</code>.
     */
    public static final SyncBlock SYNC_BLOCK = io.trxplorer.model.tables.SyncBlock.SYNC_BLOCK;

    /**
     * The table <code>tmp.sync_node</code>.
     */
    public static final SyncNode SYNC_NODE = io.trxplorer.model.tables.SyncNode.SYNC_NODE;

    /**
     * The table <code>tmp.transaction</code>.
     */
    public static final Transaction TRANSACTION = io.trxplorer.model.tables.Transaction.TRANSACTION;

    /**
     * The table <code>tmp.transaction_result</code>.
     */
    public static final TransactionResult TRANSACTION_RESULT = io.trxplorer.model.tables.TransactionResult.TRANSACTION_RESULT;

    /**
     * The table <code>tmp.transfer</code>.
     */
    public static final Transfer TRANSFER = io.trxplorer.model.tables.Transfer.TRANSFER;

    /**
     * The table <code>tmp.vote_live</code>.
     */
    public static final VoteLive VOTE_LIVE = io.trxplorer.model.tables.VoteLive.VOTE_LIVE;

    /**
     * The table <code>tmp.voting_round</code>.
     */
    public static final VotingRound VOTING_ROUND = io.trxplorer.model.tables.VotingRound.VOTING_ROUND;

    /**
     * The table <code>tmp.voting_round_stats</code>.
     */
    public static final VotingRoundStats VOTING_ROUND_STATS = io.trxplorer.model.tables.VotingRoundStats.VOTING_ROUND_STATS;

    /**
     * The table <code>tmp.voting_round_vote</code>.
     */
    public static final VotingRoundVote VOTING_ROUND_VOTE = io.trxplorer.model.tables.VotingRoundVote.VOTING_ROUND_VOTE;

    /**
     * The table <code>tmp.voting_round_vote_lost</code>.
     */
    public static final VotingRoundVoteLost VOTING_ROUND_VOTE_LOST = io.trxplorer.model.tables.VotingRoundVoteLost.VOTING_ROUND_VOTE_LOST;

    /**
     * The table <code>tmp.witness</code>.
     */
    public static final Witness WITNESS = io.trxplorer.model.tables.Witness.WITNESS;
}

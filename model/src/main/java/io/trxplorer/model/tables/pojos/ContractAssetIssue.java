/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

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
public class ContractAssetIssue implements Serializable {

    private static final long serialVersionUID = 1263916091;

    private ULong     id;
    private ULong     ownerId;
    private String    ownerAddress;
    private String    name;
    private ULong     totalSupply;
    private UInteger  trxNum;
    private UInteger  num;
    private Timestamp startTime;
    private Timestamp endTime;
    private UInteger  decayRatio;
    private Integer   voteScore;
    private String    description;
    private String    url;
    private ULong     transactionId;
    private String    abbr;

    public ContractAssetIssue() {}

    public ContractAssetIssue(ContractAssetIssue value) {
        this.id = value.id;
        this.ownerId = value.ownerId;
        this.ownerAddress = value.ownerAddress;
        this.name = value.name;
        this.totalSupply = value.totalSupply;
        this.trxNum = value.trxNum;
        this.num = value.num;
        this.startTime = value.startTime;
        this.endTime = value.endTime;
        this.decayRatio = value.decayRatio;
        this.voteScore = value.voteScore;
        this.description = value.description;
        this.url = value.url;
        this.transactionId = value.transactionId;
        this.abbr = value.abbr;
    }

    public ContractAssetIssue(
        ULong     id,
        ULong     ownerId,
        String    ownerAddress,
        String    name,
        ULong     totalSupply,
        UInteger  trxNum,
        UInteger  num,
        Timestamp startTime,
        Timestamp endTime,
        UInteger  decayRatio,
        Integer   voteScore,
        String    description,
        String    url,
        ULong     transactionId,
        String    abbr
    ) {
        this.id = id;
        this.ownerId = ownerId;
        this.ownerAddress = ownerAddress;
        this.name = name;
        this.totalSupply = totalSupply;
        this.trxNum = trxNum;
        this.num = num;
        this.startTime = startTime;
        this.endTime = endTime;
        this.decayRatio = decayRatio;
        this.voteScore = voteScore;
        this.description = description;
        this.url = url;
        this.transactionId = transactionId;
        this.abbr = abbr;
    }

    public ULong getId() {
        return this.id;
    }

    public void setId(ULong id) {
        this.id = id;
    }

    public ULong getOwnerId() {
        return this.ownerId;
    }

    public void setOwnerId(ULong ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerAddress() {
        return this.ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ULong getTotalSupply() {
        return this.totalSupply;
    }

    public void setTotalSupply(ULong totalSupply) {
        this.totalSupply = totalSupply;
    }

    public UInteger getTrxNum() {
        return this.trxNum;
    }

    public void setTrxNum(UInteger trxNum) {
        this.trxNum = trxNum;
    }

    public UInteger getNum() {
        return this.num;
    }

    public void setNum(UInteger num) {
        this.num = num;
    }

    public Timestamp getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public UInteger getDecayRatio() {
        return this.decayRatio;
    }

    public void setDecayRatio(UInteger decayRatio) {
        this.decayRatio = decayRatio;
    }

    public Integer getVoteScore() {
        return this.voteScore;
    }

    public void setVoteScore(Integer voteScore) {
        this.voteScore = voteScore;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ULong getTransactionId() {
        return this.transactionId;
    }

    public void setTransactionId(ULong transactionId) {
        this.transactionId = transactionId;
    }

    public String getAbbr() {
        return this.abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ContractAssetIssue (");

        sb.append(id);
        sb.append(", ").append(ownerId);
        sb.append(", ").append(ownerAddress);
        sb.append(", ").append(name);
        sb.append(", ").append(totalSupply);
        sb.append(", ").append(trxNum);
        sb.append(", ").append(num);
        sb.append(", ").append(startTime);
        sb.append(", ").append(endTime);
        sb.append(", ").append(decayRatio);
        sb.append(", ").append(voteScore);
        sb.append(", ").append(description);
        sb.append(", ").append(url);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(abbr);

        sb.append(")");
        return sb.toString();
    }
}

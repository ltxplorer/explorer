/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

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
public class SyncBlock implements Serializable {

    private static final long serialVersionUID = 219655577;

    private ULong     id;
    private ULong     blockNum;
    private Timestamp dateStart;
    private Timestamp dateEnd;
    private Timestamp dateLocked;
    private Integer   nodeId;

    public SyncBlock() {}

    public SyncBlock(SyncBlock value) {
        this.id = value.id;
        this.blockNum = value.blockNum;
        this.dateStart = value.dateStart;
        this.dateEnd = value.dateEnd;
        this.dateLocked = value.dateLocked;
        this.nodeId = value.nodeId;
    }

    public SyncBlock(
        ULong     id,
        ULong     blockNum,
        Timestamp dateStart,
        Timestamp dateEnd,
        Timestamp dateLocked,
        Integer   nodeId
    ) {
        this.id = id;
        this.blockNum = blockNum;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.dateLocked = dateLocked;
        this.nodeId = nodeId;
    }

    public ULong getId() {
        return this.id;
    }

    public void setId(ULong id) {
        this.id = id;
    }

    public ULong getBlockNum() {
        return this.blockNum;
    }

    public void setBlockNum(ULong blockNum) {
        this.blockNum = blockNum;
    }

    public Timestamp getDateStart() {
        return this.dateStart;
    }

    public void setDateStart(Timestamp dateStart) {
        this.dateStart = dateStart;
    }

    public Timestamp getDateEnd() {
        return this.dateEnd;
    }

    public void setDateEnd(Timestamp dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Timestamp getDateLocked() {
        return this.dateLocked;
    }

    public void setDateLocked(Timestamp dateLocked) {
        this.dateLocked = dateLocked;
    }

    public Integer getNodeId() {
        return this.nodeId;
    }

    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SyncBlock (");

        sb.append(id);
        sb.append(", ").append(blockNum);
        sb.append(", ").append(dateStart);
        sb.append(", ").append(dateEnd);
        sb.append(", ").append(dateLocked);
        sb.append(", ").append(nodeId);

        sb.append(")");
        return sb.toString();
    }
}

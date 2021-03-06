/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model.tables.daos;


import io.trxplorer.model.tables.AccountFrozen;
import io.trxplorer.model.tables.records.AccountFrozenRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
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
public class AccountFrozenDao extends DAOImpl<AccountFrozenRecord, io.trxplorer.model.tables.pojos.AccountFrozen, ULong> {

    /**
     * Create a new AccountFrozenDao without any configuration
     */
    public AccountFrozenDao() {
        super(AccountFrozen.ACCOUNT_FROZEN, io.trxplorer.model.tables.pojos.AccountFrozen.class);
    }

    /**
     * Create a new AccountFrozenDao with an attached configuration
     */
    public AccountFrozenDao(Configuration configuration) {
        super(AccountFrozen.ACCOUNT_FROZEN, io.trxplorer.model.tables.pojos.AccountFrozen.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ULong getId(io.trxplorer.model.tables.pojos.AccountFrozen object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.AccountFrozen> fetchById(ULong... values) {
        return fetch(AccountFrozen.ACCOUNT_FROZEN.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public io.trxplorer.model.tables.pojos.AccountFrozen fetchOneById(ULong value) {
        return fetchOne(AccountFrozen.ACCOUNT_FROZEN.ID, value);
    }

    /**
     * Fetch records that have <code>balance IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.AccountFrozen> fetchByBalance(Long... values) {
        return fetch(AccountFrozen.ACCOUNT_FROZEN.BALANCE, values);
    }

    /**
     * Fetch records that have <code>expire_time IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.AccountFrozen> fetchByExpireTime(Timestamp... values) {
        return fetch(AccountFrozen.ACCOUNT_FROZEN.EXPIRE_TIME, values);
    }

    /**
     * Fetch records that have <code>account_id IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.AccountFrozen> fetchByAccountId(ULong... values) {
        return fetch(AccountFrozen.ACCOUNT_FROZEN.ACCOUNT_ID, values);
    }
}

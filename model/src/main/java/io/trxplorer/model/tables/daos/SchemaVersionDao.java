/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model.tables.daos;


import io.trxplorer.model.tables.SchemaVersion;
import io.trxplorer.model.tables.records.SchemaVersionRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class SchemaVersionDao extends DAOImpl<SchemaVersionRecord, io.trxplorer.model.tables.pojos.SchemaVersion, Integer> {

    /**
     * Create a new SchemaVersionDao without any configuration
     */
    public SchemaVersionDao() {
        super(SchemaVersion.SCHEMA_VERSION, io.trxplorer.model.tables.pojos.SchemaVersion.class);
    }

    /**
     * Create a new SchemaVersionDao with an attached configuration
     */
    public SchemaVersionDao(Configuration configuration) {
        super(SchemaVersion.SCHEMA_VERSION, io.trxplorer.model.tables.pojos.SchemaVersion.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(io.trxplorer.model.tables.pojos.SchemaVersion object) {
        return object.getInstalledRank();
    }

    /**
     * Fetch records that have <code>installed_rank IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.SchemaVersion> fetchByInstalledRank(Integer... values) {
        return fetch(SchemaVersion.SCHEMA_VERSION.INSTALLED_RANK, values);
    }

    /**
     * Fetch a unique record that has <code>installed_rank = value</code>
     */
    public io.trxplorer.model.tables.pojos.SchemaVersion fetchOneByInstalledRank(Integer value) {
        return fetchOne(SchemaVersion.SCHEMA_VERSION.INSTALLED_RANK, value);
    }

    /**
     * Fetch records that have <code>version IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.SchemaVersion> fetchByVersion(String... values) {
        return fetch(SchemaVersion.SCHEMA_VERSION.VERSION, values);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.SchemaVersion> fetchByDescription(String... values) {
        return fetch(SchemaVersion.SCHEMA_VERSION.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.SchemaVersion> fetchByType(String... values) {
        return fetch(SchemaVersion.SCHEMA_VERSION.TYPE, values);
    }

    /**
     * Fetch records that have <code>script IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.SchemaVersion> fetchByScript(String... values) {
        return fetch(SchemaVersion.SCHEMA_VERSION.SCRIPT, values);
    }

    /**
     * Fetch records that have <code>checksum IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.SchemaVersion> fetchByChecksum(Integer... values) {
        return fetch(SchemaVersion.SCHEMA_VERSION.CHECKSUM, values);
    }

    /**
     * Fetch records that have <code>installed_by IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.SchemaVersion> fetchByInstalledBy(String... values) {
        return fetch(SchemaVersion.SCHEMA_VERSION.INSTALLED_BY, values);
    }

    /**
     * Fetch records that have <code>installed_on IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.SchemaVersion> fetchByInstalledOn(Timestamp... values) {
        return fetch(SchemaVersion.SCHEMA_VERSION.INSTALLED_ON, values);
    }

    /**
     * Fetch records that have <code>execution_time IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.SchemaVersion> fetchByExecutionTime(Integer... values) {
        return fetch(SchemaVersion.SCHEMA_VERSION.EXECUTION_TIME, values);
    }

    /**
     * Fetch records that have <code>success IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.SchemaVersion> fetchBySuccess(Byte... values) {
        return fetch(SchemaVersion.SCHEMA_VERSION.SUCCESS, values);
    }
}

/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model.tables.daos;


import io.trxplorer.model.tables.Node;
import io.trxplorer.model.tables.records.NodeRecord;

import java.math.BigDecimal;
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
public class NodeDao extends DAOImpl<NodeRecord, io.trxplorer.model.tables.pojos.Node, ULong> {

    /**
     * Create a new NodeDao without any configuration
     */
    public NodeDao() {
        super(Node.NODE, io.trxplorer.model.tables.pojos.Node.class);
    }

    /**
     * Create a new NodeDao with an attached configuration
     */
    public NodeDao(Configuration configuration) {
        super(Node.NODE, io.trxplorer.model.tables.pojos.Node.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ULong getId(io.trxplorer.model.tables.pojos.Node object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.Node> fetchById(ULong... values) {
        return fetch(Node.NODE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public io.trxplorer.model.tables.pojos.Node fetchOneById(ULong value) {
        return fetchOne(Node.NODE.ID, value);
    }

    /**
     * Fetch records that have <code>host IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.Node> fetchByHost(String... values) {
        return fetch(Node.NODE.HOST, values);
    }

    /**
     * Fetch records that have <code>port IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.Node> fetchByPort(Integer... values) {
        return fetch(Node.NODE.PORT, values);
    }

    /**
     * Fetch records that have <code>up IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.Node> fetchByUp(Byte... values) {
        return fetch(Node.NODE.UP, values);
    }

    /**
     * Fetch records that have <code>longitude IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.Node> fetchByLongitude(BigDecimal... values) {
        return fetch(Node.NODE.LONGITUDE, values);
    }

    /**
     * Fetch records that have <code>latitude IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.Node> fetchByLatitude(BigDecimal... values) {
        return fetch(Node.NODE.LATITUDE, values);
    }

    /**
     * Fetch records that have <code>country_code IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.Node> fetchByCountryCode(String... values) {
        return fetch(Node.NODE.COUNTRY_CODE, values);
    }

    /**
     * Fetch records that have <code>country IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.Node> fetchByCountry(String... values) {
        return fetch(Node.NODE.COUNTRY, values);
    }

    /**
     * Fetch records that have <code>city IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.Node> fetchByCity(String... values) {
        return fetch(Node.NODE.CITY, values);
    }

    /**
     * Fetch records that have <code>last_updated IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.Node> fetchByLastUpdated(Timestamp... values) {
        return fetch(Node.NODE.LAST_UPDATED, values);
    }

    /**
     * Fetch records that have <code>date_created IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.Node> fetchByDateCreated(Timestamp... values) {
        return fetch(Node.NODE.DATE_CREATED, values);
    }
}

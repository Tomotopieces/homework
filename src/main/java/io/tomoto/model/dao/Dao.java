package io.tomoto.model.dao;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Set;

/**
 * @author Tomoto
 * <p>
 * 2020/11/24 15:46
 */
public interface Dao<Entity, ID> {
    Connection getConnection();

    String getTableName();

    Logger getLogger();

    Integer create(Entity entity);

    default Integer delete(ID id) throws SQLException {
        StringBuilder command = new StringBuilder("DELETE FROM `").append(getTableName())
                .append("` WHERE `id` = ?");
        return new QueryRunner().update(getConnection(), command.toString(), id);
    }

    Entity read(ID id) throws SQLException;

    Set<Entity> readAll() throws SQLException;

    default Integer update(ID id, String propertyName, Object value) throws SQLException {
        StringBuilder command = new StringBuilder("UPDATE `").append(getTableName())
                .append("` SET `").append(propertyName).append("` = ? WHERE `id` = ?");
        return new QueryRunner().update(getConnection(), command.toString(), value, id);
    }
}

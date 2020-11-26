package io.tomoto.model.dao.impl;

import io.tomoto.model.entity.User;

///**
// * @author Tomoto
// * <p>
// * 2020/11/24 16:04
// */
//public class UserDao implements Dao<User, Integer> {
//    private static final Logger logger = LogManager.getLogger(UserDao.class);
//    private static final String TABLE_NAME = "users";
//    private final Connection connection = JdbcUtils.getConnection();
//
//    @Override
//    public Connection getConnection() {
//        return connection;
//    }
//
//    @Override
//    public String getTableName() {
//        return TABLE_NAME;
//    }
//
//    @Override
//    public Logger getLogger() {
//        return logger;
//    }
//
//    @Override
//    public Integer create(User user) {
//        return null;
//    }
//
//    @Override
//    public Integer delete(Integer id) throws SQLException {
//        StringBuilder command = new StringBuilder("DELETE FROM `").append(getTableName())
//                .append("` WHERE `userId` = ?");
//        return new QueryRunner().update(getConnection(), command.toString(), id);
//    }
//
//    @Override
//    public User read(Integer id) throws SQLException {
//        return new QueryRunner().query(getConnection(), "SELECT * FROM `" + TABLE_NAME + "` WHERE `userId` = ?;",
//                new BeanListHandler<>(User.class), id).iterator().next();
//    }
//
//    public Set<User> readBy(String propertyName, Object value) throws SQLException {
//        StringBuilder command = new StringBuilder("SELECT * FROM `").append(TABLE_NAME)
//                .append("` WHERE `").append(propertyName).append("` = ?;");
//        HashSet<User> result = new HashSet<>(new QueryRunner().query(getConnection(), command.toString(),
//                new BeanListHandler<>(User.class), value));
//        return result;
//    }
//
//    public static void main(String[] args) throws SQLException {
//        Set<User> users = new UserDao().readAll();
//        System.out.println(users);
//    }
//
//    @Override
//    public Set<User> readAll() throws SQLException {
//        return new HashSet<>(new QueryRunner().query(getConnection(), "SELECT * FROM `users`;",
//                new BeanListHandler<>(User.class)));
//    }
//
//    @Override
//    public Integer update(Integer id, String propertyName, Object value) throws SQLException {
//        StringBuilder command = new StringBuilder("UPDATE `").append(getTableName())
//                .append("` SET `").append(propertyName).append("` = ? WHERE `userId` = ?");
//        return new QueryRunner().update(getConnection(), command.toString(), value, id);
//    }
//}
public class UserDao extends BaseDao {
    private static final String TABLE_NAME = "users";

    public User read(Integer id) {
        return queryForOne(User.class, "SELECT * FROM `" + TABLE_NAME + "` WHERE `userId` = ?;", id);
    }

    public User readByAccount(String account) {
        return queryForOne(User.class, "SELECT * FROM `" + TABLE_NAME + "` WHERE `userAccount` = ?;", account);
    }

    public Integer update(Integer id, String propertyName, Object value) {
        return update("UPDATE `" + TABLE_NAME + "` SET `" + propertyName + "` = ? WHERE `userId` = ?;", value, id);
    }
}

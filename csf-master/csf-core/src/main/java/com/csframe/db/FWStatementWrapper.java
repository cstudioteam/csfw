package com.csframe.db;

import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;

import com.csframe.cdi.FWBeanManager;
import com.csframe.db.FWConnection;
import com.csframe.db.FWFullConnectionManager;
import com.csframe.db.FWFullStatement;
import com.csframe.db.FWResultSet;

public class FWStatementWrapper implements FWFullStatement {

  private Statement statement;

  FWStatementWrapper(Statement statement) {
    this.statement = statement;
    FWFullConnectionManager manager = FWBeanManager.getBean(FWFullConnectionManager.class);
    manager.addStatement(this);
  }

  /* ラッパーメソッド */
  @Override
  public <T> T unwrap(Class<T> iface) throws SQLException {

    return statement.unwrap(iface);
  }

  @Override
  public FWResultSet executeQuery(String sql) throws SQLException {

    return new FWResultSetWrapper(statement.executeQuery(sql));
  }

  @Override
  public boolean isWrapperFor(Class<?> iface) throws SQLException {

    return statement.isWrapperFor(iface);
  }

  @Override
  public int executeUpdate(String sql) throws SQLException {

    return statement.executeUpdate(sql);
  }

  @Override
  public void close() throws SQLException {

    statement.close();
  }

  @Override
  public int getMaxFieldSize() throws SQLException {

    return statement.getMaxFieldSize();
  }

  @Override
  public void setMaxFieldSize(int max) throws SQLException {

    statement.setMaxFieldSize(max);
  }

  @Override
  public int getMaxRows() throws SQLException {

    return statement.getMaxRows();
  }

  @Override
  public void setMaxRows(int max) throws SQLException {

    statement.setMaxRows(max);
  }

  @Override
  public void setEscapeProcessing(boolean enable) throws SQLException {

    statement.setEscapeProcessing(enable);
  }

  @Override
  public int getQueryTimeout() throws SQLException {

    return statement.getQueryTimeout();
  }

  @Override
  public void setQueryTimeout(int seconds) throws SQLException {

    statement.setQueryTimeout(seconds);
  }

  @Override
  public void cancel() throws SQLException {

    statement.cancel();
  }

  @Override
  public SQLWarning getWarnings() throws SQLException {

    return statement.getWarnings();
  }

  @Override
  public void clearWarnings() throws SQLException {

    statement.clearWarnings();
  }

  @Override
  public void setCursorName(String name) throws SQLException {

    statement.setCursorName(name);
  }

  @Override
  public boolean execute(String sql) throws SQLException {

    return statement.execute(sql);
  }

  @Override
  public FWResultSet getResultSet() throws SQLException {

    return new FWResultSetWrapper(statement.getResultSet());
  }

  @Override
  public int getUpdateCount() throws SQLException {

    return statement.getUpdateCount();
  }

  @Override
  public boolean getMoreResults() throws SQLException {

    return statement.getMoreResults();
  }

  @Override
  public void setFetchDirection(int direction) throws SQLException {

    statement.setFetchDirection(direction);
  }

  @Override
  public int getFetchDirection() throws SQLException {

    return statement.getFetchDirection();
  }

  @Override
  public void setFetchSize(int rows) throws SQLException {

    statement.setFetchSize(rows);
  }

  @Override
  public int getFetchSize() throws SQLException {

    return statement.getFetchSize();
  }

  @Override
  public int getResultSetConcurrency() throws SQLException {

    return statement.getResultSetConcurrency();
  }

  @Override
  public int getResultSetType() throws SQLException {

    return statement.getResultSetType();
  }

  @Override
  public void addBatch(String sql) throws SQLException {

    statement.addBatch(sql);
  }

  @Override
  public void clearBatch() throws SQLException {

    statement.clearBatch();
  }

  @Override
  public int[] executeBatch() throws SQLException {

    return statement.executeBatch();
  }

  @Override
  public FWConnection getConnection() throws SQLException {

    return new FWConnectionWrapper(statement.getConnection());
  }

  @Override
  public boolean getMoreResults(int current) throws SQLException {

    return statement.getMoreResults(current);
  }

  @Override
  public FWResultSet getGeneratedKeys() throws SQLException {

    return new FWResultSetWrapper(statement.getGeneratedKeys());
  }

  @Override
  public int executeUpdate(String sql, int autoGeneratedKeys) throws SQLException {

    return statement.executeUpdate(sql, autoGeneratedKeys);
  }

  @Override
  public int executeUpdate(String sql, int[] columnIndexes) throws SQLException {

    return statement.executeUpdate(sql, columnIndexes);
  }

  @Override
  public int executeUpdate(String sql, String[] columnNames) throws SQLException {

    return statement.executeUpdate(sql, columnNames);
  }

  @Override
  public boolean execute(String sql, int autoGeneratedKeys) throws SQLException {

    return statement.execute(sql, autoGeneratedKeys);
  }

  @Override
  public boolean execute(String sql, int[] columnIndexes) throws SQLException {

    return statement.execute(sql, columnIndexes);
  }

  @Override
  public boolean execute(String sql, String[] columnNames) throws SQLException {

    return statement.execute(sql, columnNames);
  }

  @Override
  public int getResultSetHoldability() throws SQLException {

    return statement.getResultSetHoldability();
  }

  @Override
  public boolean isClosed() throws SQLException {

    return statement.isClosed();
  }

  @Override
  public void setPoolable(boolean poolable) throws SQLException {

    statement.setPoolable(poolable);
  }

  @Override
  public boolean isPoolable() throws SQLException {

    return statement.isPoolable();
  }

  @Override
  public void closeOnCompletion() throws SQLException {

    statement.closeOnCompletion();
  }

  @Override
  public boolean isCloseOnCompletion() throws SQLException {

    return statement.isCloseOnCompletion();
  }

  @Override
  public long getLargeUpdateCount() throws SQLException {

    return statement.getLargeUpdateCount();
  }

  @Override
  public void setLargeMaxRows(long max) throws SQLException {

    statement.setLargeMaxRows(max);
  }

  @Override
  public long getLargeMaxRows() throws SQLException {

    return statement.getLargeMaxRows();
  }

  @Override
  public long[] executeLargeBatch() throws SQLException {

    return statement.executeLargeBatch();
  }

  @Override
  public long executeLargeUpdate(String sql) throws SQLException {

    return statement.executeLargeUpdate(sql);
  }

  @Override
  public long executeLargeUpdate(String sql, int autoGeneratedKeys) throws SQLException {

    return statement.executeLargeUpdate(sql, autoGeneratedKeys);
  }

  @Override
  public long executeLargeUpdate(String sql, int[] columnIndexes) throws SQLException {

    return statement.executeLargeUpdate(sql, columnIndexes);
  }

  @Override
  public long executeLargeUpdate(String sql, String[] columnNames) throws SQLException {

    return statement.executeLargeUpdate(sql, columnNames);
  }

}

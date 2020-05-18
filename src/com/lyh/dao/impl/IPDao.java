package com.lyh.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.lyh.dao.IIPDao;
import com.lyh.util.DBUtil;

public class IPDao implements IIPDao {

	@Override
	public String load(String ip) {
		String location = null;
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			
			String sql = "select location from t_ip where INET_ATON(?) between  startIPLong and endIPLong";
			statement = connection.prepareStatement(sql);
			statement.setString(1,ip);
			resultSet = statement.executeQuery();
			while(resultSet.next()){
				 location = resultSet.getString("location");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(statement);
			DBUtil.close(connection);
		}
		return location;
	}	
}

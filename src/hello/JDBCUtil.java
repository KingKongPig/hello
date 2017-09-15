package hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUtil {
	private static final String URL="jdbc:oracle:thin:@localhost:1521:ORCL";
	private static final String USER_NAME="system";
	private static final String USER_PASS="123456";
	public static void main(String[] args){
		ResultSet rs=null;
		PreparedStatement pstate;
		Connection conn=null;
		try {
			String sql="select * from stu";
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(URL, USER_NAME, USER_PASS);
			System.out.println(conn);
			pstate=conn.prepareStatement(sql);
			rs=pstate.executeQuery();
			while(rs.next()){
				System.out.println("1:"+rs.getInt(1));
				System.out.println("2:"+rs.getString(2));
			}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}

package sugiim.struts2sample.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import sugiim.struts2sample.entity.Event;

/**
 * EventDAOクラス
 *
 * @author izumiya
 *
 */
public class EventDao extends CommonDao {

	/**
	 * ログ
	 */
	private Log log = LogFactory.getLog(this.getClass());

	/**
	 * Constructor
	 *
	 */
	public EventDao() throws NamingException {

		super();

	}


	/**
	 * 従業員を取得する
	 *
	 * @param id 検索条件id
	 * @return 従業員のリスト
	 */
	public List<Event> selectAll()
			throws Exception {

		log.debug("Eventを取得する");

		boolean idIsExist = false;

//		if (!Common.IsNullOrEmpty()) {
//			idIsExist = true;
//		}

		// 接続コネクション
		Connection con = super.getConnection();
		// Statementオブジェクト
		PreparedStatement pstmt = null;
		// ResultSetオブジェクト
		ResultSet rs = null;

		// Testデータ
		List<Event> list = null;

		try {
			StringBuffer sbSQL = new StringBuffer();
			sbSQL.append("select * from T_EVENT");

//			if (idIsExist) {
//				sbSQL.append(" where employee_id = ?");
//			}

			pstmt = con.prepareStatement(sbSQL.toString());
			//pstmt.setQueryTimeout(CommonDao.getSqlExcuteTimeout());

//			if (idIsExist) {
//				pstmt.setString(1, id);
//			}

			rs = pstmt.executeQuery();

			// Iterate through the data in the result set and display it.
			while (rs.next()) {

				if (list == null) {
					list = new ArrayList<Event>();
				}

				Event evt = new Event();
				evt.setEventId(rs.getInt("event_id"));
				evt.setEventTitle(rs.getString("Title"));
				evt.setEventSubtitle(rs.getString("subtitle"));
				evt.setEventSponsor(rs.getString("sponsor_name"));
				evt.setEventDetail(rs.getString("event_detail"));
				evt.setEventPlace(rs.getString("place"));
				evt.setEventUrl(rs.getString("url"));
				evt.setEventOpenstarttime(rs.getDate("open_start_time"));
				evt.setEventOpenendtime(rs.getDate("open_end_time"));
				evt.setEventAcceptancestarttime(rs.getDate("acceptance_start_time"));
				evt.setEventAcceptanceendtime(rs.getDate("acceptance_end_time"));
				evt.setEventStopflag(rs.getString("stop_flg"));
				evt.setEventDelflag(rs.getString("delete_flg"));
				evt.setEventUpdatetime(rs.getDate("updt_time"));

				list.add(evt);
			}
		}

		finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
				}
			}
		}
		// 結果を返す
		return list;
	}

//	/**
//	 * IDとPASSWORDで従業員を検索する
//	 *
//	 * @param employeeInput 入力従業員
//	 * @return 従業員
//	 * @throws Exception 例外
//	 */
//	public Employee selectByIdAndPassword(Employee employeeInput)
//			throws Exception {
//
//		log.debug("Employeeを取得する(ID and PASSWORD");
//
//		// 接続コネクション
//		Connection con = super.getConnection();
//		// Statementオブジェクト
//		PreparedStatement pstmt = null;
//		// ResultSetオブジェクト
//		ResultSet rs = null;
//
//		// Testデータ
//		Employee result = null;
//
//		try {
//			StringBuffer sbSQL = new StringBuffer();
//			sbSQL.append("select employee_id, employeeName, employee_password, updt_date from T_EMPLOYEE");
//			sbSQL.append(" where employee_id = ? AND employee_password = ?");
//
//			pstmt = con.prepareStatement(sbSQL.toString());
//			//pstmt.setQueryTimeout(CommonDao.getSqlExcuteTimeout());
//
//			pstmt.setString(1, employeeInput.getEmployeeId());
//			pstmt.setString(2, employeeInput.getPassword());
//
//			rs = pstmt.executeQuery();
//
//			// Iterate through the data in the result set and display it.
//			while (rs.next()) {
//
//				result = new Employee();
//				result.setEmployeeId(rs.getString("employee_id"));
//				result.setEmployeeName(rs.getString("employeeName"));
//				result.setPassword(rs.getString("employee_password"));
//				result.setUpdtDate(rs.getDate("updt_date"));
//			}
//		}
//
//		finally {
//			if (rs != null) {
//				try {
//					rs.close();
//				} catch (Exception e) {
//				}
//			}
//			if (pstmt != null) {
//				try {
//					pstmt.close();
//				} catch (Exception e) {
//				}
//			}
//			if (con != null) {
//				try {
//					con.close();
//				} catch (Exception e) {
//				}
//			}
//		}
//		// 結果を返す
//		return result;
//	}
//
//	/**
//	 * 従業員を登録する
//	 *
//	 * @param employee 登録内容
//	 * @return INSERT結果
//	 */
//	public int regist(Employee employee)
//			throws Exception {
//
//		log.debug("従業員を登録する");
//
//		// 接続コネクション
//		Connection con = super.getConnection();
//		// Statementオブジェクト
//		PreparedStatement pstmt = null;
//		// 登録後の結果
//		int rs = 0;
//
//		try {
//
//			String SQL = "INSERT INTO T_EMPLOYEE (employee_id, employeeName, employee_password, updt_date) VALUES (?, ?, ?, ?);";
//
//			pstmt = con.prepareStatement(SQL);
////			pstmt.setQueryTimeout(CommonDao.getSqlExcuteTimeout());
//
//			pstmt.setString(1, employee.getEmployeeId());
//			pstmt.setString(2, employee.getEmployeeName());
//			pstmt.setString(3, employee.getPassword());
//			pstmt.setDate(4, Common.createNewDate());
//
//			// Insert, UpdateはexecuteUpdate
//			rs = pstmt.executeUpdate();
//
//		}
//
//		finally {
//			if (pstmt != null) {
//				try {
//					pstmt.close();
//				} catch (Exception e) {
//				}
//			}
//			if (con != null) {
//				try {
//					con.close();
//				} catch (Exception e) {
//				}
//			}
//		}
//
//		// 結果を返す
//		return rs;
//	}
//
//	/**
//	 * 従業員を更新する
//	 *
//	 * @param employee 更新内容
//	 * @return UPDATE結果
//	 */
//	public int update(Employee employee)
//			throws Exception {
//
//		log.debug("従業員を更新する");
//
//		// 接続コネクション
//		Connection con = super.getConnection();
//		// Statementオブジェクト
//		PreparedStatement pstmt = null;
//		// 更新結果
//		int rs = 0;
//
//		try {
//
//			String SQL = "UPDATE T_EMPLOYEE SET employeeName = ?, employee_password = ?, updt_date = ? WHERE employee_id = ?;";
//
//			pstmt = con.prepareStatement(SQL);
////			pstmt.setQueryTimeout(CommonDao.getSqlExcuteTimeout());
//
//			pstmt.setString(1, employee.getEmployeeName());
//			pstmt.setString(2, employee.getPassword());
//			pstmt.setDate(3, Common.createNewDate());
//			pstmt.setString(4, employee.getEmployeeId());
//
//			// Insert, UpdateはexecuteUpdate
//			rs = pstmt.executeUpdate();
//
//		}
//
//		finally {
//			if (pstmt != null) {
//				try {
//					pstmt.close();
//				} catch (Exception e) {
//				}
//			}
//			if (con != null) {
//				try {
//					con.close();
//				} catch (Exception e) {
//				}
//			}
//		}
//
//		// 結果を返す
//		return rs;
//	}
//
//	/**
//	 * 従業員を削除する
//	 *
//	 * @param employee_id 削除対象ID
//	 * @return 削除結果
//	 */
//	public int delete(String employee_id)
//			throws Exception {
//
//		log.debug("従業員を削除する");
//
//		// 接続コネクション
//		Connection con = super.getConnection();
//		// Statementオブジェクト
//		PreparedStatement pstmt = null;
//		// 削除結果
//		int rs = 0;
//
//		try {
//
//			String SQL = "DELETE FROM T_EMPLOYEE WHERE employee_id = ?;";
//
//			pstmt = con.prepareStatement(SQL);
////			pstmt.setQueryTimeout(CommonDao.getSqlExcuteTimeout());
//
//			pstmt.setString(1, employee_id);
//
//			// Insert, UpdateはexecuteUpdate
//			rs = pstmt.executeUpdate();
//
//		}
//
//		finally {
//			if (pstmt != null) {
//				try {
//					pstmt.close();
//				} catch (Exception e) {
//				}
//			}
//			if (con != null) {
//				try {
//					con.close();
//				} catch (Exception e) {
//				}
//			}
//		}
//
//		// 結果を返す
//		return rs;
//	}

}

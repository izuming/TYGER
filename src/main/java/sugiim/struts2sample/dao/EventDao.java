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
import sugiim.struts2sample.entity.EventDataEntity;

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


	/**
	 * Testデータを取得する
	 *
	 * @param id 検索条件id
	 * @return Eventデータ
	 */
//	public List<EventDataEntity> selectEventData(String id)
	public List<EventDataEntity> selectEventData(int id)
			throws Exception {

		log.debug("Testデータを取得する");

		boolean idIsExist = false;

//		if (!Common.IsNullOrEmpty(id)) {
//		if (id != 0) {
//			idIsExist = true;
//		}

		// 接続コネクション
		Connection con = super.getConnection();
		// Statementオブジェクト
		PreparedStatement pstmt = null;
		// ResultSetオブジェクト
		ResultSet rs = null;

		// Eventデータ
		List<EventDataEntity> list = null;

		try {
			// String SQL = "select person_id, name, age, updt_date from T_Test; ";
			StringBuffer sbSQL = new StringBuffer();
			sbSQL.append("select event_id,title,subtitle,sponsor_name,event_detail,place,url,open_start_time,open_end_time,acceptance_start_time,acceptance_end_time,stop_flg,delete_flg,updt_time from t_event");

			sbSQL.append(" where delete_flg = false ");

//			if (idIsExist) {
				sbSQL.append(" and event_id = ? ");
//			}

//			sbSQL.append(" and acceptance_start_time < ? ");
//			sbSQL.append(" and acceptance_end_time > ? ");

			pstmt = con.prepareStatement(sbSQL.toString());

//			if (idIsExist) {
				pstmt.setInt(1, id);
//			}
//			pstmt.setDate(2, Common.createNewDate());
//			pstmt.setDate(3, Common.createNewDate());

			log.debug(pstmt);

			rs = pstmt.executeQuery();

			// Iterate through the data in the result set and display it.
			while (rs.next()) {

				if (list == null) {
					list = new ArrayList<EventDataEntity>();
				}

				EventDataEntity edEntitiy = null;
				edEntitiy = new EventDataEntity();
//				edEntitiy.setEvent_id(rs.getString("event_id"));
				edEntitiy.setEvent_id(rs.getInt("event_id"));
				edEntitiy.setTitle(rs.getString("title"));
				edEntitiy.setSubtitle(rs.getString("subtitle"));
				edEntitiy.setSponsor_name(rs.getString("sponsor_name"));
				edEntitiy.setEvent_detail(rs.getString("event_detail"));
				edEntitiy.setPlace(rs.getString("place"));
				edEntitiy.setUrl(rs.getString("url"));
				edEntitiy.setOpen_start_time(rs.getString("open_start_time"));
				edEntitiy.setOpen_end_time(rs.getString("open_end_time"));
				edEntitiy.setAcceptance_start_time(rs.getString("acceptance_start_time"));
				edEntitiy.setAcceptance_end_time(rs.getString("acceptance_end_time"));
				edEntitiy.setStop_flg(rs.getString("stop_flg"));
				edEntitiy.setDelete_flg(rs.getString("delete_flg"));
				edEntitiy.setUpdt_time(rs.getString("updt_time"));
				list.add(edEntitiy);
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


}

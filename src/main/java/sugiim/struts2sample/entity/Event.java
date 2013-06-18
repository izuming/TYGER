/**
 *
 */
package sugiim.struts2sample.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * イベントクラス
 *
 * @author izumiya
 *
 */
public class Event implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * イベントID
	 */
	private int eventId;

	/**
	 * タイトル
	 */
	private String eventTitle;

	/**
	 * サブタイトル
	 */
	private String eventSubtitle;

	/**
	 * 主催者名
	 */
	private String eventSponsor;

	/**
	 * イベント詳細
	 */
	private String eventDetail;

	/**
	 * 場所
	 */
	private String eventPlace;

	/**
	 * URL
	 */
	private String eventUrl;

	/**
	 * 開催開始日時
	 */
	private Date eventOpenstarttime;

	/**
	 * 開催終了日時
	 */
	private Date eventOpenendtime;

	/**
	 * 受付開始日時
	 */
	private Date eventAcceptancestarttime;

	/**
	 * 受付終了日時
	 */
	private Date eventAcceptanceendtime;

	/**
	 * 中止フラグ
	 */
	private String eventStopflag;

	/**
	 * 削除フラグ
	 */
	private String eventDelflag;


	/**
	 * 更新日時
	 */
	private Date eventUpdatetime;











	/**
	 * デフォルトコンストラクタ
	 */
	public Event() {
	}

	/**
	 * コンストラクタ
	 *
	 * @param employeeId 従業員ID
	 * @param password パスワード
	 */
	public Event(int eventId, String eventTitle, String eventSubtitle, String eventSponsor, String eventDetail, String eventPlace, String eventUrl, Date eventOpenstarttime, Date eventOpenendtime, Date eventAcceptancestarttime, Date eventAcceptanceendtime, String eventStopflag, String eventDelflag, Date eventUpdatetime) {
		this.eventId = eventId;
		this.eventTitle = eventTitle;
		this.eventSubtitle = eventSubtitle;
		this.eventSponsor = eventSponsor;
		this.eventDetail = eventDetail;
		this.eventPlace = eventPlace;
		this.eventUrl = eventUrl;
		this.eventOpenstarttime = eventOpenstarttime;
		this.eventOpenendtime = eventOpenendtime;
		this.eventAcceptancestarttime = eventAcceptancestarttime;
		this.eventAcceptanceendtime = eventAcceptanceendtime;
		this.eventStopflag = eventStopflag;
		this.eventDelflag = eventDelflag;
		this.eventUpdatetime = eventUpdatetime;
		
	}


//	/* (非 Javadoc)
//	 * @see java.lang.Object#toString()
//	 */
//	@Override
//	public String toString() {
//		return "Employee ["
//				+ (employeeId != null ? "employeeId=" + employeeId + ", " : "")
//				+ (employeeName != null ? "employeeName=" + employeeName + ", "
//						: "")
//				+ (password != null ? "password=" + password + ", " : "")
//				+ (updtDate != null ? "updtDate=" + updtDate : "") + "]";
//	}

	// 以下、getter, setter
	/**
	 * イベントIDを取得する
	 *
	 * @return eventId
	 */
	public int getEventId() {
		return eventId;
	}
	
	/**
	 * イベントIDを設定する
	 *
	 * @param eventId セットする eventId
	 */
	public void setEventId(int eventId) {
		this.eventId=eventId;
	}
	
	
	
//
//	/**
//	 * 従業員IDを設定する
//	 *
//	 * @param employeeId セットする employeeId
//	 */
//	public void setEmployeeId(String employee_id) {
//		this.employeeId = employee_id;
//	}
//
//	/**
//	 * パスワードを取得する
//	 *
//	 * @return password
//	 */
//	public String getPassword() {
//		return password;
//	}
//
//	/**
//	 * パスワードを設定する
//	 *
//	 * @param password セットする password
//	 */
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	/**
//	 * 更新日時を取得する
//	 *
//	 * @return updtDate
//	 */
//	public Date getUpdtDate() {
//		return updtDate;
//	}
//
//	/**
//	 * 更新日時を設定する
//	 *
//	 * @param updtDate セットする updtDate
//	 */
//	public void setUpdtDate(Date updt_date) {
//		this.updtDate = updt_date;
//	}
//
//	/**
//	 * 従業員名称を取得する
//	 *
//	 * @return employeeName
//	 */
//	public String getEmployeeName() {
//		return employeeName;
//	}
//
//	/**
//	 * 従業員名称を設定する
//	 *
//	 * @param employeeName セットする employeeName
//	 */
//	public void setEmployeeName(String employeeName) {
//		this.employeeName = employeeName;
//	}


}

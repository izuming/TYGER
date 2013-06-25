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

	public Event(int eventId, String eventTitle, String eventSubtitle, String eventSponsor, String eventDetail,
			String eventPlace, String eventUrl, Date eventOpenstarttime, Date eventOpenendtime,
			Date eventAcceptancestarttime, Date eventAcceptanceendtime, String eventStopflag, String eventDelflag,
			Date eventUpdatetime) {
		super();
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

	public Event() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

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

	public String getEventTitle() {
		return eventTitle;
	}

	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}

	public String getEventSubtitle() {
		return eventSubtitle;
	}

	public void setEventSubtitle(String eventSubtitle) {
		this.eventSubtitle = eventSubtitle;
	}

	public String getEventSponsor() {
		return eventSponsor;
	}

	public void setEventSponsor(String eventSponsor) {
		this.eventSponsor = eventSponsor;
	}

	public String getEventDetail() {
		return eventDetail;
	}

	public void setEventDetail(String eventDetail) {
		this.eventDetail = eventDetail;
	}

	public String getEventPlace() {
		return eventPlace;
	}

	public void setEventPlace(String eventPlace) {
		this.eventPlace = eventPlace;
	}

	public String getEventUrl() {
		return eventUrl;
	}

	public void setEventUrl(String eventUrl) {
		this.eventUrl = eventUrl;
	}

	public Date getEventOpenstarttime() {
		return eventOpenstarttime;
	}

	public void setEventOpenstarttime(Date eventOpenstarttime) {
		this.eventOpenstarttime = eventOpenstarttime;
	}

	public Date getEventOpenendtime() {
		return eventOpenendtime;
	}

	public void setEventOpenendtime(Date eventOpenendtime) {
		this.eventOpenendtime = eventOpenendtime;
	}

	public Date getEventAcceptancestarttime() {
		return eventAcceptancestarttime;
	}

	public void setEventAcceptancestarttime(Date eventAcceptancestarttime) {
		this.eventAcceptancestarttime = eventAcceptancestarttime;
	}

	public Date getEventAcceptanceendtime() {
		return eventAcceptanceendtime;
	}

	public void setEventAcceptanceendtime(Date eventAcceptanceendtime) {
		this.eventAcceptanceendtime = eventAcceptanceendtime;
	}

	public String getEventStopflag() {
		return eventStopflag;
	}

	public void setEventStopflag(String eventStopflag) {
		this.eventStopflag = eventStopflag;
	}

	public String getEventDelflag() {
		return eventDelflag;
	}

	public void setEventDelflag(String eventDelflag) {
		this.eventDelflag = eventDelflag;
	}

	public Date getEventUpdatetime() {
		return eventUpdatetime;
	}

	public void setEventUpdatetime(Date eventUpdatetime) {
		this.eventUpdatetime = eventUpdatetime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}

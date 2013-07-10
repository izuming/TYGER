package sugiim.struts2sample.entity;

import java.io.Serializable;

/**
 * EventData用Entryクラス
 *
 * @author honda
 *
 */
public class EventDataEntity implements Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;


	/**
	 *  event_id
	 */
//	private String event_id;
	private int event_id;

	/**
	 *  title
	 */
	private String title;

	/**
	 *  subtitle
	 */
	private String subtitle;

	/**
	 *  sponsor_name
	 */
	private String sponsor_name;

	/**
	 *  event_detail
	 */
	private String event_detail;

	/**
	 *  place
	 */
	private String place;

	/**
	 *  url
	 */
	private String url;

	/**
	 *  open_start_time
	 */
	private String open_start_time;

	/**
	 *  open_end_time
	 */
	private String open_end_time;

	/**
	 *  acceptance_start_time
	 */
	private String acceptance_start_time;

	/**
	 *  acceptance_end_time
	 */
	private String acceptance_end_time;

	/**
	 *  stop_flg
	 */
	private String stop_flg;

	/**
	 *  delete_flg
	 */
	private String delete_flg;

	/**
	 *  updt_time
	 */
	private String updt_time;

	/* (非 Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EventDataEntity ["
//				+ (event_id != null ? "event_id=" + event_id + ", " : "")
				+ (event_id != 0 ? "event_id=" + event_id + ", " : "")
				+ (title != null ? "title=" + title + ", " : "")
				+ (subtitle != null ? "subtitle=" + subtitle + ", " : "")
				+ (updt_time != null ? "updt_date=" + updt_time : "") + "]";
	}



	/**
	 * event_idを取得する
	 *
	 * @return event_id
	 */
//	public String getEvent_id() {
	public int getEvent_id() {
		return event_id;
	}

	/**
	 * event_idを設定する
	 *
	 * @param person_id 設定event_id
	 */
//	public void setEvent_id(String event_id) {
//		this.event_id = event_id;
//	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}

	/**
	 * titleを取得する
	 *
	 * @return title
	 */
	public String getTitle() {
		return title;
	}


	/**
	 * titleを設定する
	 *
	 * @param title 設定title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * subtitleを取得する
	 *
	 * @return subtitle
	 */
	public String getSubtitle() {
		return subtitle;
	}

	/**
	 * subtitleを設定する
	 *
	 * @param subtitle 設定subtitle
	 */
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	/**
	 * sponsor_nameを取得する
	 *
	 * @return sponsor_name
	 */
	public String getSponsor_name() {
		return sponsor_name;
	}

	/**
	 * sponsor_nameを設定する
	 *
	 * @param sponsor_name 設定sponsor_name
	 */
	public void setSponsor_name(String sponsor_name) {
		this.sponsor_name = sponsor_name;
	}

	/**
	 * event_detailを取得する
	 *
	 * @return event_detail
	 */
	public String getEvent_detail() {
		return event_detail;
	}

	/**
	 * event_detailを設定する
	 *
	 * @param event_detail 設定event_detail
	 */
	public void setEvent_detail(String event_detail) {
		this.event_detail = event_detail;
	}

	/**
	 * placeを取得する
	 *
	 * @return place
	 */
	public String getPlace() {
		return place;
	}

	/**
	 * placeを設定する
	 *
	 * @param place 設定place
	 */
	public void setPlace(String place) {
		this.place = place;
	}

	/**
	 * urlを取得する
	 *
	 * @return url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * urlを設定する
	 *
	 * @param url 設定url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * open_start_timeを取得する
	 *
	 * @return open_start_time
	 */
	public String getOpen_start_time() {
		return open_start_time;
	}

	/**
	 * open_start_timeを設定する
	 *
	 * @param open_start_time 設定open_start_time
	 */
	public void setOpen_start_time(String open_start_time) {
		this.open_start_time = open_start_time;
	}

	/**
	 * open_end_timeを取得する
	 *
	 * @return open_end_time
	 */
	public String getOpen_end_time() {
		return open_end_time;
	}

	/**
	 * open_end_timeを設定する
	 *
	 * @param open_end_time 設定open_end_time
	 */
	public void setOpen_end_time(String open_end_time) {
		this.open_end_time = open_end_time;
	}

	/**
	 * acceptance_start_timeを取得する
	 *
	 * @return acceptance_start_time
	 */
	public String getAcceptance_start_time() {
		return acceptance_start_time;
	}

	/**
	 * acceptance_start_timeを設定する
	 *
	 * @param acceptance_start_time 設定acceptance_start_time
	 */
	public void setAcceptance_start_time(String acceptance_start_time) {
		this.acceptance_start_time = acceptance_start_time;
	}

	/**
	 * acceptance_end_timeを取得する
	 *
	 * @return acceptance_end_time
	 */
	public String getAcceptance_end_time() {
		return acceptance_end_time;
	}

	/**
	 * acceptance_end_timeを設定する
	 *
	 * @param acceptance_end_time 設定acceptance_end_time
	 */
	public void setAcceptance_end_time(String acceptance_end_time) {
		this.acceptance_end_time = acceptance_end_time;
	}

	/**
	 * stop_flgを取得する
	 *
	 * @return stop_flg
	 */
	public String getStop_flg() {
		return stop_flg;
	}

	/**
	 * stop_flgを設定する
	 *
	 * @param stop_flg 設定stop_flg
	 */
	public void setStop_flg(String stop_flg) {
		this.stop_flg = stop_flg;
	}

	/**
	 * delete_flgを取得する
	 *
	 * @return delete_flg
	 */
	public String getDelete_flg() {
		return delete_flg;
	}

	/**
	 * delete_flgを設定する
	 *
	 * @param delete_flg 設定delete_flg
	 */
	public void setDelete_flg(String delete_flg) {
		this.delete_flg = delete_flg;
	}

	/**
	 * updt_timeを取得する
	 *
	 * @return updt_time
	 */
	public String getUpdt_time() {
		return updt_time;
	}

	/**
	 * updt_timeを設定する
	 *
	 * @param updt_time 設定updt_time
	 */
	public void setUpdt_time(String updt_time) {
		this.updt_time = updt_time;
	}

}
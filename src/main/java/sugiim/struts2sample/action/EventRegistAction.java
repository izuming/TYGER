package sugiim.struts2sample.action;



import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.postgresql.util.PSQLException;

import sugiim.struts2sample.blogic.EventBLogic;
import sugiim.struts2sample.entity.Event;
import sugiim.struts2sample.entity.EventDataEntity;
import sugiim.struts2sample.entity.EventDataInputEntity;

import com.opensymphony.xwork2.ActionSupport;


/**
 * event用Actionクラス
 *
 * @author izumiya
 *
 */
public class EventRegistAction extends ActionSupport {

	/**
	 * ログ
	 */
	private Log log = LogFactory.getLog(EventRegistAction.class);

	/**
	 * シリアル値
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 全件表示用TestDataEntity
	 */
	private Event eventAllDataEntity;

	/**
	 * 表示用eventDataEntityのリスト
	 */
	private List<Event> eventDataEntityList;


	/**
	 * デモ用の暫定リスト
	 */

	private EventDataEntity eventDataEntity;

	private EventDataEntity eventDataEntityTarget;
	
	/**
	 *  検索条件
	 */
	private EventDataInputEntity eventDataInputEntity;




	/**
	 * エラーメッセージ
	 */
	private String inputError;


	/**
	 * 履歴ID
	 */
	private String historyId;


	/**
	 * データを取得する
	 *
	 * @return success
	 * @throws Exception 例外
	 */
	public String selectAllData() throws Exception {

		if (log.isDebugEnabled()) {
			log.debug("****  selectData  ****");
		}

		// イベント一覧の情報を取得する
		EventBLogic blogic = new EventBLogic();

		setEventDataEntityList(blogic.selectTestData());

		if (log.isDebugEnabled()) {
			log.debug("****  selectData End ****");
		}

		// 画面遷移
		return SUCCESS;
	}



	/**
	 * データを取得する
	 *
	 * @return success
	 * @throws Exception 例外
	 */
	public String selectData() throws Exception {

		if (log.isDebugEnabled()) {
			log.debug("****  selectData  ****");
		}

		if (log.isDebugEnabled()) {
			log.debug("テストデータInputの中身:" + eventDataInputEntity.toString());
		}

		// 検索一覧の情報を取得する
		EventBLogic blogic = new EventBLogic();
//		testDataEntity = blogic.selectTestData(testDataInputEntity.getPerson_id());
		List<EventDataEntity> resultList = blogic.selectEventData(eventDataInputEntity.getEvent_id());

		if (resultList == null) {
			addActionError("対象のIDは存在しませんでした。");
			return "input";
		}

		setEventDataEntity(resultList.get(0));

		if (log.isDebugEnabled()) {
			log.debug("****  selectData End ****");
		}

		// 画面遷移
		return SUCCESS;
	}



	public String selectData2() throws Exception {

		if (log.isDebugEnabled()) {
			log.debug("****  selectData2  ****");
		}

		if (log.isDebugEnabled()) {
			log.debug("テストデータInputの中身:" + eventDataInputEntity.toString());
		}

		// 検索一覧の情報を取得する
		EventBLogic blogic = new EventBLogic();
		List<EventDataEntity> resultList = blogic.selectEventData(eventDataInputEntity.getEvent_id());

		if (resultList == null) {
			addActionError("対象のIDは存在しませんでした。");
		}

		setEventDataEntity(resultList.get(0));

		// 画面遷移
		return SUCCESS;
	}


	public String registData() throws Exception {
		
		log.debug("**** registData Start ****");

		EventBLogic blogic = new EventBLogic();
		try {
			eventDataEntityTarget=blogic.registData(eventDataInputEntity);
		} catch (PSQLException e) {
//			addActionError(("invalid.regist.duplicate_id",
//					new int [] { eventDataEntity.getEvent_id() }));
			
			return "input";
		}

		log.debug("**** registData End ****");
		
		
		
		return SUCCESS;
	}
	
	


	public List<Event> getEventDataEntityList() {
		return eventDataEntityList;
	}


	public void setEventDataEntityList(List<Event> eventDataEntityList) {
		this.eventDataEntityList = eventDataEntityList;
	}

	/**
	 * @return eventDataInputEntity
	 */
	public EventDataInputEntity getEventDataInputEntity() {
		return eventDataInputEntity;
	}

	/**
	 * @param eventDataInputEntity セットする eventDataInputEntity
	 */
	public void setEventDataInputEntity(EventDataInputEntity eventDataInputEntity) {
		this.eventDataInputEntity = eventDataInputEntity;
	}



	public Event getEventAllDataEntity() {
		return eventAllDataEntity;
	}



	public void setEventAllDataEntity(Event eventAllDataEntity) {
		this.eventAllDataEntity = eventAllDataEntity;
	}



	public EventDataEntity getEventDataEntity() {
		return eventDataEntity;
	}



	public void setEventDataEntity(EventDataEntity eventDataEntity) {
		this.eventDataEntity = eventDataEntity;
	}



	public EventDataEntity getEventDataEntityTarget() {
		return eventDataEntityTarget;
	}



	public void setEventDataEntityTarget(EventDataEntity eventDataEntityTarget) {
		this.eventDataEntityTarget = eventDataEntityTarget;
	}






}

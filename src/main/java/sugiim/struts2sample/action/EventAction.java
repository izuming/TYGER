package sugiim.struts2sample.action;



import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import sugiim.struts2sample.blogic.EventBLogic;
import sugiim.struts2sample.entity.Event;

import com.opensymphony.xwork2.ActionSupport;
//import sugiim.struts2sample.entity.TestDataEntity;
//import sugiim.struts2sample.entity.TestDataInputEntity;
//import sugiim.struts2sample.blogic.SampleBLogic;
//import sugiim.struts2sample.blogic.SampleBLogic;


/**
 * event用Actionクラス
 *
 * @author izumiya
 *
 */
public class EventAction extends ActionSupport {

	/**
	 * ログ
	 */
	private Log log = LogFactory.getLog(EventAction.class);

	/**
	 * シリアル値
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 表示用TestDataEntity
	 */
	private Event eventDataEntity;

	/**
	 * 表示用eventDataEntityのリスト
	 */
	private List<Event> eventDataEntityList;


	/**
	 *  検索条件
	 */
//	private TestDataInputEntity testDataInputEntity;


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
	public String selectData() throws Exception {

		if (log.isDebugEnabled()) {
			log.debug("****  selectData  ****");
		}

//		if (log.isDebugEnabled()) {
//			log.debug("テストデータInputの中身:" + testDataInputEntity.toString());
//		}

		// 検索一覧の情報を取得する
		EventBLogic blogic = new EventBLogic();
//		testDataEntity = blogic.selectTestData(testDataInputEntity.getPerson_id());
		
//		List<Event> resultList = blogic.selectTestData();
//		
//
//		if (resultList == null) {
//			addActionError("対象のIDは存在しませんでした。");
//			return "input";
//		}


		setEventDataEntityList(blogic.selectTestData());


		if (log.isDebugEnabled()) {
			log.debug("****  selectData End ****");
		}

		// 画面遷移
		return SUCCESS;
	}


	/**
	 * @return eventDataEntity
	 */
	public Event getEventDataEntity() {
		return eventDataEntity;
	}


	/**
	 * @param eventDataEntity セットする eventDataEntity
	 */
	public void setEventDataEntity(Event eventDataEntity) {
		this.eventDataEntity = eventDataEntity;
	}


	public List<Event> getEventDataEntityList() {
		return eventDataEntityList;
	}


	public void setEventDataEntityList(List<Event> eventDataEntityList) {
		this.eventDataEntityList = eventDataEntityList;
	}
}

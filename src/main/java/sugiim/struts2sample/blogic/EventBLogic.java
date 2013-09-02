package sugiim.struts2sample.blogic;

import java.util.Date;
import java.util.List;

import sugiim.struts2sample.dao.EventDao;
import sugiim.struts2sample.entity.Event;
import sugiim.struts2sample.entity.EventDataEntity;

/**
 * @author nttdbs_sugiim
 *
 */
public class EventBLogic {


	/**
	 * TestDataを取得する
	 *
	 * @param id 検索ID
	 * @return 取得したTestDataEntity
	 */
	public List<Event> selectTestData() throws Exception {

		// TestDataを取得する
		EventDao dao = new EventDao();
		return dao.selectAll();

	}
	/**
	 * EventDataを取得する
	 *
	 * @param id 検索ID
	 * @return 取得したEventDataEntity
	 */
//	public List<EventDataEntity> selectEventData(String id) throws Exception {
	public List<EventDataEntity> selectEventData(int id) throws Exception {

		// TestDataを取得する
		EventDao dao = new EventDao();
		return dao.selectEventData(id);

	}
	public EventDataEntity registData(EventDataEntity tdInputEntity) 
			throws Exception {

	// TestDataを登録する
			EventDao dao = new EventDao();
			EventDataEntity tdEntity = new EventDataEntity();

	// 入力BeanからEntityに詰替え
	tdEntity.setEvent_id(tdInputEntity.getEvent_id());
	tdEntity.setTitle(tdInputEntity.getTitle());
	tdEntity.setSubtitle(tdInputEntity.getSubtitle());

	// 更新日付は本日とする
	tdEntity.setUpdt_time(new Date());

	// 登録処理の呼び出し
	dao.registEventData(tdEntity);

	// 入力値を返却
	return tdEntity;
	}


}

package sugiim.struts2sample.blogic;

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


}

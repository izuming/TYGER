<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC
 "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<s:include value="/WEB-INF/jsp/commonHeader.jsp">
<s:param name="addCss"><link href="./css/bootstrap_custom.css" rel="stylesheet" type="text/css"></s:param>
</s:include><%-- /共通Header呼び出し/ --%>

<body>
<s:include value="/WEB-INF/jsp/navbar.jsp"></s:include><%-- /共通navbar呼び出し/--%>
	<div id="mainContainer" class="container">
<div class="row-fluid" style="padding-top:60px"><!-- contents-->
<div class="span1" ></div>
<div class="span10">

	<div class="container-fluid"><!-- information-->
		<div class="well well-large">
			<s:form action="selectEvent!selectData" cssClass="form-search" cssStyle="padding: 0px 5px" >
				<s:if test="hasActionErrors()"><%-- ActionErrorsがある時だけにする --%>
				<div id="div_actionerror" class="alert alert-error">
					<s:actionerror />
				</div></s:if>
				<s:token/>
				<span class="label label-important">ID</span>
				<s:textfield type="text"  name="eventDataInputEntity.event_id"  cssClass="input-medium search-query" placeholder="ID?"  ></s:textfield>
				<s:submit id="search" value="検索" cssClass="btn btn-primary"  action="selectEvent" method="selectData" />
			</s:form>
		</div>
	</div><!-- /information-->

<s:if test="%{eventDataEntity != null}">
	<div class="container-fluid"><!-- information-->
		<table class="table table-bordered table-striped">
			<thead>
				<tr>
					<th>イベントID</th>
					<td><s:property value="eventDataEntity.event_id" /></td>
				</tr>
			</thead>

				<tr>
					<th>タイトル</th>
					<td><s:property value="eventDataEntity.title" /></td>
				</tr>

				<tr>
					<th>サブタイトル</th>
					<td><s:property value="eventDataEntity.subtitle" /></td>
				</tr>
				<tr>
					<th>スポンサー名</th>
					<td><s:property value="eventDataEntity.sponsor_name" /></td>
				</tr>
				<tr>
					<th>イベント詳細</th>
					<td><s:property value="eventDataEntity.event_detail" /></td>
				</tr>
				<tr>
					<th>場所</th>
					<td><a href=https://www.google.co.jp/maps?q=<s:property value="eventDataEntity.place" />&z=17 target="_blank"><s:property value="eventDataEntity.place" /></a></td>
				</tr>
				<tr>
					<th>URL</th>
					<td><a href=<s:property value="eventDataEntity.url" />><s:property value="eventDataEntity.url" /></a></td>
				</tr>
				<tr>
					<th>イベント開始日時</th>
					<td><s:property value="eventDataEntity.open_start_time" /></td>
				</tr>
				<tr>
					<th>イベント終了日時</th>
					<td><s:property value="eventDataEntity.open_end_time" /></td>
				</tr>
				<tr>
					<th>イベント受付開始日時</th>
					<td><s:property value="eventDataEntity.acceptance_start_time" /></td>
				</tr>
				<tr>
					<th>イベント受付終了日時</th>
					<td><s:property value="eventDataEntity.acceptance_end_time" /></td>
				</tr>
				<tr>
					<th>中止フラグ</th>
					<td><s:property value="eventDataEntity.stop_flg" /></td>
				</tr>
				<tr>
					<th>削除フラグ</th>
					<td><s:property value="eventDataEntity.delete_flg" /></td>
				</tr>
				<tr>
					<th>更新日時</th>
					<td><s:property value="eventDataEntity.updt_time" /></td>
				</tr>
			<tbody>
			</tbody>
		</table>
	</div>
</s:if>

</div><!-- contents-->
</div><!-- container -->
</body>
</html>
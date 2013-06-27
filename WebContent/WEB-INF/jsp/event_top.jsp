<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<s:include value="/WEB-INF/jsp/commonHeader.jsp">
<s:param name="addCss"><link href="./css/bootstrap_custom.css" rel="stylesheet" type="text/css"></s:param>
</s:include><%-- /共通Header呼び出し/ --%>
<body>
<s:include value="/WEB-INF/jsp/navbar.jsp"></s:include><%-- /共通navbar呼び出し/--%>
	<div id="mainContainer" class="container">
		<div class="row">
			<div class="span3">
				<ul class="nav nav-list bs-docs-sidenav">
					<li><a href="sample"><i class="icon-chevron-right"></i>Select sample</a></li>
					<li><a href="sample2"><i class="icon-chevron-right"></i>Select Sample(ajax/json)</a></li>
					<li><a href="registSample"><i class="icon-chevron-right"></i>registSample</a></li>
					<li><a href="updateSample"><i class="icon-chevron-right"></i>updateSample</a></li>
					<li><a href="sampleTab"><i class="icon-chevron-right"></i>（おまけ）タブの使い方</a></li>
				</ul>
			</div>
			<div class="span9">
				<div style="margin-top:30px">
					<div class="page-header">
					  <h1>Contents <small>sample... </small></h1>
					</div>

					<ul class="thumbnails">
						<li class="span4">
							<div class="thumbnail">
								<a href="event_top">イベント一覧</a>
								<div class="caption">
								<p>イベント一覧です。</p>
								</div>
							</div>
						</li>
					</ul>


<div class="span10">

	<div class="container-fluid"><!-- information-->
		<div class="well well-large">
			<s:form action="selectEvent!selectData" cssClass="form-search" cssStyle="padding: 0px 5px" >
				<s:if test="hasActionErrors()"><%-- ActionErrorsがある時だけにする --%>
				<div id="div_actionerror" class="alert alert-error">
					<s:actionerror />
				</div></s:if>
				<s:token/>
				<span class="label label-important">イベントID</span>
				<s:textfield type="text"  name="Event.id"  cssClass="input-medium search-query" placeholder="ID?"  ></s:textfield>
				<s:submit id="search" value="検索" cssClass="btn btn-primary"  action="selectEvent" method="selectData" />
			</s:form>
		</div>

	<div class="container-fluid"><!-- information-->
		<table class="table table-bordered table-striped">
			<thead>
				<tr>
					<th>イベントID</th>
					<th>イベント名</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><s:property value="eventDataEntity.eventId" /></td>
					<td><s:property value="eventDataEntity.eventTitle" /></td>
				</tr>
			</tbody>
		</table>
	</div>

	</div><!-- /information-->

<s:if test="%{Event != null}">
	<div class="container-fluid"><!-- information-->
		<table class="table table-bordered table-striped">
			<thead>
				<tr>
					<th>イベントID</th>
					<th>イベント名</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><s:property value="Event.eventId" /></td>
					<td><s:property value="Event.eventTitle" /></td>
				</tr>
			</tbody>
		</table>
	</div>
</s:if>

</div>


				</div>
			</div>
		</div>
	</div>
	</body>
</html>
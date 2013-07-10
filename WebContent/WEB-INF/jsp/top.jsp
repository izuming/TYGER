<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC
 "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<s:include value="/WEB-INF/jsp/commonHeader.jsp"
><s:param name="addCss"><link href="./css/bootstrap_custom.css" rel="stylesheet" type="text/css"></s:param
></s:include><%-- /共通Header呼び出し/ --%>
<body onload="defaultFocus()">

<s:include value="/WEB-INF/jsp/navbarBlank.jsp"></s:include><%-- /共通navbar呼び出し/--%>

<!-- 初期表示時のfocus設定処理。各画面に実装する -->
<script type="text/javascript">
<!--
	// 初期表示時のfocus設定処理
	function defaultFocus() {
		// ※名称が重複していないこと前提
		var focusTarget = document.getElementsByName('employee.employeeId');
		focusTarget[0].focus();
	}
// -->
</script>
	<div id="mainContainer" class="container">
		<div class="span8">

				<!-- 1行目のエリア -->
				<div class="row" style="margin-top:40px">
					<textarea class="span4">1</textarea>
					<textarea class="span4">2</textarea>
					<div class="span4">
					</div>
				</div>

				<!-- 2行目のエリア -->
				<div class="row">
					<textarea class="span4">3</textarea>
				<!-- Button to trigger modal -->
				<a href="#myModal" role="button" class="btn" data-toggle="modal">Launch demo modal</a>

				<!-- 3行目のエリア -->
				<div class="row">
					<a href="login">仮設ログイン</a>
				</div>




<!-- Modal -->
<div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
    <h3 id="myModalLabel">Modal header</h3>
  </div>
  <div class="modal-body">
    <p>One fine body…</p>
  </div>
  <div class="modal-footer">
    <button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
    <button class="btn btn-primary">Save changes</button>
  </div>
</div>
					<div class="span5">
					</div>
				</div>

		</div>

		<div class="span1 navbar divider-vertical"></div>

		<div class="span3 nav nav-list bs-docs-sidenav">
				<!-- 1行目のエリア -->
				<div class="row">
					<textarea class="span4">カレンダー</textarea>
				</div>
		</div>



	</div>


</div>

</body>
</html>
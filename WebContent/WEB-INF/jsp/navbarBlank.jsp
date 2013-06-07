<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"
%><%@ taglib prefix="s" uri="/struts-tags"
%>		<script type="text/javascript">
		<!--
			$(document).ready(function()
			{
				// 初期表示時にもリサイズ処理を呼ぶ
				autoResize();
			});

			// リサイズ時のpadding値調整処理
			var timer = false;

			$(window).resize(function(){

				// リサイズのイベントは短い周期で連続して発生する。
				// リサイズし終わった場合に動作するようにtimerを使う。
				// 時間差になるので、一瞬動くのが気になるようならば「autoRersize()」を呼ぶだけにすれば良い。
				if (timer != false) {
					clearTimeout(timer);
				}

				// 設定したミリ秒毎だけ待つ
				timer = setTimeout(function() {

					autoResize();

				}, 150);

			});

			// navbarの高さによってpadding-topを変更し、リサイズに対応する
			function autoResize() {

				// navbarの高さを取得
				var navHeight = $('#navbar').height();

				// navbarの高さを機能名領域のcss、「padding-top」に設定
				$('#mainContainer').css("padding-top", navHeight);
			}

		// -->
		</script>
		<div id="navbar" class="navbar navbar-fixed-top"><%-- /navbar --%>
			<div class="navbar-inner">
				<div class="container-fluid">
					<a class="brand" href="./">TYGER</a>
					<div align="right" >
<!-- 					<a class="menu" href="login">ろぐいん</a> -->
						<a href="#myModal" role="button" class="menu" data-toggle="modal">ろぐいん</a>
					</div>
				</div>
			</div>
		</div><%-- navbar/ --%>

		<!-- Modal -->

<div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
    <h3 id="myModalLabel">ろぐいん</h3>
  </div>
  <div class="modal-body">
    <p>工事中orz</p>
  </div>
  <div class="modal-footer">
    <button class="btn" data-dismiss="modal" aria-hidden="true">きゃんせる</button>
    <button class="btn btn-primary">ろぐいんする</button>
  </div>
</div>

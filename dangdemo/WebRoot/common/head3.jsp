<%@page contentType="text/html;charset=utf-8"%>
<%  String path = request.getContextPath(); %>
<link href="<%=path %>/css/book_head090107.css" rel="stylesheet" type="text/css" />
<div class="head_container">
	<div class="head_welcome">
		<div class="head_welcome_right">
			<span class="head_welcome_text"> </span>
			<span class="head_welcome_text"> <span class="little_n">
					| <a href="#" name="mydangdang" class="head_black12a">我的当当</a> | <a
					href="#" name="helpcenter" class="head_black12a" target="_blank">帮助</a>
					| </span> </span>
			<div class="cart gray4012">
				<a href='<%=request.getContextPath()%>/shopping?name=-1' >购物车</a>
			</div>
		</div>
		<span class="head_toutext" id="logininfo">
		<b><%=session.getAttribute("Email") %>您好，欢迎光临当当网</b>
		[&nbsp;<a href="<%=path %>/common/login_out.jsp" class="b" >注销</a>]
		</span>
	</div>
	<div class="head_head_list">
		<div class="head_head_list_left">
			<span class="head_logo"><a href="#" name="backtobook"><img
						src="<%=path %>/images/booksaleimg/book_logo.gif" /> </a> </span>
		</div>
		<div class="head_head_list_right">

			<div class="head_head_list_right_b">
			</div>
		</div>
	</div>
	<div class="head_search_div">

	</div>
	<div class="head_search_bg"></div>
</div>

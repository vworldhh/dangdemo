<%@page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
	    <%
	       String path = request.getContextPath(); 
	     %>
		<title>登录 - 当当网</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<link href="<%=path %>/css/login.css" rel="stylesheet" type="text/css" />
		<link href="<%=path %>/css/page_bottom.css" rel="stylesheet" type="text/css" />
       <script>
           function cheaked(){
               var T_name = document.getElementById("txtUsername");
               var T_pwd = document.getElementById("txtPassword");
               if(T_name.value == "" ||T_name.value == null){
                  alert("用户名不能为空！");
                   return false;
               }else if(T_pwd.value == "" || T_pwd.value == null) {
                  alert("密码不能为空！");
                  return false;
                }
                return true;
           }
       
       
        </script>
	</head>
	<body>  
       	<%
			Object o = request.getAttribute("errorMsg");
			if (o!=null) {
				out.println(o);
			}
	 %>
		<%@include file="../common/head1.jsp"%>

		<div class="enter_part">

			<%@include file="../common/introduce.jsp"%>

			<div class="enter_in">
				<div class="bj_top"></div>
				<div class="center">
					<div style="height: 30px; padding: 5px; color: red"
						id="divErrorMssage">

					</div>
					<div class="main">
						<h3>
							登录当当网
						</h3>

						<form method="post" action="<%=path %>/login" id="ctl00">
							<ul>
								<li>
									<span>请输入Email地址：</span>
									<input type="text" name="name" id="txtUsername" class="textbox" />
								</li>
								<li>
									<span class="blank">密码：</span>
									<input type="password" name="password" id="txtPassword"
										class="textbox" />
								</li>
								<li>
									<input type="submit" id="btnSignCheck" class="button_enter"
	                                   value="登 录" onclick = "return cheaked();"/>
								</li>
							</ul>
							<input type="hidden" name="uri" value=" " />
						</form>
					</div>
					<div class="user_new">
						<p>
							您还不是当当网用户？
						</p>
						<p class="set_up">
							<a href="register_form.jsp">创建一个新用户&gt;&gt;</a>
						</p>
					</div>
				</div>
			</div>
		</div>

		<%@include file="../common/foot1.jsp"%>

	</body>
</html>

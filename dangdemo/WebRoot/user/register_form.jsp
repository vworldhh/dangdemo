<%@page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
   <%  String Path =  request.getContextPath(); %>
	  <head>
	
    <title>用户注册 - 当当网</title>
		<link href="<%=Path %>/css/login.css" rel="stylesheet" type="text/css" />
		<link href="<%=Path %>/css/page_bottom.css" rel="stylesheet" type="text/css" />
		<script>
	       function cheack(){
	         
	          var Name = document.getElementById("txtNickName").value;
	          var Email = document.getElementById("txtEmail").value;
	          var Pwd = document.getElementById("txtPassword").value;
	          var rePwd = document.getElementById("txtRepeatPass").value;
	         
	         if(Email == "" || Email == null) {
	              alert("Email不能为空");
	               return false;
	         }else if(!/^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/.test(Email)) {
	              alert("邮箱格式不正确！");
	               return false; 
	         }else if (Name==null || Name == "") {
				 alert("用户名不能为空");
				  return false;
		     }else if (!/^[a-zA-Z][a-zA-Z0-9]{3,7}$/.test(Name)) {
				   alert("用户名必须是4-8个字符，并且只能是字母和数字，数字不能开头");
				   return false;
		     }else if (Pwd==null || rePwd == "") {
			    alert("密码不能为空");
			    return false;
		     } else if (!/^.{2,8}$/.test(Pwd)) {
				 alert("密码必须是4-8个字符");
				return false;
			} else if (Pwd!=rePwd) {
			   alert("密码和重复密码不一样");
			  return false;
		  }
		 
	             
	              
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
		<div class="login_step">
			注册步骤:
			<span class="red_bold">1.填写信息</span> > 2.注册成功
		</div>
		<div class="fill_message">
			<form name="ctl00" method="post" action="<%=Path %>/register"  id="f">
				<h2>
					以下均为必填项
				</h2>
				<table class="tab_login" >
					<tr>
						<td valign="top" class="w1">
							请填写您的Email地址：
						</td>
						<td>
							<input name="email" type="text" id="txtEmail" class="text_input"/>
							<div class="text_left" id="emailValidMsg">
								<p>
									请填写有效的Email地址，在下一步中您将用此邮箱接收验证邮件。
								</p>
									<span id="email.info" style="color:red"></span>
							</div>
						</td>
					</tr>
					<tr>
						<td valign="top" class="w1">
							设置您在当当网的昵称：
						</td>
						<td>
							<input name="nickname" type="text" id="txtNickName" class="text_input" />
							<div class="text_left" id="nickNameValidMsg">
								<p>
									您的昵称可以由小写英文字母、中文、数字组成，
								</p>
								<p>
									长度4－20个字符，一个汉字为两个字符。
								</p>
								<span id="name.info" style="color:red"></span>
							</div>
						</td>
					</tr>
					<tr>
						<td valign="top" class="w1">
							设置密码：
						</td>
						<td>
							<input name="password" type="password" id="txtPassword"
								class="text_input" />
							<div class="text_left" id="passwordValidMsg">
								<p>
									您的密码可以由大小写英文字母、数字组成，长度6－20位。
								</p>
								<span id="password.info" style="color:red"></span>
							</div>
						</td>
					</tr>
					<tr>
						<td valign="top" class="w1">
							再次输入您设置的密码：
						</td>
						<td>
							<input name="password1" type="password" id="txtRepeatPass"
								class="text_input"/>
							<div class="text_left" id="repeatPassValidMsg">
							<span id="password1.info" style="color:red"></span>
							</div>
						</td>
					</tr>
					 
				</table>

				<div class="login_in">
					<input id="btnClientRegister" class="submit" name="submit"  type="submit" value="注 册"  onclick ="return cheack();" />
				</div>
			</form>
		</div>
		<%@include file="../common/foot1.jsp"%>
	</body>
</html>
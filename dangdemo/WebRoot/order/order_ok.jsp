<%@page contentType="text/html;charset=utf-8" import = "function.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>用户注册 - 当当网</title>
		<link href="<%=request.getContextPath()%>/css/login.css" rel="stylesheet" type="text/css" />
		<link href="<%=request.getContextPath()%>/css/page_bottom.css" rel="stylesheet" type="text/css" />
	</head>
	<body>
		&quot;<%@include file="../common/head1.jsp"%>
		<div class="login_step">
			生成订单步骤: 1.确认订单 > 2.填写送货地址 >
			<span class="red_bold">3.订单成功</span>
		</div>
        <%  
           redom  rd = new redom();
            String code = rd.romder();
         
          %>

		<div class="login_success">
			<div class="login_bj">
				<div class="succ">
					<img src="<%=request.getContextPath()%>/images/login_success.jpg" />
				</div>
				<h5>
					订单已经生成
				</h5>
				<h6>
					您刚刚生成的订单号是：<%=code %>，金额总计200
				</h6>

				<ul>
					<li class="nobj">
						您现在可以：
					</li>
					<li>
						<a href="<%=request.getContextPath()%>/index.jsp">继续浏览并选购商品</a>
					</li>
				</ul>
			</div>
		</div>

		<%@include file="../common/foot1.jsp"%>
	</body>
</html>


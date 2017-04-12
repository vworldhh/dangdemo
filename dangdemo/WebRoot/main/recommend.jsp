<%@page contentType="text/html;charset=utf-8"%>
<%@page import="java.util.*"%>
<%@page import="cn.tedu.entity.*"%>

<h2>
	编辑推荐
</h2>
<div id=__bianjituijian/danpin> 
      <%    
			List<Book> allBooks = (List<Book>)request.getAttribute("allBooks");
			if(allBooks != null) {
			for(Book books : allBooks ) {
			 
		%>
	<div class=second_c_02> 
		<div class=second_c_02_b1>
			<div class=second_c_02_b1_1> 
		    <a href='#' target='_blank'><img src="<%=request.getContextPath() %>/productImages/<%=books.getImage() %>" width=70 border=0 /> </a>
			</div>
			<div class=second_c_02_b1_2>
				<h3>
					<a href='#' target='_blank' title='输赢'>书名:<%=books.getName() %></a>
				</h3>
				<h4>
					作者：<%=books.getAuthor() %> 著
					<br />
					出版社：<%=books.getPublish_date() %>&nbsp;&nbsp;&nbsp;&nbsp;出版时间：2006-7-1
				</h4>
				<h5>
					简介:<%=books.getBrief() %>
				</h5>
				<h6>
					定价：￥<%=books.getFixedPrice() %>&nbsp;&nbsp;当当价：￥<%=books.getDangPrice() %>
				</h6>
				<div class=line_xx></div>
			</div>
		</div> 
	 </div>
	<% }%>
	</div>
	<%} %>

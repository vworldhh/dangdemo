<%@page contentType="text/html;charset=utf-8"%> 
<%@page import="java.util.*"%>
<%@page import="cn.tedu.entity.*"%>
<h2>
	<span class="more"><a href="#" target="_blank">更多&gt;&gt;</a> </span>最新上架图书
</h2>
<div class="book_c_04">

	<!--热销图书A开始-->
	 <% 
	 	List<Book> newBooks = (List<Book>)request.getAttribute("newBooks");
	    if(newBooks != null){
	     for(Book book : newBooks) { 
	      
	 %>
	<div class="second_d_wai">
		<div class="img">
			<a href="#" target='_blank'><img
					src="<%=request.getContextPath() %>/productImages/<%=book.getImage() %>" border=0 /> </a>
		</div>
		<div class="shuming">
			<a href="#" target="_blank">书籍标题:<%=book.getName() %></a><a href="#" target="_blank"></a>
		</div>
		<div class="price">
			定价：￥<%=book.getFixedPrice() %>
		</div>
		<div class="price">
			当当价：￥<%=book.getDangPrice() %>
		</div>
		 
	</div>
	   <%} %>
	   <%} %>
	<div class="book_c_xy_long"></div>
	<!--热销图书A结束-->

</div>
<div class="clear"></div>
  
<%@page contentType="text/html;charset=utf-8" import="java.util.*"%>
<%@page import="java.util.*"%>
<%@page import="cn.tedu.entity.*"%>

<div class="book_l_border1" id="__FenLeiLiuLan">
	<div class="book_sort_tushu">
		<h2>
			分类浏览
		</h2>
		
		<% 
			List<Category> allCategorys = (List<Category>)request.getAttribute("allCategorys");
			for(Category category : allCategorys ) {
			List<Category> subCategorys = category.getCategorys();
		%>
		
		<!--1级分类开始-->
			<div class="bg_old" onmouseover="this.className = 'bg_white';"
				onmouseout="this.className = 'bg_old';">
				<h3>
					[<a href='#'><%=category.getName() %></a>]
				</h3>
				<ul class="ul_left_list">

						<!--2级分类开始-->
						<% for (Category subCategory : subCategorys) {%>
						<li>
							<a href='<%=request.getContextPath() %>/main/booklist?id=<%=subCategory.getId()%>'><%=subCategory.getName() %></a>
						</li>
						<%} %>
						<!--2级分类结束-->

				</ul>
				<div class="empty_left">
				</div>
			</div> 
			<div class="more2">
			</div>
			<!--1级分类结束-->
		
		<%
		
		}
		%>

		
	</div>
</div>

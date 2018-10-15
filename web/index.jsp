<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<title>性感小乔在线裸聊</title>
	<link rel="stylesheet" href="resources/element-ui/element-ui.min.css"/>
	<script src="resources/jquery.min.js"></script>
	<script src="resources/vue-resource.min.js"></script>
	<script src="resources/vue.min.js"></script>
	<script src="resources/element-ui/element-ui.min.js"></script>
	<!-- 引入样式 -->
<link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css"/>
<!-- 引入组件库 -->
<script src="https://unpkg.com/element-ui/lib/index.js"></script>
  	<script src="resources/element-ui/lib/umd/locale/zh-CN.js"></script>
	<script src="resources/element-ui/lib/umd/locale/en.js"></script>
	
	<link href="css.css" type="text/css" rel="stylesheet" />
	<style>
		.el-form-item__label {
			text-align: right;
			float: left;
			font-size: 20px;	
			color: #606266;
			line-height: 40px;
			padding: 0 12px 0 0;
			-webkit-box-sizing: border-box;
			box-sizing: border-box;
		}
		.el-table th {
			text-align: center;
			white-space: nowrap;
			overflow: hidden;
			user-select: none;
		}
		
	</style>
</head>
	<body>
		<div class="main">
			<div id="app">
				<div class="header">
					<img class="icon" src="source/title.png"></img>
						<el-menu
					  :default-active="activeIndex2"
					  class="el-menu-demo"
					  mode="horizontal"
					  @select="handleSelect"
					  background-color="#545c64"
					  text-color="#fff"
					  active-text-color="#ffd04b">
					  <el-menu-item index="1">主页</el-menu-item>
					  <el-submenu index="2">
					    <template slot="title">我的聊天室</template>
					    <el-menu-item index="2-1">选项1</el-menu-item>
					    <el-menu-item index="2-2">选项2</el-menu-item>
					    <el-menu-item index="2-3">选项3</el-menu-item>
					    <el-submenu index="2-4">
					      <template slot="title">选项4</template>
					      <el-menu-item index="2-4-1">选项1</el-menu-item>
					      <el-menu-item index="2-4-2">选项2</el-menu-item>
					      <el-menu-item index="2-4-3">选项3</el-menu-item>
					    </el-submenu>
					  </el-submenu>
					  <el-menu-item index="4">在线人员管理</a></el-menu-item>
					</el-menu>
				</div>
				<div class="side">
					<div class="contain1">
						<div class="photo">
							<img src=""></img>
						</div>
						<el-form ref="form" :model="form">
							<el-form-item label="个人昵称">
								<el-input v-model="form.user_name">
								</el-input>
							</el-form-item>
							<el-form-item label="年龄">
								<el-input v-model="form.user_age">
								</el-input>
							</el-form-item>
							<el-form-item label="城市">
								<el-input v-model="form.city">
								</el-input>
							</el-form-item>
							<el-form-item label="自我介绍">
								<el-input v-model="form.desc">
								</el-input>
							</el-form-item>
						</el-form>
					</div>
				</div>
				<div class="frame">
				</div>
			</div>
		</div>
		
		<script type="text/javascript">
			var vm = new Vue({
				el: '#app',
		        data: function() {
					return {
						tableData:[],
						form: {
					          user_id: '',
					          user_age: '',
					          user_city: '',
					          desc: ''
					        },
						searchLabel:"",
				        activeIndex: '1',
				        activeIndex2: '1'
					}
		        },				
				methods: {
					
					search: function() {
						this.getData();
					},
					check: function(row){
						window.location.href  ="/agileStatusQuery/index-detail.html?jobConfId="+row;
					},
					getData: function(){
						var _self = this;
						$.ajax({
							type: "get",
							url: "/login/user/checkin",
							data:{name:_self.userName},
							dataType:"JSON",
							success: function (result) {
								_self.tableData=result;
							},
							error: function (result) {
								_self.tableData=[{id:"idFailed",name:"nameFailed",jobConfId:"jobConfIdFailed"}];
							}
						});
					}
				},
				created:function(){
					this.getData();
				}
		    })
		</script>
	</body>	

</html>
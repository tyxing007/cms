<%@ page contentType="text/css; charset=UTF-8" %>

form, form td {
	font-size:12px;
	font-family:宋体;
}

form input,.field {
	font-family: 宋体;
	font-size: 12px;
	color:#000000;
	width: 100%;
	height: 20px;
	background-color: #FFFFFF;
	border: 1px solid #909090;
	padding: 3px 3px 3px 3px;
	line-height: 12px;
}

form textarea {
	font-family: 宋体;
	font-size: 12px;
	overflow:auto;
	width:100%;
	padding: 3px 3px 3px 3px;
	line-height: 12px;
	border:1 solid #909090;
}
form pre {
	font-size:12px; 
	font-family:宋体;
	line-height:16px;
	margin:0;
	word-wrap:break-word
}

.button {
	color: #000000;
	padding: 3px 6px 3px 6px !important;
	padding: 3px 0px 0px 0px;
	width: auto;
	height: auto;
	border: #9db3c5 1px outset;
	color: #ffffff;
	background-color: #3970c0;
}

.selectButton {
	background-repeat:no-repeat;
	cursor:pointer;
	width:13px;
	background-position: left center;
	background-image: url(<%=request.getContextPath()%>/jeaf/common/img/select.gif)
}

.dropDownButton {
	background-repeat:no-repeat;
	cursor:pointer;
	width:13px;
	background-position: left center;
	background-image: url(<%=request.getContextPath()%>/jeaf/common/img/dropdown.gif)
}

/*触摸屏选择器*/
.touchPicker {
	position: absolute;
	width: 308px; 
	top: 200px;
	left: 200px;
	border: 1px solid #f8f8f8;
	background-color: #ffffff;
	border-radius: 2px;
	-webkit-border-radius: 2px;
	-moz-border-radius: 2px;
	color: #000000;
}
.touchPicker .touchPickerTitle {
	height: 30px;
	line-height: 30px;
	padding-left: 6px;
	border-bottom: 1px solid #33afdd;
}
.touchPicker .pickerBody {
 	line-height: 18px;
}
.touchPicker .touchPickerOkButton, .touchPicker .touchPickerCancelButton {
	 height: 32px;
	 line-height: 32px;
	 text-align: center;
	 border-top: 1px solid #f0f0f0;
}
.touchPicker .touchPickerOkButtonFocus, .touchPicker .touchPickerCancelButtonFocus {
	background-color: #f0f0f0;
}
.touchPicker .touchPickerCancelButton {
 	border-right: 1px solid #f0f0f0;
}

/*触摸屏选择器:列表条目*/
.touchPicker .listItem {
	border-bottom: 1px solid #f0f0f0;
	height: 30px;
	padding: 3px 5px 3px 5px;
}

/*触摸屏选择器:日期选择*/
.touchPicker .datePicker .yearMonthPicker { /*日期选择器:年月表格*/
	background: #fff;
	border: #f0f0f0 1px solid;
	border-bottom-style: none;
}
.touchPicker .datePicker .dayTable, .touchPicker .datePicker .dayTable td { /*日期选择器:“天”表格*/
	border: #f0f0f0 1px solid;
	border-collapse: collapse;
	background-color: #fff;
}
.touchPicker .datePicker .dayTable .selectedDay { /*日期选择器:选中的天*/
	background-color: #33afdd;
}
.touchPicker .datePicker .yearMonthPicker .yearPicker, .touchPicker .datePicker .yearMonthPicker .monthPicker { /*年月选择器*/
	width: 108px;
	height: 28px;
	border: #f0f0f0 1px solid;
}
.touchPicker .datePicker .yearMonthPicker .yearPicker {  /*日期选择器:年选择器*/
	width: 168px;
}
.touchPicker .datePicker .monthPicker .pickerItem { /*日期选择器:年选择器条目*/
	width: 36px;
}
.touchPicker .datePicker .pickerItem { /*日期选择器:年选择器条目*/
	line-height: 28px;
}
.touchPicker .datePicker .selectedPickerItem { /*选中的选择器条目*/
	text-align: center;
	background-image: none;
}

/*触摸屏选择器:数字选择*/
.touchPicker .numberPicker { /*数字选择器*/
	width: 50px;
	height: 105px;
	margin-top: 16px;
	margin-bottom: 16px;
	background-image: url(<%=request.getContextPath()%>/jeaf/common/img/number_picker.png);
	background-repeat: repeat-x;
	border: 1px solid #f0f0f0;
}
.touchPicker .numberPickerSeparator { /*数字分隔符*/
	font-size: 24px;
	padding-left: 6px;
	padding-right: 6px;
}
.touchPicker .numberPicker .pickerItem { /*数字选择器条目*/
	display: block;
	text-align: center;
	font-size: 24px;
	width: 50px;
	height: 35px;
	line-height: 35px;
	color: #ccc;
}
.touchPicker .numberPicker .selectedPickerItem{ /*选中的数字选择器条目*/
	font-size: 24px;
	color: #000;
}

/*日期选择*/
.datePicker .yearMonthPicker { /*日期选择器:年月表格*/
	background: #e6e6e6;
	border: #ddd 1px solid;
	border-bottom-style: none;
}
.datePicker .yearMonthPicker .yearPicker, .datePicker .yearMonthPicker .monthPicker { /*年月选择器*/
	width: 126px;
	height: 24px;
	margin-left: 3px;
	margin-top: 3px;
	margin-bottom: 2px;
	border: 1px solid #ddd;
	background: #fff;
	cursor: pointer;
}
.datePicker .yearMonthPicker .yearPicker {  /*日期选择器:年选择器*/
	width: 168px;
	margin-right: 6px;
}
.datePicker .pickerItem { /*日期选择器:年选择器条目*/
	font-size: 12px;
	line-height: 24px;
	text-align: center;
	width: 42px;
	color: #ccc;
}
.datePicker .yearPicker .pickerItem { /*日期选择器:年选择器条目*/
	width: 56px;
}
.datePicker .selectedPickerItem { /*选中的选择器条目*/
	font-size: 14px;
	color: #000;
}
.datePicker .selectedPickerItem .dropDownButton {
	display: inline-block;
	width: 16px;
	background-position: right center;
	background-repeat: no-repeat;
}
.datePicker .dayTable, .datePicker .dayTable td { /*日期选择器:“天”表格*/
	border: #ddd 1px solid;
	border-collapse: collapse;
	background-color: #fcfcfc;
}
.datePicker .dayTable .week { /*日期选择器:星期*/
	height: 30px;
	font-size: 12px;
	background-color: #eee;
}
.datePicker .dayTable .day { /*日期选择器:天*/
	height: 25px;
	cursor: pointer;
	padding: 3px 5px 3px 5px;
}
.datePicker .dayTable .selectedDay { /*日期选择器:选中的天*/
	background-color: #33afdd;
}
.datePicker .dayTable .today { /*日期选择器:今天*/
	color: red !important;
}
.datePicker .dayTable .weekend { /*日期选择器:周末*/
	color: #0174df;
}

.radio,.checkbox {
	border:none;
	width:13px;
	height:13px;
 	background:''
}
.menubar {
	font-size:12px;
	font-family:宋体;
	position:absolute;
	background-color:white;
	border:1 outset white;
	width:100px;
 	cursor:hand
 }
 
.menunormal {
	font-size:12px;
	font-family:宋体;
	background:'';
	color:black;
	border:1 solid white;
	height:22
}

.menuover {
	font-size:12px;
	font-family:宋体;
	border:1 solid white;
	background:#647EB9;
	color:white;
	height:22
}

.listbar {
	background-color: white;
	border: #666 1px solid;
	cursor: pointer;
	margin: 0px;
	font-size: 12px;
	font-family: 宋体;
	display :block;
	position: absolute;
	outline:none;
	top: 0px;
    bottom: 0px;
    left: 0px;
    right: 0px;
    /*ie6*/
    width: expression(document.documentElement.clientWidth - 2);
    height: expression(document.documentElement.clientHeight - 2);
}

.listnormal {
	font-size: 12px;
	background:'';
	color:black;
	border:1 solid white;
	height:22
}
.listover {
	font-size: 12px;
	font-family:宋体;
	border:1 solid white;
	background:#647EB9;
	color:white;
	height:22
}

form a:link {
	font-size: 12px;
	font-family:宋体;
	text-decoration: none;
	font-weight: none;
	color: #000000;
}

form a:hover {
	font-size: 12px;
	font-family:宋体;
	font-weight: none;
	text-decoration: none;
	color: #000000;
}

form a:visited {
	font-size: 12px;
	font-family:宋体;
	font-weight: none;
	text-decoration: none;
	color: #000000;
}

/*图片按钮*/
.imgButtonLeftNormal, .imgButtonLeftOver {
	cursor:pointer;
	width:4px;
	height:24px;
	line-height:12px;
	background-image:url(<%=request.getContextPath()%>/jeaf/form/img/button_left.gif);
	background-repeat:no-repeat;
	background-position: right top;
	border-width: 0px;
	font-size: 12px;
	font-weight:bold;
	padding-top:6px;
}
.imgButtonMiddleNormal, .imgButtonMiddleOver {
	cursor:pointer;
	height:24px;
	line-height:12px;
	background-image:url(<%=request.getContextPath()%>/jeaf/form/img/button_center.gif);
	background-repeat:repeat-x;
	color:#ffffff;
	font-size: 12px;
	font-weight:bold;
	border-width:0px;
	padding-top:6px;
	padding-left:5px;
	padding-right:5px;
}
.imgButtonRightNormal, .imgButtonRightOver {
	cursor:pointer;
	width:4px;
	height:24px;
	line-height:12px;
	background-image:url(<%=request.getContextPath()%>/jeaf/form/img/button_right.gif);
	background-repeat:no-repeat;
	border-width: 0px;
	font-size: 12px;
	font-weight:bold;
	padding-top:6px;
}

.forumTable {
	border: #9db3c5 1px solid;
	line-height: 20px;
}

.forumLogin {
	border: #9db3c5 1px solid;
	line-height: 20px;
	background-color: f5faff;
}

.categoryHeader {
	background-color: #3970c0;
	line-height: 20px;
	font-weight: bold;
	color: #ffffff;
}

.forumHeader {
	background-color: #e8f3fd;
	line-height: 20px;
	border-top: #9db3c5 1px solid;
	font-weight: bold;
}

.forumName {
	font-weight: bold;
}

.forum {
	line-height: 20px;
	border-top: #9db3c5 1px solid;
	background-color: f5faff
}

.viewPackage {line-height:12px}
.viewActionAndSearchBar{height:36px; 
						width:100%;
						background-color: #f5faff;
						border:1 solid #dbdce3;}
.viewPageAndCategoryBar{height:32px; width:100%; padding-top:5px; border:1 solid #dbdce3; border-top-style:none; border-bottom-style:none;}
.viewPageAndCategoryBottomBar{}

/*视图操作相关*/
.viewActionBar{padding-left:5px; float:left; margin-top: 5px}
.viewActionTextNormal, .viewActionTextOver {
	cursor: pointer;
	padding: 4px 4px 4px 4px;
	border: #9db3c5 1px outset;
	color: #ffffff;
	background-color: #3970c0;
	display: inline-block;
}
.viewActionSpace{width:10px}
.printAsExcelImage, .viewCustomImage, .printAsExcelText, .viewCustomText {display: none;}
.viewActionBar {float:left; width: 300px;}
.viewSearchBar {float: right;}

/*视图定位相关*/
.viewLocationBar{height:32px; width:100%; padding-top:5px; border:1 solid #dbdce3; border-top-style:none; border-bottom-style:none;}
.viewLocationHeader{padding-left:3px;}
.viewLocationText{color:#000000}
.viewLocationSeparateImage{}
.viewLocationSeparateText{padding-left:1px; padding-right:1px;}

/*视图相关*/
.view{border: #9db3c5 1px solid;}
.view pre{font-size:12px; font-family:宋体;line-height:16px;margin:0;word-wrap:break-word}
.viewHeader{height:30px; background-color:#30589c; color:#ffffff; font-weight:bold}
.viewData{line-height: 20px; border-top: #9db3c5 1px solid; background-color: #f5faff;}
.viewData select {width: 100%}
.viewSortAsc{width:10px; height:10px; background-repeat:no-repeat; background-image: url(<%=request.getContextPath()%>/jeaf/view/images/sort_asc.gif);}
.viewSortDesc{width:10px; height:10px; background-repeat:no-repeat; background-image: url(<%=request.getContextPath()%>/jeaf/view/images/sort_desc.gif);}

/*视图搜索相关*/
.viewSearchBar{padding-right:5px; float:right;}
.searchCondition{padding-top:6px;}
.searchConditionInput{padding-left:3px; padding-top:3px; width:120px;height:20px;border-style:solid; border-width:1px ;border-left-color:#6880a0;border-top-color:#6880a0;border-right-color:#6880a0;border-bottom-color:#6880a0}
.searchButtonImage{}
.searchButtonText{padding-top:12px; padding-left:5px; color:#000000}
.advanceSearchButtonImage{}
.advanceSearchButtonText{padding-top:12px; padding-left:5px; color:#000000}
.finishSearchButtonImage{}
.finishSearchButtonText{padding-top:12px; padding-left:5px; color:#000000}

/*页面信息相关*/
.viewPageBar{padding:3px 0px 0px 5px}
.viewRecordCount{padding-top:5px; padding-right:5px;}
/*第一页*/
.firstPageLinkImage{width:16px;
					height:22px;
					background-image: url(<%=request.getContextPath()%>/jeaf/view/images/firstpage.gif);
					background-repeat:no-repeat;
					background-position:3px 5px;}
.firstPageLinkText{padding-top:5px; display:none}
.firstPageLinkImageDisable{width:16px;
						   height:22px;
						   background-image: url(<%=request.getContextPath()%>/jeaf/view/images/firstpage_disable.gif);
						   background-repeat:no-repeat;
						   background-position:3px 5px;}
.firstPageLinkTextDisable{padding-top:5px; display:none}
/*上一页*/
.previousPageLinkImage{width:16px;
					height:22px;
					background-image: url(<%=request.getContextPath()%>/jeaf/view/images/previouspage.gif);
					background-repeat:no-repeat;
					background-position:3px 5px;}
.previousPageLinkText{padding-top:5px; display:none}
.previousPageLinkImageDisable{width:16px;
					height:22px;
					background-image: url(<%=request.getContextPath()%>/jeaf/view/images/previouspage_disable.gif);
					background-repeat:no-repeat;
					background-position:3px 5px;}
.previousPageLinkTextDisable{padding-top:5px; display:none}
/*下一页*/
.nextPageLinkImage{width:16px;
					height:22px;
					background-image: url(<%=request.getContextPath()%>/jeaf/view/images/nextpage.gif);
					background-repeat:no-repeat;
					background-position:3px 5px;}
.nextPageLinkText{padding-top:5px;display:none}
.nextPageLinkImageDisable{width:16px;
					height:22px;
					background-image: url(<%=request.getContextPath()%>/jeaf/view/images/nextpage_disable.gif);
					background-repeat:no-repeat;
					background-position:3px 5px;}
.nextPageLinkTextDisable{padding-top:5px; display:none}
/*最后一页*/
.lastPageLinkImage{width:16px;
					height:22px;
					background-image: url(<%=request.getContextPath()%>/jeaf/view/images/lastpage.gif);
					background-repeat:no-repeat;
					background-position:3px 5px;}
.lastPageLinkText{padding-top:5px; display:none}
.lastPageLinkImageDisable{width:16px;
					height:22px;
					background-image: url(<%=request.getContextPath()%>/jeaf/view/images/lastpage_disable.gif);
					background-repeat:no-repeat;
					background-position:3px 5px;}
.lastPageLinkTextDisable{padding-top:5px; display:none}
/*页跳转*/
.pageNumber{}
.pageNumberInput{width:50px;height:18px;text-align:center;padding-top:2px;border-style:solid; border-width:1px ;border-left-color:#dbdce3;border-top-color:#dbdce3;border-right-color:#dbdce3;border-bottom-color:#dbdce3}
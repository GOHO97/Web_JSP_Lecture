function goBoardContentPage(no){
	location.href = "BoardContentPageController?boardNum=" + no;
	
}

function reWriteDelete(no){
	var really = confirm("������ �����Ͻðڽ��ϱ�?");
	if(really){
		location.href = "ReWController?reBoardNum=" + no;
	}
}
function goBoardContentPage(no){
	location.href = "BoardContentPageController?boardNum=" + no;
	
}

function reWriteDelete(no){
	var really = confirm("정말로 삭제하시겠습니까?");
	if(really){
		location.href = "ReWController?reBoardNum=" + no;
	}
}
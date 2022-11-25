create table boardWrite (
	b_no number(3) primary key,
	b_title varchar2(20 char) not null,
	b_content varchar2(200 char) not null,
	b_when date not null 
);

create sequence boardWrite_seq;

insert into boardWrite values(boardWrite_seq.nextval, '제목', '내용', sysdate);

select * from boardWrite;

select count(*) from boardWrite;

게시판 나올 때 마다 셀 필요가 있는가?
처음 한번만 세어놓고, 그 다음 부터는 직접 세도 될텐데


rownum
	select 할 때마다 부여되는 가상 필드
	order by 보다 먼저 써야한다.
	
	
select * 
	from(select rownum as rn, b_no, b_title, b_when 
		from(select rownum, b_no, b_title, b_when 
			from boardWrite order by b_when desc))where rn >= 2 and rn <= 9;

select b_no, b_title, b_content, b_when from boardWrite where b_no = 3;

delete from boardWrite where b_no = ?

update boardWrite set b_title = ?, b_content = ? where b_no = ?
create table boardWrite (
	b_no number(3) primary key,
	b_title varchar2(20 char) not null,
	b_content varchar2(200 char) not null,
	b_when date not null 
);

create sequence boardWrite_seq;

insert into boardWrite values(boardWrite_seq.nextval, '����', '����', sysdate);

select * from boardWrite;

select count(*) from boardWrite;

�Խ��� ���� �� ���� �� �ʿ䰡 �ִ°�?
ó�� �ѹ��� �������, �� ���� ���ʹ� ���� ���� ���ٵ�


rownum
	select �� ������ �ο��Ǵ� ���� �ʵ�
	order by ���� ���� ����Ѵ�.
	
	
select * 
	from(select rownum as rn, b_no, b_title, b_when 
		from(select rownum, b_no, b_title, b_when 
			from boardWrite order by b_when desc))where rn >= 2 and rn <= 9;

select b_no, b_title, b_content, b_when from boardWrite where b_no = 3;

delete from boardWrite where b_no = ?

update boardWrite set b_title = ?, b_content = ? where b_no = ?
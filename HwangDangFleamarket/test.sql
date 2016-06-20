

CREATE TABLE  memberTest (

	member_id varchar2(30) primary key ,
	member_password  varchar2(20)  NOT NULL,
	member_name  varchar2(18)  NOT NULL,
	member_phone  char(18)  NOT NULL,
	member_zipcode  varchar2(18)  NOT NULL,
	member_address  varchar2(18)  NOT NULL,
	member_sub_address  varchar2(18)  NOT NULL,
	member_assign  number(1)  NOT NULL
)

SELECT * FROM ADMIN_QNA

SELECT  admin_qna_no ,
		admin_qna_title ,
		admin_qna_content ,
		admin_qna_writer ,
		admin_qna_date ,
		admin_qna_hit ,
		admin_qna_published 			
FROM  admin_qna
Order By admin_qna_no DESC;

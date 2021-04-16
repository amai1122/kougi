DML文
練習問題8_1
INSERT INTO member (member_id ,name ,furigana ,email ,birthday ,seibetsu,zipcd ,prefecture ,city ,oaddress,tel)VALUES('00100','天井規人','アマイノリヒト','amai@test.jp',1977-11-22,1,'999-999','静岡県','浜北区','小松xx-xx','090-0990-0999');

練習問題8_2
UPDATE member SET tel = '00-0000-0000' WHERE member_id='00100';

練習問題8_3
DELETE FROM member WHERE member_id='00100';
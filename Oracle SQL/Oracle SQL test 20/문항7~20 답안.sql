--7�� ���� : ��ȭ��ȣ�� ���� ���� �������� ������ �˻��ϼ���.
SELECT name
FROM gogek
WHERE tel is null;

--8�� ���� : ȫ�� ���� ���� ������ ������ �˻��ϼ���.
SELECT *
FROM gogek
WHERE name like 'ȫ%';

--9�� ���� : babo2222 ������ �ڱ浿���� �����ϼ���
UPDATE gogek SET name='�ڱ浿' where id='babo2222';

--10�� ���� : ���̵� 123 ���� ���̵� babo123 ���� �����ϼ���
UPDATE gogek SET id='babo123' where id='123';

--11�� ���� : ���浿���� ��ȭ��ȣ 02-555-5555�� �߰��ϼ���
UPDATE gogek SET tel='02-555-5555' where name='���浿';

--12�� ���� : ��ǰ��ȣ B00009 �� ���� 1200�� �׸��� "�̳� �ٽ��� ���Դϴ�"��� ��ǰ������ �߰��ϼ���.
UPDATE sangpum SET price=70, detail='�̳� �ٽ��� ���Դϴ�' where no='B00009';

--13�� ���� : �̻۹��� ��ǰ�� 10���� �ȷȽ��ϴ�.
UPDATE sangpum SET count=nvl(count,0)-10 where title='�̻۹���';

--14�� ���� : Z00001 ��ǰ�� 3���� �� �԰� �Ǿ����ϴ�.
UPDATE sangpum SET count=nvl(count,0)+3 where No='Z00001';

--15�� ���� : 11�� ���Ŀ� �ֹ��� ��ǰ ��ȣ�� �˻��ϼ���
SELECT sangpum
FROM jumun
WHERE jumunil>'2016/11/01' ;

--16�� ���� : babo ���� �ֹ��� ��ǰ�� A00002�� �����ϰ� ������ 2���� �����ϼ���
UPDATE jumun 
SET sangpum='A00002', count=nvl(count,0)+2 
WHERE gogek='babo';

--17�� ���� : babo1234 ���� 11���� �ֹ��� ��ǰ ��ȣ�� �˻��ϼ���
SELECT sangpum
FROM jumun
WHERE gogek='babo1234' and Jumunil>'2016/11';

--18�� ���� : ���� ���׵��� ��� ������ ���� �� ���̺� ����� �����Ͻÿ�.
SELECT *
FROM gogek;


--19�� ���� : ���� ���׵��� ��� ������ ���� ��ǰ ���̺� ����� �����Ͻÿ�.
SELECT *
FROM sangpum;

--20�� ���� : ���� ���׵��� ��� ������ ���� �ֹ� ���̺� ����� �����Ͻÿ�.
SELECT *
FROM jumun;
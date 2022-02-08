SELECT employee_id, first_name, last_name, phone_number FROM employees 
WHERE salary=3000;
-- -> FULL SCAN COST(3)

SELECT employee_id, first_name, last_name, phone_number FROM employees 
WHERE employee_id=8000;

CREATE INDEX emp_sal_ix ON employees(salary);
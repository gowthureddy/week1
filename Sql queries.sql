SELECT * FROM transcation.customer;
ALTER table transcation.customer add column lastname VARCHAR(45);
Select * from transcation.customer;
/*1)Write a query to display account number, customer�s number, customer�s firstname,lastname,account opening date.
Display the records sorted in ascending order based on account number.*/
SELECT account_number,customer_number,firstname,lastname,date FROM customer  ORDER BY account_number;

/*2).Write a query to display the number of customer�s from Chennai. Give the count an alias name of Cust_Count.
SELECT count(customer_number) Cust_Count*/
SELECT count(customer_number) Cust_Count FROM transcation.customer WHERE city='CHENNAI';

/*3)Write a query to display  the customer number, customer firstname,account number for the customer�s whose accounts were created after 15th of any month.
Display the records sorted in ascending order based on customer number and then by account number.*/
SELECT  customer_number, firstname, account_number FROM transcation.customer  WHERE extract(day from date)>15 ORDER BY customer_number, account_number ;

/*4)Write a query to display the number of customers who have registration but no account in the bank.
Give the alias name as Count_Customer for number of customers.*/
SELECT count(customer_number) Count_Customer FROM transcation.customer WHERE customer_number NOT IN (SELECT customer_number FROM transcation.account);

/*5)Write a query to display the customer�s firstname who have multiple accounts (atleast  2 accounts).  Display the records sorted in ascending order based on customer's firstname.*/
SELECT firstname FROM transcation.customer INNER JOIN transcation.account ON transcation.customer.customer_number=transcation.account.customer_number GROUP BY firstname having count(firstname)>=2 order by firstname; 



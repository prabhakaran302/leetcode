# Write your MySQL query statement below'
select A.Name from Employee A where A.Id in 
(select B.ManagerId from Employee B group by ManagerId having count(*)  >= 5)

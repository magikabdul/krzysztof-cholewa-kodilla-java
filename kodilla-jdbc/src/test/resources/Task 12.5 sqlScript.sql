SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS NUMBER_OF_POSTS
FROM USERS U, POSTS P
WHERE U.ID = P.USER_ID
group by  u.id
HAVING COUNT(*) >= 2;
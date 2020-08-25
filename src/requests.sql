# Получение пароля по имени пользователя
SELECT Password
FROM users.auth
WHERE Name = "<Name>";


# Получение количества очков конкретного пользователя
SELECT Count 
FROM users.leads
WHERE Name = "<Name>";

# Изменение количества очков конкретного пользователя
UPDATE users.leads
SET Count=<score>
WHERE Name = "<Name>";


# Проверка наличия слова в лексиконе
SELECT EXISTS(
         SELECT *
         FROM lexicon.<Name>
         WHERE word = ?)


# Добавление слова в лексикон
INSERT INTO lexicon.<Name>
VALUES('<word>')

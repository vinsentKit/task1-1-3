# task1-1-3
реализация задачи JDBC и Hibernate

# PostgreSQL
my_postgres_db — имя контейнера
postgres — имя образа
5434:5432 — маппинг портов
mysecretpassword — пароль

# команда для докера
$ docker run --name my_postgres_db -e POSTGRES_PASSWORD=mysecretpassword -d -p 5434:5432 postgres

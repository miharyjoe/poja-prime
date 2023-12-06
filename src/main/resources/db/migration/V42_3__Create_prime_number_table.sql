CREATE TABLE IF NOT EXISTS prime_number
(
  id varchar
  constraint prime_number_pk primary key,
  prime_number DECIMAL NULL,
  created_at   timestamp without time zone default current_date
  );
--DROP TABLE users IF EXISTS;

CREATE TABLE users (
  id         INTEGER PRIMARY KEY,
  name VARCHAR(30),
  role  VARCHAR(50)
);

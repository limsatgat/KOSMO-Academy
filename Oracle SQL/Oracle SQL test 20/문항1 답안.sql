CREATE TABLE gogek (
    id      char(8),
    name    varchar2(15) NOT NULL,
    tel     char(13),        --하이픈(-)포함
    CONSTRAINT pk_gogke_id PRIMARY KEY(id)
);


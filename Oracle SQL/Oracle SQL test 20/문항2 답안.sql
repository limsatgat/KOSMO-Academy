CREATE TABLE sangpum (
    No      char(6),
    title    varchar2(100),
    Detail   varchar2(200),
    Count   number(38) NOT NULL,
    Price   number(38),
    CONSTRAINT pk_sangpum_No PRIMARY KEY(No)
);


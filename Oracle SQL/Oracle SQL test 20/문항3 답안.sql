CREATE TABLE jumun (
    No      number(4),
    gogek   char(8),
    Sangpum   char(6),
    Count   number(38),
    Jumunil varchar2(10),
    CONSTRAINT pk_jumun_No PRIMARY KEY(No),
    CONSTRAINT fk_gogek FOREIGN KEY (gogek) REFERENCES gogek(id),
    CONSTRAINT fk_sangpum FOREIGN KEY (Sangpum) REFERENCES sangpum(No)
);
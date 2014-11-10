CREATE TABLE TABLE_SOURCE 
(
  ID NUMBER NOT NULL 
, DESCRIPTION VARCHAR2(100) 
, FLAG_PROCESSED VARCHAR2(1) 
);

CREATE TABLE TABLE_TARGET 
(
  ID NUMBER NOT NULL 
, DESCRIPTION VARCHAR2(100) 
);

-- insert to populate table_source with 10387 records
begin
for x in 1..10387
  loop
    insert into TABLE_SOURCE  values (x, 'THIS IS A TEST', 'N');
    commit;
  end loop;
end;
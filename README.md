### TODO
+ Add validation to models
+ Improve relation between model and database

### Used Technologies
+ JDK 11
+ SpringBoot 2.7.8
+ Postgres 12.12 (see https://www.postgresql.org/download/)
+ Web3j (see https://github.com/web3j/web3j)
+ Truffle Suite
  + Truffle (see https://trufflesuite.com/docs/truffle/how-to/install/)
  + Ganache (see https://trufflesuite.com/ganache/)

### Install development environment
1. Install all the tools mentioned at `Used Technologies` section
2. Create Database Schema :
```shell
#Create Database
cd ./src/main/resources/database/create/
sudo chmod a+x ./createDB.sh
./createDB.sh
cd -

#Populate Database
cd ./src/main/resources/database/populate/
sudo chmod a+x ./populateDB.sh
./populateDB.sh
cd - 
```
3. Deploy the Smart Contract 
```shell
cd ./src/main/resources/truffle
truffle compile
truffle migrate
cd -
```
4. Download all dependencies
```shell
mvn clean install
```
5. Run 
```shell
cd ./target/
java -jar ./*.jar
```

### Database Schema
#### AD_USER
```sql
                                   Table "presenceqr.ad_user"
     Column      |            Type             | Collation | Nullable |         Default         
-----------------+-----------------------------+-----------+----------+-------------------------
 ad_user_uid     | character varying(40)       |           | not null | 
 isactif         | boolean                     |           | not null | true
 created         | timestamp without time zone |           | not null | now()
 updated         | timestamp without time zone |           | not null | now()
 email           | character varying(255)      |           | not null | 
 password        | character varying(512)      |           | not null | 
 password_backup | character varying(255)      |           |          | NULL::character varying
 first_name      | character varying(60)       |           |          | 
 last_name       | character varying(60)       |           |          | 
 gender          | character varying(1)        |           |          | 
 birthday        | timestamp without time zone |           |          | 
 address         | character varying(255)      |           |          | 
 ad_role_id      | bigint                      |           | not null | 
Indexes:
    "ad_user_pkey" PRIMARY KEY, btree (ad_user_uid)
    "ad_user_email_key" UNIQUE CONSTRAINT, btree (email)
Check constraints:
    "sys_gender" CHECK (gender::bpchar = ANY (ARRAY['M'::bpchar, 'F'::bpchar]))
Foreign-key constraints:
    "fk_user_role" FOREIGN KEY (ad_role_id) REFERENCES ad_role(ad_role_id)
```
#### AD_ROLE
```sql
                                           Table "presenceqr.ad_role"
   Column    |            Type             | Collation | Nullable |                   Default                   
-------------+-----------------------------+-----------+----------+---------------------------------------------
 ad_role_id  | bigint                      |           | not null | nextval('ad_role_ad_role_id_seq'::regclass)
 isactif     | boolean                     |           | not null | true
 created     | timestamp without time zone |           | not null | now()
 updated     | timestamp without time zone |           | not null | now()
 name        | character varying(50)       |           | not null | 
 value       | character varying(50)       |           | not null | 
 description | character varying(255)      |           |          | 
Indexes:
    "ad_role_pkey" PRIMARY KEY, btree (ad_role_id)
    "ad_role_value_key" UNIQUE CONSTRAINT, btree (value)
Referenced by:
    TABLE "ad_user" CONSTRAINT "fk_user_role" FOREIGN KEY (ad_role_id) REFERENCES ad_role(ad_role_id)
```
#### M_COURSE
```sql
                        Table "presenceqr.m_course"
   Column    |            Type             | Collation | Nullable | Default 
-------------+-----------------------------+-----------+----------+---------
 m_course_id | bigint                      |           | not null | 
 isactif     | boolean                     |           | not null | true
 created     | timestamp without time zone |           | not null | now()
 updated     | timestamp without time zone |           | not null | now()
 name        | character varying(255)      |           | not null | 
Indexes:
    "m_course_pkey" PRIMARY KEY, btree (m_course_id)

```

## More

#### Generate a smart contract wrapper model
To generate model class from solidity smart contract:
```shell
cd ./src/main/resources/truffle
web3j generate truffle --truffle-json=build/contracts/Transaction.json --outputDir ../../java/ --package=com.youcefmegoura.presenceqr.model
cd -
```

#### Generated data
_All database dummy data are generated via https://www.mockaroo.com/_
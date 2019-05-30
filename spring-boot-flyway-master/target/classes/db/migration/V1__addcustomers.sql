create table customer (
  id int primary key,
  name varchar(255) not null,
  contact_name varchar (255) not null,
  email varchar (255) not null,
  phone varchar (255) not null
);

insert into customer (id,name, contact_name, email, phone) values
  (1,'Coca Cola', 'John Doe', 'john.doe@cocacola.com', '202-555-0143'),
  (2,'Dell', 'Bob Frapples', 'bob.frapples@dell.com', '202-555-0180'),
  (3,'Apple', 'Barb Ackue', 'barb.ackue@apple.com', '202-555-0128'),
  (4,'Google', 'Sue Vaneer', 'sue.vaneer@google.com', '202-555-0174'),
  (5,'FedEx', 'Robin Banks', 'robin.banks@fedex.com', '202-555-0146'),
  (6,'Salesforce', 'Zack Lee', 'zack.lee@salesforce.com', '202-555-0122');
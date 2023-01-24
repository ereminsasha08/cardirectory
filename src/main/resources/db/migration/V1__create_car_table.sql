create table car
(
    id               serial       not null,
    brand            varchar(255) not null,
    license_plate    varchar(255) not null,
    year_manufacture smallint     not null,
    primary key (id)
)
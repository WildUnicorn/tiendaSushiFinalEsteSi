create database bd_tienda;
use bd_tienda;

create table tipo(
id int auto_increment,
tipo Varchar(30),
primary key (id)
);

insert into tipo values(null,'Sushi');
insert into tipo values(null,'Papas');
insert into tipo values(null,'Bebida');
insert into tipo values(null,'Jugo');
insert into tipo values(null,'Cerveza');
insert into tipo values(null,'Otro');
insert into tipo values(null,'Empanadas');
insert into tipo values(null,'Gyosas');


create table producto(
id int auto_increment,
nombre Varchar (80),
precio int,
tipo int,
primary key (id),
foreign key(tipo) references tipo(id)
);

/*Sushis*/
insert into producto values(null,'Camaron en palta',2490,1);
insert into producto values(null,'Camaron Tempura',2390,1);
insert into producto values(null,'Camaron en cibulette',2350,1);
insert into producto values(null,'Kanikama en palta',2490,1);
insert into producto values(null,'Kanikama Tempura',2390,1);
insert into producto values(null,'Kanikama en cibulette',2350,1);
insert into producto values(null,'Salmon en palta',2890,1);
insert into producto values(null,'Salmon tempura',2890,1);
insert into producto values(null,'Salmon en cibulette',2790,1);
insert into producto values(null,'Pollo en palta',1990,1);
insert into producto values(null,'Pollo tempura',1990,1);
insert into producto values(null,'Pollo en cibulette',1990,1);
insert into producto values(null,'PandiSushi',2250,1);
insert into producto values(null,'Flower roll',2490,1);
insert into producto values(null,'Owl roll',2590,1);
insert into producto values(null,'Camaron en pulpo',2890,1);
insert into producto values(null,'Colores cuadrado',2790,1);
insert into producto values(null,'Sushiguesa',3490,1);

/*Agregados*/
insert into producto values(null,'Papas fritas pequeñas',1000,2);
insert into producto values(null,'Papas fritas medianas',1500,2);
insert into producto values(null,'Papas fritas grandes',2000,2);
insert into producto values(null,'Papas fritas familiares',2500,2);

insert into producto values(null,'4 Empanadas de queso',500,7);
insert into producto values(null,'8 Empanadas de queso',1000,7);
insert into producto values(null,'12 Empanadas de queso',1500,7);

insert into producto values(null,'8 Arrollados primavera',1290,8);
insert into producto values(null,'6 Gyosas de pollo',1990,8);
insert into producto values(null,'12 Gyosas de pollo',2590,8);
insert into producto values(null,'6 Gyosas de cerdo',1990,8);
insert into producto values(null,'12 Gyosas de cerdo',2590,8);


/*Bebidas*/
insert into producto values(null,'Coca-Cola 500cc',700,3);
insert into producto values(null,'Pepsi 500cc',700,3);
insert into producto values(null,'Fanta 500cc',700,3);
insert into producto values(null,'Sprite 500cc',700,3);
insert into producto values(null,'Bilz 500cc',600,3);
insert into producto values(null,'Pap 500cc',600,3);
insert into producto values(null,'7up 500cc',600,3);
insert into producto values(null,'Limon Soda 500cc',600,3);
insert into producto values(null,'Canada Dry 500cc',600,3);
insert into producto values(null,'Kem Piña 500cc',600,3);

/*Jugos*/
insert into producto values(null,'Piña',2200,4);
insert into producto values(null,'Damasco',2200,4);
insert into producto values(null,'Durazno',2200,4);
insert into producto values(null,'Frambuesa',2200,4);
insert into producto values(null,'Frutilla',2200,4);
insert into producto values(null,'Arandano',2300,4);
insert into producto values(null,'Melon',2200,4);
insert into producto values(null,'Mango',2300,4);

/*Cervezas*/
insert into producto values(null,'Cristal 350cc',600,5);
insert into producto values(null,'Escudo 350cc',700,5);
insert into producto values(null,'Becker 350cc',800,5);
insert into producto values(null,'Royal 350cc',950,5);
insert into producto values(null,'Heineken 350cc',1000,5);
insert into producto values(null,'Becker 1.5lt',1500,5);
insert into producto values(null,'Heineken 1.5lt',1700,5);
insert into producto values(null,'Royal 1.5lt',1650,5);

/*Otros*/
insert into producto values(null,'Lipton té verde/limon 500cc',500,6);
insert into producto values(null,'Lipton té verde/frambuesa 500cc',500,6);
insert into producto values(null,'Cachantun Woman+ con aloe vera',550,6);
insert into producto values(null,'Cachantun c/gas',500,6);
insert into producto values(null,'Cachantun s/gas',400,6);
insert into producto values(null,'Cachantun semi gas',500,6);
insert into producto values(null,'Vitamin Water frutos del bosque',800,6);

create table cliente (
id int auto_increment,
nombre varchar(50),
apellido varchar (50),
telefono int,
direccion varchar (60),
rut varchar (12),
clave varchar(25),
primary key (id)
);

create table ventaProducto(
id int auto_increment,
idCliente int,
idProducto int,
cantidadProductos int,
subTotal int,
primary key (id),
foreign key (idProducto) references producto (id),
foreign key (idCliente) references cliente (id)
);



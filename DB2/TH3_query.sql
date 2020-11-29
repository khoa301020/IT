create table GiaoVien
(
	MaGV char(7) primary key,
	Hoten nvarchar(30) not null,
	CMND char(9) not null
)

create table HocPhan
(
	MaHP char(7) primary key,
	TenHP nvarchar(50) not null unique,
	SoTC tinyint check(SoTC>=1 and soTC<=5)
)

create table SinhVien 
(
	MaSV char(13) primary key,
	HoTen nvarchar(30) not null,
	Password nvarchar(20) not null,
	statusSV char(1) default('H') check(statusSV In('H','N','T','G','S')),
	Dob date check(DateDIff(year,DOb,getDate())>=17)
)

create table HocKy
(
	MaHK int primary key,
	TenHK nvarchar(10) not null
)

create table LopHP 
(
	MaLHP char(8) primary key,
	MaHP char(7) foreign key references HocPhan(MaHP),
	MaHK int foreign key references HocKy(MaHK),
	TenLHP varchar(15) not null unique,
	MaGV char(7) foreign key references GiaoVien(MaGV),
	SDDK int check(SDDK>=0),
	SSMax int not null,
	Check(SSmax>=SDDK)
)

create table LHP_SV
(
	MaLHP char(8) foreign key references LopHP(MaLHP),
	MaSV char(13) foreign key references SinhVien(MaSV),
	DTKHP decimal(3,1) check(DTKHP>=0 and DTKHP<=10),
	status_HP nvarchar(50),
	primary key (MaLHP, MaSV)
)

create table TKHK
(
	MaHK int foreign key references HocKy(MaHK),
	MaSV char(13) foreign key references SinhVien(MaSV),
	MaDK char(20),
	STCDK int check(STCDK>=14),
	STCTL int check(STCTL>=0),
	DTBC decimal(3,1) check(DTBC>=0 and DTBC<14),
	primary key (MaHK, MaSV)
)
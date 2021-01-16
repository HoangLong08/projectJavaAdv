create database DOAN_JAVA
drop database DOAN_JAVA
create table SinhVien(
	MaSV char(50), 
	TenSV nvarchar(50),
	GioiTinh nvarchar(50),
	NgaySinh date,
	DiaChi nvarchar(255),
	DienThoai char(13),
	MaLop char(50),
	constraint pk_SinhVien primary key (MaSV)
)
--drop table SinhVien
--alter table SinhVien drop constraint fk_SinhVien
--alter table ThanNhan drop constraint fk_ThanNhan
-- 18CT1: CNTT01
-- 18CT2: CNTT02
-- 18CT3: CNTT03
-- 18CT4: CNTT04
insert into SinhVien (MaSV,           TenSV,            GioiTinh,   NgaySinh,     DiaChi,        DienThoai,   MaLop)
			values	 ('1851220001', 'Le Van Hoang',       'Nam', '2000-01-28', 'Da Nang',	  '090909099', 'CNTT01' ),
					('1851220002', 'Nguyen Van Long',     'Nam', '2000-02-29', 'Ho Chi Minh', '076251732', 'CNTT02' ),
					('1851220003', 'Nguyen Trong Thanh',  'Nam', '2000-03-27', 'Ha Noi',      '078925498', 'CNTT03' ),
					('1851220004', 'Thi No',              N'Nữ', '2000-04-26', 'Can Tho',     '012345678', 'CNTT04' ),
					('1851220005', 'Chi Pheo',            'Nam', '2000-01-25', 'Da Nang',     '098765432', 'CNTT01' ),
					('1851220006', 'Le Ngoc Nam',         'Nam', '2000-01-24', 'Ho Chi Minh', '095678431', 'CNTT02' ),
					('1851220007', 'Ngoc Tran',           'Nam', '2000-01-23', 'Ha Noi',      '097651283', 'CNTT03' ),
					('1851220008', 'Tran Thi Thoa',       N'Nữ', '2000-01-22', 'Quang Ngai',  '097618329', 'CNTT04' )
insert into SinhVien (MaSV,           TenSV,            GioiTinh,   NgaySinh,     DiaChi,        DienThoai,   MaLop)
			values					
					('1851220009', 'Vo Thi Hoa',          N'Nữ', '2000-05-21', 'Ha Tinh',     '092746284', 'CNTT01' ),
					('1851220010', 'Thanh Nhan',          N'Nữ', '2000-06-20', 'Dong Thap',   '089166234', 'CNTT02' ),
					('1851220011', 'Thanh Vinh',          'Nam', '2000-07-19', 'Da Nang',     '091276143', 'CNTT03' ),
					('1851220012', 'Le Khoa',             'Nam', '2000-08-18', 'Ho Chi Minh', '089248142', 'CNTT04' ),
					('1851220013', 'Vo Thu Lan',          N'Nữ', '2000-09-17', 'Hai Phong',   '066666666', 'CNTT01' ),
					('1851220014', 'Thanh Nhat',          N'Nữ', '2000-11-16', 'Thai Nguyen', '077777777', 'CNTT02' ),
					('1851220015', 'Hoa Vinh',            'Nam', '2000-12-15', 'Da Nang',     '088888888', 'CNTT03' ),
					('1851220016', 'Son Tung',            'Nam', '2000-06-14', 'Binh Dinh',   '099999999', 'CNTT04' )

insert into SinhVien (MaSV,           TenSV,            GioiTinh,   NgaySinh,     DiaChi,        DienThoai,   MaLop)
			values					
					('1851220017', 'Tran Quang Trung',    N'Nữ', '2000-05-21', N'Quảng Nam',  '092746285', 'CNTT01' ),
					('1851220018', 'Nguyen Hue',          N'Nữ', '2000-06-20', N'Quảng Trị',  '089166237', 'CNTT02' ),
					('1851220019', 'Hoang Lam',           'Nam', '2000-07-19', N'Hải Phòng',  '091276149', 'CNTT03' ),
					('1851220020', 'Nguyen Khang',        'Nam', '2000-08-18', N'Hô Chí Minh','089248112', 'CNTT04' )
--select * from SinhVien

create table ThanNhan(
	MaSV char(50),
	TenCha nvarchar(255),
	TenMe nvarchar(255),
	DienThoaiMe char(13),
	DienThoaiCha char(13)

)

create table Lop(
	MaLop char(50),
	TenLop char(50),
	MaKhoa char(50)
	constraint pk_Lop primary key (MaLop)
)

insert into Lop(MaLop, TenLop, MaKhoa)
		values ('CNTT01', '18CT1', 'CNTT'),
				('CNTT02', '18CT2', 'CNTT'),
				('CNTT03', '18CT3', 'CNTT'),
				('CNTT04', '18CT4', 'CNTT')

create table Khoa(
	MaKhoa char(50),
	TenKhoa nvarchar(255),
	DienThoai char (13),
	constraint pk_Khoa primary key (MaKhoa)
)

insert into  Khoa(MaKhoa, TenKhoa, DienThoai)
		values ('CNTT', N'Công Nghệ Thông Tin', '0989898998'),
				('QTKS', N'Quản Trị Khách Sạn', '0787878787'),
				('TKDH', N'Thiết Kế Đồ Họa',    '0696969696'),
				('NNA', N'Ngôn Ngữ Anh',        '0101010101')

create table GiangVien(
	MaGV char(50),
	TenGV nvarchar(255),
	ChuyenNganh nvarchar(255),
	MaKhoa char(50),
	constraint pk_GiangVien primary key (MaGV)
)

--drop table GiangVien

create table Diem(
	MaSV char(50),
	MaMH char(50),
	DiemThi float,
)
--drop table Diem
--alter table SinhVien drop constraint fk_Diem
insert into Diem(MaSV, MaMH, DiemThi)
	values	('1851220001', 'JAVABASIC', '8'),
			('1851220002', 'JAVAADV',   '9'),
			('1851220003', 'JAVABASIC', '10'),
			('1851220004', 'JAVAADV',   '7'),
			('1851220005', 'NMC',       '6'),
			('1851220006', 'JAVABASIC', '5'),
			('1851220007', 'JAVAADV',   '4'),
			('1851220008', 'NMC',       '5'),
			('1851220009', 'JAVABASIC', '6'),
			('1851220010', 'JAVAADV',   '7'),
			('1851220011', 'NMC',       '8'),
			('1851220012', 'JAVABASIC', '9'),
			('1851220013', 'JAVAADV',  '10'),
			('1851220014', 'NMC',       '9'),
			('1851220015', 'JAVABASIC', '7'),
			('1851220016', 'NMC',       '9')

create table MonHoc(
	MaMH char(50),
	TenMH nvarchar(255),
	constraint pk_MonHoc primary key (MaMH)
)

insert into MonHoc(MaMH, TenMH)
	values ('JAVABASIC', N'Java Cơ Bản'),
			('JAVAADV', N'Java Nâng Cao'),
			('NMC', N'Nhập Môn C')

insert into MonHoc(MaMH, TenMH)
	values ('KTMT', N'Kiến Trúc Máy Tính'),
			('LTHT', N'Lập Trình Hệ Thống'),
			('TA', N'Tiếng Anh'),
			('KNM', N'Kỹ Năng Mềm'),
			('TRR', N'Toán Rời Rạc'),
			('LTM', N'Lập Trình Mạng'),
			('LTW', N'Lập Trình Web')
			

alter table Diem
	add constraint fk_Diem foreign key(MaSV) references SinhVien(MaSV) on delete cascade on update cascade

alter table Diem
	add constraint fk_MonHoc foreign key(MaMH) references MonHoc(MaMH) on delete cascade on update cascade

alter table SinhVien
	add constraint fk_SinhVien foreign key(MaLop) references Lop(MaLop) on delete cascade on update cascade

alter table ThanNhan
add constraint fk_ThanNhan foreign key(MaSV) references SinhVien(MaSV) on delete cascade on update cascade

alter table Lop
	add constraint fk_Lop foreign key(MaKhoa) references Khoa(MaKhoa) on delete cascade on update cascade

alter table GiangVien
	add constraint fk_GiangVien foreign key(MaKhoa) references Khoa(MaKhoa) on delete cascade on update cascade


USE [BANSACH]
GO
ALTER TABLE [dbo].[THANHVIEN] DROP CONSTRAINT [FK__THANHVIEN__maLoa__398D8EEE]
GO
ALTER TABLE [dbo].[SACH] DROP CONSTRAINT [FK__SACH__maTheLoai__4222D4EF]
GO
ALTER TABLE [dbo].[SACH] DROP CONSTRAINT [FK__SACH__maNhom__440B1D61]
GO
ALTER TABLE [dbo].[SACH] DROP CONSTRAINT [FK__SACH__maNhaXuatB__4316F928]
GO
ALTER TABLE [dbo].[PHANHOI] DROP CONSTRAINT [FK__PHANHOI__maThanh__5165187F]
GO
ALTER TABLE [dbo].[PHANHOI] DROP CONSTRAINT [FK__PHANHOI__maSach__52593CB8]
GO
ALTER TABLE [dbo].[KHACHHANG] DROP CONSTRAINT [FK__KHACHHANG__maTha__46E78A0C]
GO
ALTER TABLE [dbo].[DONHANG] DROP CONSTRAINT [FK__DONHANG__maKhach__4AB81AF0]
GO
ALTER TABLE [dbo].[ChiTietDonHang] DROP CONSTRAINT [FK__ChiTietDo__maSac__4E88ABD4]
GO
ALTER TABLE [dbo].[ChiTietDonHang] DROP CONSTRAINT [FK__ChiTietDo__maDon__4D94879B]
GO
ALTER TABLE [dbo].[chi_tiet_don_hang] DROP CONSTRAINT [FKqp1x3yp4fv8g7n8wqlnku44hc]
GO
ALTER TABLE [dbo].[chi_tiet_don_hang] DROP CONSTRAINT [FKl4ue6tf96ltdeqjhjmhr3jbfd]
GO
ALTER TABLE [dbo].[DONHANG] DROP CONSTRAINT [DF__DONHANG__daThanh__49C3F6B7]
GO
/****** Object:  Table [dbo].[THELOAI]    Script Date: 11/1/2021 5:32:10 PM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[THELOAI]') AND type in (N'U'))
DROP TABLE [dbo].[THELOAI]
GO
/****** Object:  Table [dbo].[THANHVIEN]    Script Date: 11/1/2021 5:32:10 PM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[THANHVIEN]') AND type in (N'U'))
DROP TABLE [dbo].[THANHVIEN]
GO
/****** Object:  Table [dbo].[SACH]    Script Date: 11/1/2021 5:32:10 PM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[SACH]') AND type in (N'U'))
DROP TABLE [dbo].[SACH]
GO
/****** Object:  Table [dbo].[PHANHOI]    Script Date: 11/1/2021 5:32:10 PM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[PHANHOI]') AND type in (N'U'))
DROP TABLE [dbo].[PHANHOI]
GO
/****** Object:  Table [dbo].[NHOMMUA]    Script Date: 11/1/2021 5:32:10 PM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[NHOMMUA]') AND type in (N'U'))
DROP TABLE [dbo].[NHOMMUA]
GO
/****** Object:  Table [dbo].[NHAXUATBAN]    Script Date: 11/1/2021 5:32:10 PM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[NHAXUATBAN]') AND type in (N'U'))
DROP TABLE [dbo].[NHAXUATBAN]
GO
/****** Object:  Table [dbo].[LOAITHANHVIEN]    Script Date: 11/1/2021 5:32:10 PM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[LOAITHANHVIEN]') AND type in (N'U'))
DROP TABLE [dbo].[LOAITHANHVIEN]
GO
/****** Object:  Table [dbo].[KHACHHANG]    Script Date: 11/1/2021 5:32:10 PM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[KHACHHANG]') AND type in (N'U'))
DROP TABLE [dbo].[KHACHHANG]
GO
/****** Object:  Table [dbo].[DONHANG]    Script Date: 11/1/2021 5:32:10 PM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[DONHANG]') AND type in (N'U'))
DROP TABLE [dbo].[DONHANG]
GO
/****** Object:  Table [dbo].[ChiTietDonHang]    Script Date: 11/1/2021 5:32:10 PM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[ChiTietDonHang]') AND type in (N'U'))
DROP TABLE [dbo].[ChiTietDonHang]
GO
/****** Object:  Table [dbo].[chi_tiet_don_hang]    Script Date: 11/1/2021 5:32:10 PM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[chi_tiet_don_hang]') AND type in (N'U'))
DROP TABLE [dbo].[chi_tiet_don_hang]
GO
USE [master]
GO
/****** Object:  Database [BANSACH]    Script Date: 11/1/2021 5:32:10 PM ******/
DROP DATABASE [BANSACH]
GO
/****** Object:  Database [BANSACH]    Script Date: 11/1/2021 5:32:10 PM ******/
CREATE DATABASE [BANSACH]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'BANSACH', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\DATA\BANSACH.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'BANSACH_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\DATA\BANSACH_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [BANSACH] SET COMPATIBILITY_LEVEL = 140
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [BANSACH].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [BANSACH] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [BANSACH] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [BANSACH] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [BANSACH] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [BANSACH] SET ARITHABORT OFF 
GO
ALTER DATABASE [BANSACH] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [BANSACH] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [BANSACH] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [BANSACH] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [BANSACH] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [BANSACH] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [BANSACH] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [BANSACH] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [BANSACH] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [BANSACH] SET  ENABLE_BROKER 
GO
ALTER DATABASE [BANSACH] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [BANSACH] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [BANSACH] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [BANSACH] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [BANSACH] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [BANSACH] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [BANSACH] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [BANSACH] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [BANSACH] SET  MULTI_USER 
GO
ALTER DATABASE [BANSACH] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [BANSACH] SET DB_CHAINING OFF 
GO
ALTER DATABASE [BANSACH] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [BANSACH] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [BANSACH] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [BANSACH] SET QUERY_STORE = OFF
GO
USE [BANSACH]
GO
/****** Object:  Table [dbo].[chi_tiet_don_hang]    Script Date: 11/1/2021 5:32:10 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[chi_tiet_don_hang](
	[ma_chi_tietddh] [int] IDENTITY(1,1) NOT NULL,
	[don_gia] [bigint] NOT NULL,
	[so_luong] [int] NOT NULL,
	[ten_sach] [varchar](255) NULL,
	[ma_don_hang] [int] NULL,
	[ma_sach] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[ma_chi_tietddh] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChiTietDonHang]    Script Date: 11/1/2021 5:32:10 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietDonHang](
	[maChiTietDDH] [int] IDENTITY(1,1) NOT NULL,
	[maDonHang] [int] NULL,
	[maSach] [int] NULL,
	[tenSach] [nvarchar](255) NULL,
	[soLuong] [int] NULL,
	[donGia] [decimal](18, 0) NULL,
PRIMARY KEY CLUSTERED 
(
	[maChiTietDDH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DONHANG]    Script Date: 11/1/2021 5:32:10 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DONHANG](
	[maDonHang] [int] IDENTITY(1,1) NOT NULL,
	[ngayDat] [date] NULL,
	[ngayGiao] [date] NULL,
	[tinhTrangGiaoHang] [nvarchar](max) NULL,
	[daThanhToan] [bit] NULL,
	[maKhachHang] [int] NULL,
	[uuDai] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[maDonHang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KHACHHANG]    Script Date: 11/1/2021 5:32:10 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KHACHHANG](
	[maKhachHang] [int] IDENTITY(1,1) NOT NULL,
	[tenKhachHang] [nvarchar](255) NULL,
	[diaChi] [nvarchar](max) NULL,
	[email] [nvarchar](max) NULL,
	[soDienThoai] [nvarchar](50) NULL,
	[maThanhVien] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[maKhachHang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LOAITHANHVIEN]    Script Date: 11/1/2021 5:32:10 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LOAITHANHVIEN](
	[maLoaiThanhVien] [int] IDENTITY(1,1) NOT NULL,
	[tenLoaiThanhVien] [nvarchar](255) NULL,
	[uuDai] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[maLoaiThanhVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NHAXUATBAN]    Script Date: 11/1/2021 5:32:10 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NHAXUATBAN](
	[maNhaXuatBan] [int] IDENTITY(1,1) NOT NULL,
	[tenNhaXuatBan] [nvarchar](255) NULL,
	[thongTin] [nvarchar](max) NULL,
	[logo] [nvarchar](max) NULL,
PRIMARY KEY CLUSTERED 
(
	[maNhaXuatBan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NHOMMUA]    Script Date: 11/1/2021 5:32:10 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NHOMMUA](
	[maNhom] [int] IDENTITY(1,1) NOT NULL,
	[tenNhom] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[maNhom] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PHANHOI]    Script Date: 11/1/2021 5:32:10 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PHANHOI](
	[maPhanHoi] [int] IDENTITY(1,1) NOT NULL,
	[noiDung] [nvarchar](max) NULL,
	[maSach] [int] NULL,
	[maThanhVien] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[maPhanHoi] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SACH]    Script Date: 11/1/2021 5:32:10 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SACH](
	[maSach] [int] IDENTITY(1,1) NOT NULL,
	[tenSach] [nvarchar](255) NULL,
	[donGia] [decimal](18, 0) NULL,
	[moTa] [nvarchar](max) NULL,
	[ngayCapNhat] [datetime] NULL,
	[hinhAnh] [nvarchar](max) NULL,
	[hinhAnh2] [nvarchar](max) NULL,
	[hinhAnh3] [nvarchar](max) NULL,
	[soLuongMua] [int] NULL,
	[soLuongTon] [int] NULL,
	[maNhaXuatBan] [int] NULL,
	[maTheLoai] [int] NULL,
	[maNhom] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[maSach] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[THANHVIEN]    Script Date: 11/1/2021 5:32:10 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[THANHVIEN](
	[maThanhVien] [int] IDENTITY(1,1) NOT NULL,
	[taiKhoan] [nvarchar](255) NULL,
	[matKhau] [nvarchar](255) NULL,
	[hoTen] [nvarchar](max) NULL,
	[soDienThoai] [nvarchar](50) NULL,
	[diaChi] [nvarchar](max) NULL,
	[email] [nvarchar](max) NULL,
	[maLoaiThanhVien] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[maThanhVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[THELOAI]    Script Date: 11/1/2021 5:32:10 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[THELOAI](
	[maTheLoai] [int] IDENTITY(1,1) NOT NULL,
	[tenTheLoai] [nvarchar](255) NULL,
	[icon] [nvarchar](max) NULL,
PRIMARY KEY CLUSTERED 
(
	[maTheLoai] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[NHAXUATBAN] ON 

INSERT [dbo].[NHAXUATBAN] ([maNhaXuatBan], [tenNhaXuatBan], [thongTin], [logo]) VALUES (1, N'Kim Đồng', NULL, NULL)
SET IDENTITY_INSERT [dbo].[NHAXUATBAN] OFF
GO
SET IDENTITY_INSERT [dbo].[NHOMMUA] ON 

INSERT [dbo].[NHOMMUA] ([maNhom], [tenNhom]) VALUES (1, N'Manga')
SET IDENTITY_INSERT [dbo].[NHOMMUA] OFF
GO
SET IDENTITY_INSERT [dbo].[SACH] ON 

INSERT [dbo].[SACH] ([maSach], [tenSach], [donGia], [moTa], [ngayCapNhat], [hinhAnh], [hinhAnh2], [hinhAnh3], [soLuongMua], [soLuongTon], [maNhaXuatBan], [maTheLoai], [maNhom]) VALUES (3, N'DragonBall Tập 1', CAST(21000 AS Decimal(18, 0)), N'Truyện của tác giả Akira Toriyama', CAST(N'2021-10-29T00:00:00.000' AS DateTime), N'1.png', N'2.png', N'3.png', 100, 1000, 1, 1, 1)
INSERT [dbo].[SACH] ([maSach], [tenSach], [donGia], [moTa], [ngayCapNhat], [hinhAnh], [hinhAnh2], [hinhAnh3], [soLuongMua], [soLuongTon], [maNhaXuatBan], [maTheLoai], [maNhom]) VALUES (4, N'Doraemon', CAST(18000 AS Decimal(18, 0)), N'Truyện Doremon', CAST(N'2021-10-30T00:00:00.000' AS DateTime), N'4.png', N'5.png', N'6.png', 1000, 999, 1, 1, 1)
INSERT [dbo].[SACH] ([maSach], [tenSach], [donGia], [moTa], [ngayCapNhat], [hinhAnh], [hinhAnh2], [hinhAnh3], [soLuongMua], [soLuongTon], [maNhaXuatBan], [maTheLoai], [maNhom]) VALUES (5, N'One Piece', CAST(18000 AS Decimal(18, 0)), N'Truyện Vua Hải Tặc', CAST(N'2021-01-11T00:00:00.000' AS DateTime), N'7.png', N'8.png', N'9.png', 111, 2222, 1, 1, 1)
INSERT [dbo].[SACH] ([maSach], [tenSach], [donGia], [moTa], [ngayCapNhat], [hinhAnh], [hinhAnh2], [hinhAnh3], [soLuongMua], [soLuongTon], [maNhaXuatBan], [maTheLoai], [maNhom]) VALUES (6, N'Naruto', CAST(20000 AS Decimal(18, 0)), N'The Tests of the Ninja', CAST(N'2021-11-01T00:00:00.000' AS DateTime), N'10.png', N'11.png', N'12.png', 222, 3333, 1, 1, 1)
SET IDENTITY_INSERT [dbo].[SACH] OFF
GO
SET IDENTITY_INSERT [dbo].[THELOAI] ON 

INSERT [dbo].[THELOAI] ([maTheLoai], [tenTheLoai], [icon]) VALUES (1, N'Shounen', NULL)
SET IDENTITY_INSERT [dbo].[THELOAI] OFF
GO
ALTER TABLE [dbo].[DONHANG] ADD  DEFAULT ((0)) FOR [daThanhToan]
GO
ALTER TABLE [dbo].[chi_tiet_don_hang]  WITH CHECK ADD  CONSTRAINT [FKl4ue6tf96ltdeqjhjmhr3jbfd] FOREIGN KEY([ma_sach])
REFERENCES [dbo].[SACH] ([maSach])
GO
ALTER TABLE [dbo].[chi_tiet_don_hang] CHECK CONSTRAINT [FKl4ue6tf96ltdeqjhjmhr3jbfd]
GO
ALTER TABLE [dbo].[chi_tiet_don_hang]  WITH CHECK ADD  CONSTRAINT [FKqp1x3yp4fv8g7n8wqlnku44hc] FOREIGN KEY([ma_don_hang])
REFERENCES [dbo].[DONHANG] ([maDonHang])
GO
ALTER TABLE [dbo].[chi_tiet_don_hang] CHECK CONSTRAINT [FKqp1x3yp4fv8g7n8wqlnku44hc]
GO
ALTER TABLE [dbo].[ChiTietDonHang]  WITH CHECK ADD FOREIGN KEY([maDonHang])
REFERENCES [dbo].[DONHANG] ([maDonHang])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[ChiTietDonHang]  WITH CHECK ADD FOREIGN KEY([maSach])
REFERENCES [dbo].[SACH] ([maSach])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[DONHANG]  WITH CHECK ADD FOREIGN KEY([maKhachHang])
REFERENCES [dbo].[KHACHHANG] ([maKhachHang])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[KHACHHANG]  WITH CHECK ADD FOREIGN KEY([maThanhVien])
REFERENCES [dbo].[THANHVIEN] ([maThanhVien])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[PHANHOI]  WITH CHECK ADD FOREIGN KEY([maSach])
REFERENCES [dbo].[SACH] ([maSach])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[PHANHOI]  WITH CHECK ADD FOREIGN KEY([maThanhVien])
REFERENCES [dbo].[THANHVIEN] ([maThanhVien])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[SACH]  WITH CHECK ADD FOREIGN KEY([maNhaXuatBan])
REFERENCES [dbo].[NHAXUATBAN] ([maNhaXuatBan])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[SACH]  WITH CHECK ADD FOREIGN KEY([maNhom])
REFERENCES [dbo].[NHOMMUA] ([maNhom])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[SACH]  WITH CHECK ADD FOREIGN KEY([maTheLoai])
REFERENCES [dbo].[THELOAI] ([maTheLoai])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[THANHVIEN]  WITH CHECK ADD FOREIGN KEY([maLoaiThanhVien])
REFERENCES [dbo].[LOAITHANHVIEN] ([maLoaiThanhVien])
ON DELETE CASCADE
GO
USE [master]
GO
ALTER DATABASE [BANSACH] SET  READ_WRITE 
GO

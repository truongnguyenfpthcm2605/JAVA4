
USE master
GO
CREATE DATABASE PolyOE1
GO

GO
USE PolyOE1
go
create table Users (
	Id nvarchar(20) primary key not null,
	Password nvarchar(50) not null,
	Fullname nvarchar(50) not null,
	Email nvarchar(50) not null,
	Admin bit not null
)

Create table Videos(
	videoID char(11) primary key,
	title nvarchar(50),
	poster nvarchar(50),
	description nvarchar(max),
	active bit,
	views int,
)
Go



Create table Favorites(
	id bigint primary key identity(1,1),
	videoID char(11),
	userID nvarchar(20),
	likeDate date,
)
Go

Go
Alter table Favorites Add Constraint FK_Favorites_Videos_VideoID foreign key (videoID) references Videos(videoID)
Alter table Favorites Add Constraint FK_Favorites_Users_UserID foreign key (userID) references Users(Id)
Go

CREATE PROC spFavoriteByYear(@Year INT)
AS
BEGIN
SELECT
v.Title AS 'Group',
count(f.Id) AS 'Likes',
max(f.LikeDate) AS 'Newest',
min(f.LikeDate) AS 'Oldest'
FROM Favorites f JOIN Videos v ON v.videoID = f.VideoId
WHERE year(f.LikeDate) = @Year
GROUP BY v.Title
END
go

exec spFavoriteByYear 2020

--insert--
GO
INSERT INTO Videos (videoID,title,poster,description,active,views) VALUES ('vd1', 'Iron Man', 'video1', N'Mô tả video 1', 1, 534534)
INSERT INTO Videos (videoID,title,poster,description,active,views) VALUES ('vd2', 'The Incredible Hulk', 'video2', N'Mô tả video 2', 1, 87675)
INSERT INTO Videos (videoID,title,poster,description,active,views) VALUES ('vd3', 'Iron Man 2', 'video3', N'Mô tả video 3', 1, 31235)
INSERT INTO Videos (videoID,title,poster,description,active,views) VALUES ('vd4', 'Thor', 'video4', N'Mô tả video 4', 1, 853)
INSERT INTO Videos (videoID,title,poster,description,active,views) VALUES ('vd5', 'Captain America: The First Avenger', 'video5', N'Mô tả video 5', 1, 5543)
INSERT INTO Videos (videoID,title,poster,description,active,views) VALUES ('vd6', 'The Avengers', 'video5', N'Mô tả video 5', 1, 213)
INSERT INTO Videos (videoID,title,poster,description,active,views) VALUES ('vd7', 'Iron Man 3', 'video5', N'Mô tả video 5', 1, 756)
INSERT INTO Videos (videoID,title,poster,description,active,views) VALUES ('vd8', 'Thor: The Dark World', 'video5', N'Mô tả video 5', 1, 7657)
INSERT INTO Videos (videoID,title,poster,description,active,views) VALUES ('vd9', 'Captain America 2: The Winter Soldier', 'video5', N'Mô tả video 5', 1, 3457)
INSERT INTO Videos (videoID,title,poster,description,active,views) VALUES ('vd10', 'Guardians of The Galaxy', 'video5', N'Mô tả video 5', 1, 86756)
INSERT INTO Videos (videoID,title,poster,description,active,views) VALUES ('vd11', 'Avengers: Age of Ultron', 'video5', N'Mô tả video 5', 1, 5347)
INSERT INTO Videos (videoID,title,poster,description,active,views) VALUES ('vd12', 'Ant-Man', 'video5', N'Mô tả video 5', 1, 999)
INSERT INTO Videos (videoID,title,poster,description,active,views) VALUES ('vd13', 'Captain America: Civil War', 'video5', N'Mô tả video 5', 1, 53457)
INSERT INTO Videos (videoID,title,poster,description,active,views) VALUES ('vd14', 'Doctor Strange', 'video5', N'Mô tả video 5', 1, 999)
INSERT INTO Videos (videoID,title,poster,description,active,views) VALUES ('vd15', 'Guardians of The Galaxy 2', 'video5', N'Mô tả video 5', 1, 85757)
INSERT INTO Videos (videoID,title,poster,description,active,views) VALUES ('vd16', 'Spider-Man: Homecoming', 'video5', N'Mô tả video 5', 1, 9377)
INSERT INTO Videos (videoID,title,poster,description,active,views) VALUES ('vd17', 'Thor: Ragnarok', 'video5', N'Mô tả video 5', 1, 7564)
INSERT INTO Videos (videoID,title,poster,description,active,views) VALUES ('vd18', 'Black Panther', 'video5', N'Mô tả video 5', 1, 8276)
INSERT INTO Videos (videoID,title,poster,description,active,views) VALUES ('vd19', 'Avengers: Infinity War', 'video5', N'Mô tả video 5', 1, 645)
INSERT INTO Videos (videoID,title,poster,description,active,views) VALUES ('vd20', 'Ant-Man and the Wasp', 'video5', N'Mô tả video 5', 1, 85765)
INSERT INTO Videos (videoID,title,poster,description,active,views) VALUES ('vd21', 'Captain Marvel', 'video5', N'Mô tả video 5', 1, 6753)
INSERT INTO Videos (videoID,title,poster,description,active,views) VALUES ('vd22', 'Avengers: Endgame', 'video5', N'Mô tả video 5', 1, 5345)
INSERT INTO Videos (videoID,title,poster,description,active,views) VALUES ('vd23', 'Spider-Man: Far From Home', 'video5', N'Mô tả video 5', 1, 53452)
INSERT INTO Videos (videoID,title,poster,description,active,views) VALUES ('vd24', 'Black Widow', 'video5', N'Mô tả video 5', 1, 64314)
INSERT INTO Videos (videoID,title,poster,description,active,views) VALUES ('vd25', 'Shang-Chi and the Legend of the Ten Rings', 'video5', N'Mô tả video 5', 1, 6548)
INSERT INTO Videos (videoID,title,poster,description,active,views) VALUES ('vd26', 'Eternals', 'video5', N'Mô tả video 5', 1, 745)
INSERT INTO Videos (videoID,title,poster,description,active,views) VALUES ('vd27', 'Spider-Man: No Way Home', 'video5', N'Mô tả video 5', 1, 42341)
GO
SET DATEFORMAT dmy;  
go
INSERT INTO Users (Id,Password,Fullname,Email,Admin) VALUES ('admin', '123', N'cuc', 'admin@gmail.com', 1)
INSERT INTO Users (Id,Password,Fullname,Email,Admin) VALUES ('danhloi', '823806', N'Danh Lợi', 'danhloi@gmail.com', 0)
INSERT INTO Users (Id,Password,Fullname,Email,Admin) VALUES ('ducduy', '525090', N'Đức Duy', 'ducduy@gmail.com', 0)
INSERT INTO Users (Id,Password,Fullname,Email,Admin) VALUES ('duyplus', '123456', N'Hoàng Duy', 'duyplusdz@gmail.com', 0)
INSERT INTO Users (Id,Password,Fullname,Email,Admin) VALUES ('honglinh', '268252', N'Hồng Linh', 'honglinh@gmail.com', 0)
INSERT INTO Users (Id,Password,Fullname,Email,Admin) VALUES ('huyphi', '155530', N'Huy Phi', 'huyphi@gmail.com', 0)
INSERT INTO Users (Id,Password,Fullname,Email,Admin) VALUES ('trungkien', '781915', N'Trung Kiên', 'trungkien@gmail.com', 0)
INSERT INTO Users (Id,Password,Fullname,Email,Admin) VALUES ('hongdao', '962334', N'Hồng Đào', 'hongdao@gmail.com', 0)
INSERT INTO Users (Id,Password,Fullname,Email,Admin) VALUES ('lelai', '665844', N'Lê Lại', 'lelai@gmail.com', 0)
INSERT INTO Users (Id,Password,Fullname,Email,Admin) VALUES ('quanghung', '533240', N'Quang Hưng', 'quanghung@gmail.com', 0)
INSERT INTO Users (Id,Password,Fullname,Email,Admin) VALUES ('thanhthuy', '330543', N'Thanh Thuỳ', 'thanhthuy@gmail.com', 0)
INSERT INTO Users (Id,Password,Fullname,Email,Admin) VALUES ('hungthinh', '345983', N'Hưng Thịnh', 'hungthinh@gmail.com', 0)
INSERT INTO Users (Id,Password,Fullname,Email,Admin) VALUES ('daiphat', '301381', N'Đại Phát', 'daiphat@gmail.com', 0)
INSERT INTO Users (Id,Password,Fullname,Email,Admin) VALUES ('myduyen', '543397', N'Mỹ Duyên', 'myduyen@gmail.com', 0)
INSERT INTO Users (Id,Password,Fullname,Email,Admin) VALUES ('binhloi', '399458', N'Bình Lợi', 'binhloi@gmail.com', 0)
INSERT INTO Users (Id,Password,Fullname,Email,Admin) VALUES ('tienthanh', '469164', N'Tiến Thành', 'tienthanh@gmail.com', 0)
INSERT INTO Users (Id,Password,Fullname,Email,Admin) VALUES ('trunghung', '928937', N'Trung Hùng', 'trunghung@gmail.com', 0)
INSERT INTO Users (Id,Password,Fullname,Email,Admin) VALUES ('thuha', '147852', N'Thu Hà', 'thuha@gmail.com', 0)
INSERT INTO Users (Id,Password,Fullname,Email,Admin) VALUES ('hoangkim', '364430', N'Hoàng Kim', 'hoangkim@gmail.com', 0)
GO
INSERT Favorites  VALUES ( N'vd1 ', N'admin', CAST(N'2021-02-02' AS Date))
INSERT Favorites  VALUES ( N'vd2 ', N'duyplus', CAST(N'2021-03-12' AS Date))
INSERT Favorites  VALUES ( N'vd3 ', N'duyplus', CAST(N'2021-05-15' AS Date))
INSERT Favorites  VALUES (N'vd4 ', N'admin', CAST(N'2022-06-20' AS Date))
INSERT Favorites  VALUES ( N'vd5 ', N'admin', CAST(N'2021-07-22' AS Date))
INSERT Favorites  VALUES (N'vd1 ', N'duyplus', CAST(N'2021-07-05' AS Date))
INSERT Favorites  VALUES ( N'vd9 ', N'hongdao', CAST(N'2021-04-11' AS Date))
INSERT Favorites  VALUES (N'vd10', N'binhloi', CAST(N'2021-05-13' AS Date))
INSERT Favorites  VALUES ( N'vd12', N'tienthanh', CAST(N'2021-08-17' AS Date))
INSERT Favorites  VALUES (N'vd21', N'quanghung', CAST(N'2021-03-05' AS Date))
INSERT Favorites  VALUES (N'vd15', N'thanhthuy', CAST(N'2021-08-02' AS Date))
INSERT Favorites  VALUES ( N'vd19', N'trunghung', CAST(N'2021-05-06' AS Date))
INSERT Favorites  VALUES ( N'vd20', N'thuha', CAST(N'2021-09-12' AS Date))
INSERT Favorites  VALUES ( N'vd25', N'hoangkim', CAST(N'2021-10-23' AS Date))
INSERT Favorites  VALUES ( N'vd14', N'hungthinh', CAST(N'2021-10-15' AS Date))
INSERT Favorites  VALUES ( N'vd18', N'trungkien', CAST(N'2021-01-18' AS Date))
INSERT Favorites  VALUES ( N'vd22', N'huyphi', CAST(N'2021-10-13' AS Date))
INSERT Favorites  VALUES ( N'vd23', N'honglinh', CAST(N'2021-11-26' AS Date))
INSERT Favorites  VALUES ( N'vd16', N'ducduy', CAST(N'2021-12-06' AS Date))
INSERT Favorites  VALUES ( N'vd18', N'thanhthuy', CAST(N'2021-10-09' AS Date))
INSERT Favorites  VALUES ( N'vd10', N'hongdao', CAST(N'2021-09-27' AS Date))
INSERT Favorites  VALUES ( N'vd15', N'binhloi', CAST(N'2021-02-08' AS Date))
INSERT Favorites  VALUES ( N'vd17', N'tienthanh', CAST(N'2021-06-11' AS Date))
INSERT Favorites  VALUES (N'vd11', N'quanghung', CAST(N'2021-05-15' AS Date))
INSERT Favorites  VALUES ( N'vd12', N'thanhthuy', CAST(N'2021-07-17' AS Date))
INSERT Favorites  VALUES (N'vd19', N'trunghung', CAST(N'2021-09-19' AS Date))
INSERT Favorites  VALUES ( N'vd20', N'thuha', CAST(N'2021-10-27' AS Date))
INSERT Favorites  VALUES (N'vd20', N'hoangkim', CAST(N'2021-11-21' AS Date))
INSERT Favorites  VALUES ( N'vd16', N'hungthinh', CAST(N'2021-01-23' AS Date))
INSERT Favorites  VALUES ( N'vd27', N'trungkien', CAST(N'2021-01-06' AS Date))
INSERT Favorites  VALUES ( N'vd24', N'huyphi', CAST(N'2022-01-23' AS Date))
INSERT Favorites  VALUES ( N'vd21', N'honglinh', CAST(N'2022-01-06' AS Date))
INSERT Favorites  VALUES ( N'vd15', N'ducduy', CAST(N'2022-01-24' AS Date))
INSERT Favorites  VALUES ( N'vd14', N'thanhthuy', CAST(N'2022-01-16' AS Date))
INSERT Favorites  VALUES ( N'vd4 ', N'hongdao', CAST(N'2022-01-16' AS Date))
INSERT Favorites  VALUES ( N'vd5 ', N'binhloi', CAST(N'2022-01-13' AS Date))
INSERT Favorites  VALUES ( N'vd6 ', N'tienthanh', CAST(N'2022-01-12' AS Date))
INSERT Favorites  VALUES ( N'vd4 ', N'quanghung', CAST(N'2022-01-17' AS Date))
INSERT Favorites  VALUES ( N'vd7 ', N'thanhthuy', CAST(N'2022-01-12' AS Date))
INSERT Favorites  VALUES ( N'vd9 ', N'trunghung', CAST(N'2022-01-05' AS Date))
INSERT Favorites  VALUES ( N'vd2 ', N'thuha', CAST(N'2022-01-07' AS Date))
INSERT Favorites  VALUES ( N'vd1 ', N'hoangkim', CAST(N'2022-01-02' AS Date))
INSERT Favorites  VALUES ( N'vd4 ', N'hungthinh', CAST(N'2022-01-09' AS Date))
INSERT Favorites  VALUES ( N'vd3 ', N'trungkien', CAST(N'2022-02-10' AS Date))
INSERT Favorites  VALUES ( N'vd8 ', N'huyphi', CAST(N'2022-02-06' AS Date))
INSERT Favorites  VALUES ( N'vd7 ', N'honglinh', CAST(N'2022-02-03' AS Date))
INSERT Favorites  VALUES ( N'vd9 ', N'ducduy', CAST(N'2022-02-04' AS Date))
INSERT Favorites  VALUES ( N'vd2 ', N'thanhthuy', CAST(N'2022-02-06' AS Date))
INSERT Favorites  VALUES ( N'vd15', N'ducduy', CAST(N'2022-02-10' AS Date))
INSERT Favorites  VALUES ( N'vd24', N'thanhthuy', CAST(N'2022-02-07' AS Date))
GO

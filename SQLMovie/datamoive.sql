insert into GENREVIDEO values 
(N'Hành Động'),
(N'Tình Cảm'),
(N'Kinh Dị'),
(N'Khoa Học Viễn Tưởng'),
(N'Hoạt Hình'),
(N'Hài Kịch')

select * from GENREVIDEO
select * from VIDEO where idgenre = 1
/*
id int identity(1,1) primary key,
	title NVARCHAR(60) NOT NULL,
	poster NVARCHAR(235) ,
	[views] INT DEFAULT 0,
	link  NVARCHAR(100) unique NOT NULL,
	descriptions TEXT NOT NULL,
	active BIT DEFAULT 0 ,
	vip BIT DEFAULT 0,
	quality VARCHAR(10) NOT NULL,
	dayupload datetime  default getdate() ,
	times INT not null,
	idgenre INT,
	CONSTRAINT FK_GENREVIDEO FOREIGN KEY( idgenre) REFERENCES GENREVIDEO(id),
*/






insert into VIDEO(title,poster,link,descriptions,active,quality,times,idgenre) values
(N'Xóm Chùa',N'xomchua.jpg',N'UCXao7aTDQM',N'Trong phim, sau sự kiện của "Man of Steel", người dân thành phố Metropolis chia thành hai phe: một phe tôn vinh Superman là siêu anh hùng và phe còn lại không tin tưởng anh ta và cho rằng anh ta có thể trở thành một mối đe dọa đến sự an toàn của nhân loại. Trong khi đó, Batman, người đã bị tàn phá bởi cuộc chiến của Superman và Zod trong "Man of Steel", quyết định sẽ tiêu diệt Superman để bảo vệ sự an toàn của thế giới.',
1,N'4K HDR',160,1),
(N'Duyên Ý Trời',N'love.jpg',N'0cMQ5mPpj-Y',N'"Spider-Man: No Way Home" là bộ phim siêu anh hùng của Mỹ được sản xuất bởi Marvel Studios và Columbia Pictures. Phim là phần tiếp theo của loạt phim Spider-Man với sự tham gia của diễn viên Tom Holland trong vai Peter Parker/Spider-Man.',
1,N'FULLHD+',130,1),
(N'IronMan',N'ironmansoci.png',N'kgfNvOTPAJo',N'Trong phim, sau sự kiện của "Man of Steel", người dân thành phố Metropolis chia thành hai phe: một phe tôn vinh Superman là siêu anh hùng và phe còn lại không tin tưởng anh ta và cho rằng anh ta có thể trở thành một mối đe dọa đến sự an toàn của nhân loại. Trong khi đó, Batman, người đã bị tàn phá bởi cuộc chiến của Superman và Zod trong "Man of Steel", quyết định sẽ tiêu diệt Superman để bảo vệ sự an toàn của thế giới.',
1,N'HD',140,1),
(N'Trở Về Từ Địa Ngục',N'theghost.jpg',N'KgOtLOUdCMQ',N'"Spider-Man: No Way Home" là bộ phim siêu anh hùng của Mỹ được sản xuất bởi Marvel Studios và Columbia Pictures. Phim là phần tiếp theo của loạt phim Spider-Man với sự tham gia của diễn viên Tom Holland trong vai Peter Parker/Spider-Man.',
1,N'2K+ HDR',180,1),
(N'One Piece',N'onepiecefilm.jpg',N'79RVbOOT4ew',N'"Spider-Man: No Way Home" là bộ phim siêu anh hùng của Mỹ được sản xuất bởi Marvel Studios và Columbia Pictures. Phim là phần tiếp theo của loạt phim Spider-Man với sự tham gia của diễn viên Tom Holland trong vai Peter Parker/Spider-Man.',
1,N'2K+ HDR',180,1)


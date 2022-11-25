var createError = require('http-errors');
var express = require('express');
var path = require('path');
var cookieParser = require('cookie-parser');
var logger = require('morgan');

var indexRouter = require('./routes/index');
var usersRouter = require('./routes/users');

var app = express();

// view engine setup
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'jade');

app.use(logger('dev'));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public')));

app.listen(8976);
app.get("/xy.calculate", function(req, res) {
	var x = req.query.x*1;
	var y = req.query.y*1;
	
	var cal = {
			
	};
	res.send("" + (x + y));
});

app.get("/jjh.bye", function(req, res) {
	//					주소/DB이름 				 		["배열명","배열명", "배열명"]
	var db = require("mongojs")("192.168.0.158/jangjunhee", ["sep01_comment"]);
	// require로 불러온 mongojs가 원래 MongoDB에서 쓰던 문법 그대로 쓸 수 있게 해준다.
	
	// find를 하고 난 다음 실행될 함수라는 뜻이며 err는 e.printtrackrace 같은 느낌, result가 가져온 값
	db.sep01_comment.find(function(err, result) {
		res.send(result);
	});
});

// catch 404 and forward to error handler
app.use(function(req, res, next) {
  next(createError(404));
});

// error handler
app.use(function(err, req, res, next) {
  // set locals, only providing error in development
  res.locals.message = err.message;
  res.locals.error = req.app.get('env') === 'development' ? err : {};

  // render the error page
  res.status(err.status || 500);
  res.render('error');
});

module.exports = app;

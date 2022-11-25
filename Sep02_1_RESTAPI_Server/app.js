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

app.listen(5343);
app.get("/snack.get", function(req, res) {
	var mjs = require("mongojs");
	var db = mjs("192.168.0.158/snack",["sep02_snack"]);
	
	db.sep02_snack.find().sort({s_name:1}, function(e, result) {
		res.header("Access-Control-Allow-Origin", "*");
		res.send(result);
	});
});

app.get("/snack.reg", function(req, res) {
	var mjs = require("mongojs");
	var db = mjs("192.168.0.158/snack",["sep02_snack"]);
	
	var name = req.query.n;
	var price = req.query.p * 1;
	
	db.sep02_snack.insert(
			{
				s_name: name,
				s_price: price,
				s_exp : new Date()
			}, function(e, result) {
				res.header("Access-Control-Allow-Origin", "*");
				res.send(result);
			}
			);
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

function alertFunc() {
	alert("Hello world")
}

function docFunc() {
	document.write("Hello world")
}

function editBuah() {
	var buah = ["mangga", "apel", "jeruk"]
	buah.push('nangka', 'durian', 'semangka')

	console.log(buah)
	console.log(buah.splice(1, 1, 'nanas', 'pisang'))
	console.log(buah)
	console.log(buah.slice(1, 6))
	console.log(buah)
}

function filterBuah() {
	var buah = ["mangga", "apel", "jeruk"]
	var dataFil = 'jeruk'
	console.log(buah.filter(item =>
		dataFil.includes(item)))

}

function forEachFunc() {
	var angka = [1, 2, 3, 4]

	angka.forEach(item =>
		console.log(item * item))
}

function objLiteral() {
	var biodata1 = {
		name: "Robert",
		class: "12AP",
		age: 18
	}

	console.log('for in')
	for (item in biodata1) {
		console.log(biodata1[item])
	}

	console.log('for entries')
	Object.value(biodata1).forEach(item => {
		console.log(item)
	})
}


var myHoby = {
	hoby: "football",
	func: function() {
		var self = this;
		document.write("outer func: this.hoby= " + this.hoby + "<br />");
		document.write("outer func: self.hoby= " + self.hoby + "<br />");
		(function() {
			document.write("inner func: this.hoby= " + this.hoby + "<br />");
			document.write("inner func: self.hoby= " + self.hoby + "<br />");
		}())
	}
}

myHoby.func();

function tokoBuku() {
	var buku = {
		judul: "Spring in Action",
		pengarang: "Craig Walls",
		harga: 360979
	}

	for (item in buku) {
		console.log(buku[item])
	}
}

document.write(isNaN("False") + "<br />");
document.write(isNaN(100.9) + "<br />");
document.write(isNaN(200) + "<br />");
document.write(isNaN("900") + "<br />");


function awesomeFunction() {
	var a = 2;

	var multiplyBy2 = function() {
		console.log(a * 2);
	}
	console.log(a);
	multiplyBy2();
}

var grand_total = eval("10*20/2")
var text="halo"
var angka="200"

console.log(grand_total);
console.log(text);
console.log(angka);

a=10;
b=200;

function add(){
console.log(a+b);
}

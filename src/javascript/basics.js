//Output
console.log("hallo");

//Datentypen
number
string
boolean

//operationen
// + - * /
var a = 1+1*1-1/1;
//zuweisung
a = 1;
//vergleich
var b = a == 2;
//logik
var c = b && true || b && false;


// if else statements
if(a){
}
else if(b){
}
else{
}
// switch
switch(expression){
case x:break;
case y:break;
default: ;
}
//for loop
for(let i=0;i<10;i++){}

var numbers={1,2,3};

numbers.forEach();
//while loop
//do while loop
//break continue
//functions
//function parameters
//return statement

//object
var car={
    reifen:4,
    farbe:schwarz,
    hersteller:bmw
}

// Neue Objekte erzeugen
var flight = new Flight("828","missed")
function Flight(flightNumber, status) {
    //fix the constructor
    this.number = flightNumber;
    this.status = status;
};

//methoden zu objekten hinzufügen
//arrays
//array methods und properties
//Math objekt
// date objekt
//DOM
//Selecting elements
//changing elements
//adding and removing elements
//handling events
//event propagation
//form validation

//ES6
//Variablentypen
var a; //kann global eingesetzt werden, bezieht sich in einer klammer auf die ganze funktion
let b; // kann nicht global eingesetzt werden, bezieht sich nur auf die klammer in der sie deklariert ist
const konstante; // nicht änderbar

//template literals
let name = 'David';
let msg = `Welcome ${name}!`;
console.log(msg);

//loops and functions
//über die keys des objekts iterieren
let obj = {a: 1, b: 2, c: 3};
for (let v in obj) {
    console.log(v);
}

//über iterierbares objekt iterieren
let list = ["x", "y", "z"];
for (let val of list) {
    console.log(val);
}
for (let ch of "Hello") {
    console.log(ch);
}

//functions
const add = (x,y) => {
    return x+y;
}
var result = add(1,2);

//pfeilnotation auch in array methoden einsetzbar
const arr = [2, 3, 7, 8];
arr.forEach(v => {
    console.log(v * 2);
});

//default values in functions
const multiply = (a, b=1) = {
    return a*b
}
console.log(multiply(5));

//objects
let tree = {
    height: 10,
    color: 'green',
    grow() {
        this.height += 2;
    }
};

tree.grow();
console.log(tree.height);

//Destructoring
let a = () => {
    return [1, 3, 2];
};

let [one, , two] = a();

console.log(one); // 1
console.log(two); // 2


var o = {h: 42, s: true};
var {h: foo, s: bar} = o;

//console.log(h); // Error
console.log(foo); // 42

//Rest
function containsAll(arr, ...nums) {
    for (let num of nums) {
        if (arr.indexOf(num) === -1) {
            return false;
        }
    }
    return true;
}

let x = [2, 4, 6, 7];
console.log(containsAll(x, 2, 4, 7));
console.log(containsAll(x, 6, 4, 9));

//Spread
const myFunction = (w, x, y, z) => {
    console.log(w + x + y + z);
};
let args = [1, 2, 3];
myFunction(...args, 4);

//spread bei objekten
const obj1 = { foo: 'bar', x: 42 };
const obj2 = { foo: 'baz', y: 5 };

const clonedObj = { ...obj1 }; // { foo: "bar", x: 42 }
const mergedObj = { ...obj1, ...obj2 }; // { foo: "baz", x: 42, y: 5 }

//ES6 classes
//Mit Rectangle named class, ging aber auch ohne Rectangle
var Square = class Rectangle {
  constructor(height, width) {
    this.height = height;
    this.width = width;
  }
  //getter
  get area() {
      return this.calcArea();
    }
  //prototype method
  calcArea() {
    return this.height * this.width;
  }
  //static methode wird nicht auf instanz aufgerufen sondern mit Rectangle.distance
  static distance(a, b) {
    return this.height * 2;
  }
}

//Vererbung
class Animal {
  constructor(name) {
    this.name = name;
  }
  speak() {
    console.log(this.name + ' makes a noise.');
  }
}

class Dog extends Animal {
  speak() {
    console.log(this.name + ' barks.');
  }
}

//Wenn man die Methode der Elternklasse aufrufen will macht man das mit super
class Dog extends Animal {
  speak() {
  super.speak();
    console.log(this.name + ' barks.');
  }
}

//ES6  map & set
map hat key value paare
set ist wie ein array nur ohne doppelungen

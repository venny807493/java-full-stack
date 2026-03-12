// Traditional function
function add(a, b) {
  return a + b;
}

// Arrow function
const addArrow = (a, b) => a + b;

const double = n => n * 2;

const greet = () => console.log("Hello!");

console.log(add(2,3));
console.log(addArrow(2,3));
greet();
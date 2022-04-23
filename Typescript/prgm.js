//let isDone: boolean = false
/* string
let color:string="blue";
color='red';
console.log(color);*/
/* Array
let list:number[]=[1,2,3];
console.log(list);*/
//let list1:Array<number>=[1,2,3];
//Tuple
//declare a tuple type
/*let x:[string,number];
//intialize it
x=["hello",10];
console.log(x);*/
/*Enum
enum color{red=1,green,blue}
let c:color=color.green;
console.log(c);*/
/*Any
let notSure:any=4;
notSure= "maybe a string instead";
notSure=false;
console.log(notSure);
let list:any[]=[1,true,"free"];
list[1]=true;
console.log(list);*/
/*void
function warnUser():void{
    console.log("Thhis is my warning message");
}
let unusuable:void=undefined;
console.log(unusuable);*/
/*null and undefined
let u:undefined=undefined;
let n:null=null;
console.log(u);
console.log(n);*/
/*type assertions
let someValue:any="this is a string";
let strLength:number=(<string>someValue).length;
console.log(someValue);
console.log(strLength);
let code:any=123;
let unknown=<number>code;
*/
//classes
/*class Greeter
{
    greeting: string;
    constructor(message:string)
    {
        this.greeting=message;
    }
    greet()
    {
        console.log("hello" +this.greeting);
    }
}
let greeter = new Greeter("mounika");
greeter.greet();*/
//Inheritance
/*class Animal{
    move(distanceInMeters:number=0){
        console.log(`Animal moved ${distanceInMeters}m.`);
    }
}
class  Dog extends Animal {
    bark() {
      console.log('woof!woof');

    }
}
const dog=new Dog();
dog.bark();
dog.move(10);*/
// dog.bark();
//Read only modifier
/*class Octopus
{
   readonly name:string;
   readonly numberOfLegs:number=8;
   constructor(theName:string)
    {
       this.name=theName;
       console.log(this.name);
   }
    
}
 let dad=new Octopus("octopus");*/
//interface
/*interface emp{
    roll:any;
    name1:any;

}
let emp=<emp>{};
emp.name1="mounika";
emp.roll=23;
console.log(emp);*/
//never
function keepProcessing() {
    while (true) {
        console.log('i have done something');
    }
}
keepProcessing();

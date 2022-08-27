'use strict'


console.log("--------------Ham-------------");
/*
function fruitProcessor(oranges =prompt("Enter oranges: "), apples =prompt("Enter apples: ")) {

    
    const  juice = `Juice with ${apples} apples and ${oranges} oranges `
    return juice;
}

const a = fruitProcessor()  
console.log(a );*/
/*
function calcAge1(dob) {
    
return 2000 -dob
}

const age1 = calcAge1(1991)
const age2 = calcAge1(1996)
console.log(age1)
console.log(age2)
console.log("--------------Arrow Function - Hàm mũi tên-------------");
    // bien     
const calcAge3 = dob3 => 2037 - dob3
const age3 = calcAge3(1991)
console.log(age3 );


const yearsUntilRetirement = (dob3,name) =>{
    const age3 = 2037 - dob3
    const retirement =65 -age3
    return `${name}: ${retirement}`
}

console.log(yearsUntilRetirement(1991,'asfdfsd'))
console.log(yearsUntilRetirement(1992,'asfdf33sd'))
console.log("--------------Hàm trong hàm-------------");

function cutPrice(fruit) {
    return fruit *4;
}

function fruitProcessor(oranges =prompt("Enter oranges: "), apples =prompt("Enter apples: ")) {

    //bien chua
    const applePrice = cutPrice(apples);
    const orangePrice = cutPrice(oranges);
    const  juice = `Juice with ${applePrice} apples and ${orangePrice} oranges `
    return juice;
}
const a = fruitProcessor()  

console.log(a );
*/
// ten, tuoi, tuoi nghi huu
function tinhTuoi(namSinh) {
    return 2022 - namSinh;
}


function tuoiNghiHuu(tuoi,ten) {
    const age = tinhTuoi(tuoi);
   
    if (age>=60) {
        return `${ten}: ${age} tuoi`
        
    } else {
        return -1
    }
   
}
console.log(tuoiNghiHuu(1902,"sdafsdfasdas"));


console.log("--------------Mang-------------");
const friend = ['a','b','c','d']
console.log(friend);
console.log(friend[friend.length - 1]); // lay vi tri
//sua
friend[2] = "sdfasdf"
console.log(friend);


function calcAge(birthYeah) {
    return 2037 - birthYeah
}
const  year=[1990,1992,1995,1998]
console.log(calcAge(year[0]));
console.log(calcAge(year[1]));


// Lab 4.1. Hàm (10 phút)
/*
function describeCountry(country=prompt("Enter Country: "),population=prompt("Enter Population: "),capitalCity=prompt("Enter CapitalCity: ")) {
    return `${country} has ${population} million people and its capital city is ${capitalCity}`
}
console.log(describeCountry());
*/
// Lab 4.2. Khai báo hàm với biểu thức hàm (20 phút)
const percentageOfWorld1 = function(population){
    const resulutpopulation =(population/7900)*100
    return resulutpopulation
}
console.log(percentageOfWorld1(1441));
console.log(percentageOfWorld1(70));
console.log(percentageOfWorld1(200));
console.log("---------------");
function percentageOfWorld2(population){
    const resulutpopulation =(population/7900)*100
    return `${resulutpopulation}`
}
console.log(percentageOfWorld2(1441));
console.log(percentageOfWorld2(70));
console.log(percentageOfWorld2(200));
console.log(percentageOfWorld2(300));

// Lab 4.3. Hàm mũi tên (5 phút)
console.log("--------Lab 4.3. Hàm mũi tên (5 phút)-------");
    //ten ham           //tham so   //than ham   
const percentageOfWorld3=population=>(population/7900)*100
console.log(percentageOfWorld3(1441));

console.log("--------Lab 4.4. Hàm gọi hàm (15 phút)-------");
console.log();
function describePopulation(population,country) {
    const calcPopulation = percentageOfWorld1(population);
    return `${country} has 1441 million people, which is about ${calcPopulation}% of the world`
}
console.log(describePopulation(1441,"China"));


console.log("--------Lab 4.5. Giới thiệu về Array (15 phút)-------");
const populations=[1441,70,200,300]
console.log(populations);
console.log("---------------");

const percentages = [percentageOfWorld1(populations[0]),percentageOfWorld1(populations[1]),percentageOfWorld1(populations[2]),percentageOfWorld1(populations[3])]
console.log(percentages);

console.log("--------Lab 4.6. Các phép toán cơ bản với array (25 phút)-------");
//viet nam
const neighbours = ['Trung Quoc',"Thai lan","Lao"]
neighbours.push("Utopia")
neighbours.shift("Utopia")

console.log(neighbours);
if (neighbours.includes("Germany")) {
    console.log("co Germany");
} else {
    console.log("Probably not a central European country :D");
    
}
neighbours[2] = "Campuchia"
console.log(neighbours);


console.log("-------Lab 4.7.1. Đội nào chiến thắng? (phần 2)--------");
console.log("-------Dữ liệu 1:--------");

const calcAverage=(score1,score2,score3)=>(score1+score2+score3)/3
let scoreDolphins =calcAverage(44, 23 ,71 )
let scoreKoalas  =calcAverage(65, 54 , 49 )
console.log("scoreDolphins: "+scoreDolphins+" "+"scoreKoalas: "+scoreKoalas);

function checkWinner(avgDolphins ,avgKoalas){
    if (avgDolphins >=2*scoreKoalas) {
        console.log(`Dolphins win (${avgDolphins} vs. ${avgKoalas})`);
    } else if (avgDolphins <=2*scoreKoalas) {
        console.log(`Koalas win (${avgDolphins} vs. ${avgKoalas})`);
    } else{
        console.log(`No team win`);
    }
}
checkWinner(scoreDolphins,scoreKoalas)

console.log("-------Dữ liệu 2:--------");

const calcAverage2=(score1,score2,score3)=>(score1+score2+score3)/3
let scoreDolphins2 =calcAverage2(85, 54 , 41 )
let scoreKoalas2  =calcAverage2(23, 34 , 27)
console.log("scoreDolphins2: "+scoreDolphins2+" "+"scoreKoalas2: "+scoreKoalas2);

function checkWinner2(avgDolphins ,avgKoalas){
    if (avgDolphins >=2*scoreKoalas2) {
        console.log(`Dolphins win (${avgDolphins} vs. ${avgKoalas})`);
    } else if (avgDolphins <=2*scoreKoalas2) {
        console.log(`Koalas win (${avgDolphins} vs. ${avgKoalas})`);
    } else{
        console.log(`No team win`);
    }
}
checkWinner2(scoreDolphins2,scoreKoalas2)


console.log("-------Lab 4.7.2. Xây dựng Tip calculator (phần 2)--------");
const calcTip =bill=> bill>=50 &&bill<=300?bill*0.15:bill*0.2

const bills=[125, 555 , 44]
const tips=[calcTip(bills[0]), calcTip(bills[1]), calcTip(bills[2])]
console.log(bills , tips);
const total=[bills[0]+tips[0],bills[1]+tips[1],bills[2]+tips[2],]
console.log(total);

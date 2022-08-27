
let mark  ={
    name:"Mark",
    mass:78,
    height:1.69,
    //  bmi: bmi
}
let markHigherBMI = mark.mass/(mark.height*mark.height)
let john ={
    name:"John",
    mass:92,
    height:1.95,
    
}
let johnHigherBMI = john.mass/(john.height*john.height)


let mark2  ={
    name:"Mark",
    mass:95,
    height:1.88,
    
}
let mark2HigherBMI = mark.mass/(mark2.height*mark2.height)
let john2 ={
    name:"John",
    mass:85,
    height:1.76,
    
}
let john2HigherBMI = john.mass/(john2.height*john2.height)


// console.log(100/[1.69]^2)
console.log(mark)
console.log("BMI Mark: "+markHigherBMI)
console.log(john)
console.log("BMI John: "+johnHigherBMI)
console.log("---------Truong hop 1----------")

if (markHigherBMI > johnHigherBMI) {
    console.log("Mark's BMI is higher than John's!")
} else {
    console.log("John's BMI is higher than Mark's!")
    
}
console.log("-------------------")
if (markHigherBMI > johnHigherBMI) {
    console.log(`Mark's BMI (${markHigherBMI}) is higher than John's (${johnHigherBMI})!`)
} else {
    console.log(`john's BMI (${johnHigherBMI}) is higher than mark's (${markHigherBMI})!`)

}
console.log("---------Truong hop 2----------")
if (mark2HigherBMI > john2HigherBMI) {
    console.log("Mark's BMI is higher than John's!")
} else {
    console.log("John's BMI is higher than Mark's!")
    
}
console.log("-------------------")
if (mark2HigherBMI > john2HigherBMI) {
    console.log(`Mark's BMI (${mark2HigherBMI}) is higher than John's (${john2HigherBMI})!`)
} else {
    console.log(`john's BMI (${john2HigherBMI}) is higher than mark's (${mark2HigherBMI})!`)

}
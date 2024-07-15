const { log } = require('node:console');
const path = require('node:path');

console.log(path.isAbsolute("https://github.com/NimavatMansi-19/darshan-university-sem-3/tree/main/Web%20Technology"))
console.log(path.basename("D:\\Roll no114\\lab 7\\CallBack"))
console.log(path.dirname("D:\\Roll no114\\lab 7\\CallBack"))
console.log(path.normalize("D:\\Roll no114\\lab 7\\CallBack"))
console.log(path.extname("D:\\Roll no114\\lab 7\\CallBack.html"))
console.log(path.format({
    dir: 'D:\\Roll no114\\lab 7',
    base: 'CallBack.html',
  }));
  console.log(path.join("abc","foo"));
  console.log(path.parse('D:\\Roll no114\\lab 7\\CallBack.html'))
  console.log(path.relative('D:\\Roll no114\\lab 7\\CallBack.html','abc'))
  console.log(path.resolve('wwwroot', 'static_files/png/', '../gif/image.gif'));//same as join
  console.log("D:\\Roll no114\\lab 7\\CallBack.html".split(path.sep))
  console.log(path.toNamespacedPath("D:\\Roll no114\\lab 7\\CallBack.html"))
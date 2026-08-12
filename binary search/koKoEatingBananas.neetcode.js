function  minEatingSpeed(piles, h) {
if (piles.length === h) {
    return Math.max(...piles);
}
let cnt = 0;
for(let i = 0;i<=piles.length-1;i++){
    cnt = cnt + piles[i];

}
if(cnt < h) return  1;

 else return Math.ceil(cnt/h);

}

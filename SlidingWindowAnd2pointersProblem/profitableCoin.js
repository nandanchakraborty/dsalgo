 function maxProfit(prices){
     let ip=0,jp=0,i;
    for(let i =0;i<prices.length;i++){
    
        if(prices[jp]< prices[ip] && jp != i){
            ip = jp;
            
        }
        jp++;
    }
    if(prices[jp] === prices[prices.length-1] ) return 0;
    let buyingPoint = ip;
    jp = ip+1;
    for(let i =ip;i<prices.length;i++){
        if(prices[jp]> prices [ip]){
            ip = jp;
        }
        jp++;

    }
    let sellingPoing = ip;
    return prices[sellingPoing]-prices[buyingPoint];

 }

 prices =  [10,1,5,6,7,1]
 console.log(maxProfit(prices));
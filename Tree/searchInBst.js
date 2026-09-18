class Node{
    constructor(value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
class BST{
    constructor(){
        this.root = null;
    }

    insert(value){
        const newNode = new Node(value);
        if(this.root === null){
            this.root = newNode;
            return;
        }
        let current = this.root;
        while(true){
            if(value < current.value){
                if(current.left === null){
                    current.left = newNode;
                    return;
                }
                current = current.left;

            }
            else if(value > current.value){
                if(current.right === null){
                    current.right = newNode;
                    return;
                }
                current = current.right;
            }
            else{
                return ;//duplicate value;
            }
        }
    }
    //searching
    search(value){
        let current = this.root;
        while(current != null){
            if(value === current.value) return true;
            else if(value < current.value){
                current = current.left;
            }
            else current = current.right;

        }
        return false;

    }
    findMaximum(){
      let current = this.root;
        if(current === null){
            return
        }
        while(current.right != null){
            current = current.right;
        }
        return current.value;
            
        }

    }


const tree = new BST();
tree.insert(10);
tree.insert(5);
tree.insert(15);
tree.insert(2);
console.log(tree.root);

console.log(tree.search(15));   // true
console.log('maximum value '+tree.findMaximum())


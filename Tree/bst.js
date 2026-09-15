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
}

const tree = new BST();
tree.insert(10);
tree.insert(5);
tree.insert(15);
tree.insert(2);
console.log(tree.root);
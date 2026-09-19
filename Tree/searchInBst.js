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

    insert(value){ //insert a value
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
    search(value){//search a value in tree
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

    deleteAleaf(value){ //node that had no child
          if (this.root === null) {
        return;
    }

    if (
        this.root.value === value &&
        this.root.left === null &&
        this.root.right === null
    ) {
        this.root = null;
        return;
    }
        let current = this.root;
        while(current != null){
            if(value < current.value){
                if(current.left !== null &&
                current.left.value === value &&
                current.left.left === null &&
                current.left.right === null){
                    current.left = null;
                    return;
                }
                current = current.left;
            }
            else if(value > current.value){
                if(current.right !== null &&
                current.right.value === value &&
                current.right.left === null &&
                current.right.right === null){
                    current.right = null;
                    return;
                }
                current = current.right;
            }
            else return;

            
        }
    } 
    
    // deleteANodeWithOneChild(){
    //     if(this.root === null) return;
    //     let current = this.root;
    //     if(current.left === null ){
    //         if(current.right != null && current.right.left != null ){
    //             current = current.right.left;
    //             return;
    //         }
    //         else if(current.right != null && current.right.right != null){
    //             current = current.right.right;
    //             return;
    //         }
    //         current = current.right;

    //     }
    //     else if(current.right === null ){
    //         if(current.left != null && current.left.left != null ){
    //             current = current.left.left;
    //             return;
    //         }
    //         else if(current.left != null && current.left.right != null){
    //             current = current.left.right;
    //             return;
    //         }
    //         current = current.left;

    //     }
        
    //     }


    }

    


const tree = new BST();
tree.insert(10);
tree.insert(5);
tree.insert(15);
tree.insert(2);
console.log(tree.root);

console.log(tree.search(15));   // true
console.log('maximum value '+tree.findMaximum())


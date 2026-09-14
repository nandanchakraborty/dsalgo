class Node{
    constructor(value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
const root = new Node(10);
const node5 = new Node(5);
const node15 = new Node(15);

root.left = node5;
root.right=node15;

const node2 = new Node(2);
const node7 = new Node(7);

node5.left = node2;
node5.right = node7

console.log(root);

function inorder(root){
    if(root === null) return;

    inorder(root.left);
    console.log(root.value);
    inorder(root.right);
    

}
console.log('inorder traversal')

inorder(root);

function preorder(root){
    if(root === null) return;

    console.log(root.value);
    preorder(root.left);

    preorder(root.right);
    

}
console.log('preorder traversal')
preorder(root);

function postorder(root){
    if(root === null) return;

    postorder(root.left);

    postorder(root.right);
  console.log(root.value);
    

}


console.log('postorder traversal');
postorder(root);

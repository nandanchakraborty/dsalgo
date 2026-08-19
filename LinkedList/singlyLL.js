class Node {
	constructor(value) {
		this.value = value;
		this.next = null;
	}
}

class LinkedList {
	constructor() {
		this.head = null;
	}
	append(value) {
		let newnode = new Node(value);
		if (!this.head) {
			this.head = newnode;
			return;
		}
		let current = this.head;
		while (current.next) {
			current = current.next;
		}
		current.next = newnode;
	}
	addBeforeHead(value) {
		let newNode = new Node(value);
		newNode.next = this.head;
		this.head = newNode;
	}

	printList() {
		let current = this.head;
		while (current) {
			console.log(current.value);
			current = current.next;
		}
		console.log("null");
	}
}

let list = new LinkedList();

list.append(10);
list.append(20);
list.append(30);
list.printList();
console.log("adding infront of head");
list.addBeforeHead(40);
list.printList();

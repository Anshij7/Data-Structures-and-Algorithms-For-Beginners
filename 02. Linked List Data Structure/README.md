![1](https://user-images.githubusercontent.com/97989643/197402860-cf916c6a-b087-4f24-8e5e-3bb6fcfe88e3.png)

![2](https://user-images.githubusercontent.com/97989643/197402868-43a5b1d4-f007-47f3-a084-0fedb626d124.png)

![3](https://user-images.githubusercontent.com/97989643/197404542-c72bc717-b56e-4cdb-b431-7046036879d3.png)


![4](https://user-images.githubusercontent.com/97989643/197409504-58991d12-509e-4c2b-b452-5c4ebf57f1ad.png)

### pseudocode

```java
NODE *FrontInsertion(int data, NODE *head){
	NODE *newnode = createNode(data);
	if(head == NULL){
		head = newnode;
	}
	else{
		newnode->next = head;
		head = newnode;
	}
	return head;
}
```


![1](https://user-images.githubusercontent.com/97989643/197402860-cf916c6a-b087-4f24-8e5e-3bb6fcfe88e3.png)

![2](https://user-images.githubusercontent.com/97989643/197402868-43a5b1d4-f007-47f3-a084-0fedb626d124.png)

![3](https://user-images.githubusercontent.com/97989643/197404542-c72bc717-b56e-4cdb-b431-7046036879d3.png)


![4](https://user-images.githubusercontent.com/97989643/197409504-58991d12-509e-4c2b-b452-5c4ebf57f1ad.png)

![5](https://user-images.githubusercontent.com/97989643/197409642-588735f7-b1d7-4014-8951-0d93b61e9d95.gif)

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

![6](https://user-images.githubusercontent.com/97989643/197414247-011e8a74-b3bc-42d3-9ab0-153ccfe85be2.png)

![7](https://user-images.githubusercontent.com/97989643/197421812-d54db418-93d5-4783-8650-f7cdca2480fb.png)


![8](https://user-images.githubusercontent.com/97989643/197421816-747099c6-5f36-45b3-a953-b4f4601f18d2.gif)

### pseudocode

```java
NODE *InsertatIndex(int data, NODE *head, int index){
	NODE *newnode = createNode(data);
	NODE *temp = head;
	int count=0;
	while(count != index-1){
		temp = temp->next;
		count++;
	}
	//temp reaches the index before the target index
	newnode->next = temp->next;
	temp->next = newnode;
	
	return head;
}
```
![9](https://user-images.githubusercontent.com/97989643/197425890-b62aefcd-6c59-4e77-beaa-7d52ab6526bd.png)

![10](https://user-images.githubusercontent.com/97989643/197429850-34f79fcd-c129-4a78-acb5-67233c8b600a.png)

![11](https://user-images.githubusercontent.com/97989643/197429865-425cb0c6-8643-4181-bdc5-239417d33396.gif)






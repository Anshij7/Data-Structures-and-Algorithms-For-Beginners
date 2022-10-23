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


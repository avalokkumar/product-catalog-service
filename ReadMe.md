### Setting Up Mongo DB
	o	Install mongo db
	o	Go to the installed directory (Ex: C:\Program Files\MongoDB\Server\3.2)
	o	Go to the bin directory and run mongod.exe.
	o	Then, run the mongo.exe to execute command on shell or install any Mongo DB client( Ex: Robomongo)
	o	Create a db ecoffee and now you are ready to go.
	
> Note:  
- mongo db dump added with the project with Name "estore". 
- Copy and paste it in local drive. 
- Go to the directory where the dump is pasted.
- Run command "mongorestore --db estore" to restore database backup

-------------------------------------------------------------------------

### product-catalogue-service

#### Endpoint-I

* Description - Add a Product
* URL - http://localhost:8282/api/dev/estore/v1/product/
* Method: POST

* Request:

```json
{
	"name": "Mangoes",
	"description": "mangoes form malabar",
	"price": 100,
	"currency": "INR",
	"productType": "Fruits",
	"category": "Grocery"
}
```



#### Endpoint-II

* Description - Retrieve a list of products based on product type
* URL - http://localhost:8282/api/dev/estore/v1/product/type/{productType}
	  Ex: productType - Fruit
* Method: GET
* Path Variable - Provide Product id

* Sample Response:

```json
{
    "payload": [
        {
            "id": "5accb2251ea37331fc73cb76",
            "name": "Apples",
            "description": "Fresh Apples from Kashmir",
            "price": 50,
            "currency": "INR",
            "productType": "Fruit",
            "category": "Grocery",
            "createdTime": "2018-04-10T18:44:07.495",
            "modifiedTime": "2018-04-10T18:44:07.496"
        },
        {
            "id": "5accb2701ea37331fc73cb77",
            "name": "Mangoes",
            "description": "mangoes form malabar",
            "price": 100,
            "currency": "INR",
            "productType": "Fruit",
            "category": "Grocery",
            "createdTime": "2018-04-10T18:44:07.497",
            "modifiedTime": "2018-04-10T18:44:07.498"
        }
    ],
    "problems": [],
    "timeStamp": "2018-04-10T18:44:08.681"
}
```

#### Endpoint-III

* Description - Remove a product from from the catalogue
* URL - http://localhost:8282/api/dev/estore/v1/product/{productId}
* Method: DELETE
* Path Variable - Provide product id
* Response: None


#### Endpoint-IV

* Description - Get Product by Id
* URL - http://localhost:8282/api/dev/estore/v1/product/{productId}
* Method: GET
* Path Variable - Provide product id
* Response: None


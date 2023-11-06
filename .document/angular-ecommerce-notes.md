```shell
## install angular cli
npm install -g @angular/cli

## check angular cli version
ng version

## create angular-ecommerce project
ng new angular-ecommerce
### Routing: N; css

## run & build angular project
npm run start
npm run build

```

```shell
npm install bootstrap
npm install @fortawesome/fontawesome-free
npm install @ng-bootstrap/ng-bootstrap

ng add @angular/localize
## change angular.json file
"styles": [
"src/styles.css",
"node_modules/bootstrap/dist/css/bootstrap.min.css",
"node_modules/@fortawesome/fontawesome-free/css/all.min.css"
]

## create product-list component
ng g c components/product-list

## create product class
ng g class common/product

## create product Service
ng g service services/product


## create product-category-menu components
ng g c components/product-category-menu

## create product-category class
ng g class common/product-category

## create search component
ng g c components/search

## create product-detail component
ng g c components/product-detail

## cart
ng g class common/cart-item
ng g component components/cart-status
ng g service services/cart

##change tsconfig.json
"compilerOptions": {
  ....
  "strict": false,
  "noPropertyAccessFromIndexSignature": false,
  },
  
  "angularCompilerOptions": {
    ...
    "strictDomEventTypes": false
}


## cart details
ng g component components/cart-details

## checkout
ng g component components/checkout
ng g service services/shop-form
ng g class common/country
ng g class common/state

## validators
ng g class validators/CustomValidators
```


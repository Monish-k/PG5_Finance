The front end is completely configured using Angular JS. There are 7 main angular componenets which can be categorized as 7 screens user can see. Every screen is atomic and essential to meet the user's basic requirement.
Apart from this the login has two sub routes.
1) As normal user: To get a credit card and do shoping. This is multi-user site, so at first a user can register at any time and doesnt have any restriction to do so. But, to go beyond that the details provided by the user will be verified by the admin/admins.
2) As admin user: Has the access to provide/revoke any user his/her access. Admin is also multi-user. but, one key difference is, unlike nomrla user the admin user needs to be set-up by any other admin who already have have access and then set-up a new account.

The src/app/ folder shows all the components used. All the components have interaction to the backend api (SpringBoot-Controller). 

Note :
  1) Contains Only Angular Component not the "node" files, please run nvm command to setup the local node files.
  2) The data passed from the front end to back end using angular forms, there isnt any kind of no-sql like mongodb/dynamodb involved.
  3) The data transfered doesnt have any kind of encryption associated with it. 

TODO make a better version soon

# mutations
# mutation signIn{
#   signinUser(auth:{email:"yeung.kye@gmail.com", password: "wouldntYouLikeToKnow"}){
#     token
#     user{
#       id
#       name
#     }
#   }
# }

# mutation  link{
#   createLink(
#     url: "http://www.bbc.co.uk/", 
#     description:"don't believe these ppl"){
#     url
#   } 
# }

# mutation createUser{
#   createUser(
#     name: "Kye Yeung"
#     authProvider:{
#       email: "yeung.kye@gmail.com"
#       password: "wouldntYouLikeToKnow"
#     }
#   )
  
#   {id, name}
# }

# queries
query all{
  allLinks{
    id
    url
    description
    postedBy{
      name
    }
  }
}
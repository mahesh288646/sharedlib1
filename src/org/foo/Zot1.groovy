package org.foo

def checkOutFrom(repo) {
  git branch: "master", credentialsId: 'Git-ID', url: "https://github.com/mahesh288646/${repo}.git"
}

return this
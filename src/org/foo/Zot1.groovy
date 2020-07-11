package org.foo

def checkOutFrom(repo) {
  git branch: "master", credentialsId: 'Git-ID', url: "git@github.com:mahesh288646/${repo}"
}

return this
package org.foo

def checkOutFrom(repo) {
  git branch: master, credentialsId: 'Git-ID', url: "git@github.com:mahesh288646/${repo}"
//        github {
//            id('123') // IMPORTANT: use a constant and unique identifier
//            scanCredentialsId('Git-ID')
//            repoOwner('mahesh288646')
//            repository(${repo})
        }
}

return this
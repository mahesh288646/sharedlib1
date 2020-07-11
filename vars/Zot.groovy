package org.foo

def checkOutFrom(repo) {
  git url: "git@github.com:mahesh288646/${repo}"
}

return this
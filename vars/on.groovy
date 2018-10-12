def pr(String cmd) {
  if (env.GIT_BRANCH.startsWith('PR')) {
    sh cmd
  }
}

def master(String cmd) {
  if (env.GIT_BRANCH == 'master') {
    sh cmd
  }
}

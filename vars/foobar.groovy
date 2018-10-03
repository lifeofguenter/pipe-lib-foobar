def call() {
  try {
    sh 'php --version'
    return true
  } catch(e) {
    return false
  }
}

def call() {
  def causes = currentBuild.rawBuild.getCauses()
  
  echo causes.toArray().toString()
  
  try {
    sh 'php --version'
    return true
  } catch(e) {
    return false
  }
}

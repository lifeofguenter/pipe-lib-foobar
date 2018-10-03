def call() {
  def causes = currentBuild.rawBuild.getCauses()
  
  echo causes
  
  try {
    sh 'php --version'
    return true
  } catch(e) {
    return false
  }
}

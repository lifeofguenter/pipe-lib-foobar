def call() {
  def causes = currentBuild.rawBuild.getCauses()
  
  println causes
  
  try {
    sh 'php --version'
    return true
  } catch(e) {
    return false
  }
}

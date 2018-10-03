def call(script) {
  def causes = currentBuild.rawBuild.getCauses()

  for (cause in causes) {
    if (cause instanceof hudson.triggers.TimerTrigger.TimerTriggerCause) {
      //return true
    }
  }

  
  try {
    script.sh 'php --version'
    return true
  } catch(e) {
    return false
  }
}

@NonCPS

def call() {
  def causes = currentBuild.rawBuild.getCauses()

  for (cause in causes) {
    if (cause instanceof hudson.triggers.TimerTrigger.TimerTriggerCause) {
      echo 'time triggered'
    }
  }

  try {
    sh 'php --version'
    return true
  } catch(e) {
    return false
  }
}

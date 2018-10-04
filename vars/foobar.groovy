def call() {
  //def causes = 'foobar' //= currentBuild.rawBuild.getCauses()
  echo causes.toArray().toString()

  //for (cause in causes) {
  //  if (cause instanceof hudson.triggers.TimerTrigger.TimerTriggerCause) {
  //    //return true
  //  }
  //}

  try {
    sh 'php --version'
    return true
  } catch(e) {
    return false
  }
}

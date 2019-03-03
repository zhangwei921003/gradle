package greeter

class GreetingFormatterSpec {
  def 'Creating a greeting'() {
    expect: 'The greeting to be correctly capitalized'
    GreetingFormatter.greeting('gradlephant') == 'Hello, Gradlephant'
  }
}
